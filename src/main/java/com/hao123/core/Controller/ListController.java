package com.hao123.core.Controller;

import ch.qos.logback.classic.Logger;
import com.google.common.flogger.FluentLogger;
import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Repository.TeacherRepository;
import com.hao123.core.Service.TeacherService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class ListController {
    private static final FluentLogger fLogger = FluentLogger.forEnclosingClass();
    final Logger logger = (Logger) LoggerFactory.getLogger(ListController.class);
    private final TeacherRepository teacherRepository;

    @Autowired
    private TeacherService teacherService;

    public ListController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
    @RequestMapping("/")
    public String index() {
        logger.info("登录页面");
        fLogger.atInfo().log("Log message with: %s");
        return "login";
    }

    @RequestMapping("/login")
    public String list(String username, String password, Model model) {
        Subject subject = SecurityUtils.getSubject();
        //        封装用户登陆数据
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
//        执行登录,没有异常则OK
        try {
            subject.login(token);
            logger.info("登录成功");
            return "redirect:/pages/list/1";
        } catch (UnknownAccountException e) {
            model.addAttribute("msg", "用户名不存在");
            logger.info("用户名不存在");
            return "/login";
        } catch (IncorrectCredentialsException e) {
            model.addAttribute("msg", "密码错误");
            logger.info("密码错误");
            return "/login";
        }
    }

    @RequestMapping("/pages/list/{page}")
    public String list(@PathVariable("page") int page, Model model) {
        if (page<=0){
            page=1;
        }
        List<TeacherEntity> list = teacherService.findAll(page);
        Long count=teacherService.count();
        model.addAttribute("listKey", list);
        model.addAttribute("count",count);
        return "pages/list";
    }
}
