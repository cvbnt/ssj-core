package com.hao123.core.Controller;

import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Repository.TeacherRepository;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class ListController {

    private final TeacherRepository teacherRepository;

    public ListController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @RequestMapping("/")
    public String index() {
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
            return "redirect:/pages/list";
        } catch (UnknownAccountException e) {
            model.addAttribute("msg", "用户名不存在");
            return "/login";
        } catch (IncorrectCredentialsException e) {
            model.addAttribute("msg", "密码错误");
            return "/login";
        }
    }

    @RequestMapping("/pages/list")
    public String list(Model model) {
        List<TeacherEntity> list = teacherRepository.findAll();
        model.addAttribute("listKey", list);
        return "pages/list";
    }
}
