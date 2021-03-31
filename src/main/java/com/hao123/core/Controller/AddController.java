package com.hao123.core.Controller;

import ch.qos.logback.classic.Logger;
import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Service.TeacherService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cvbnt
 */
@Controller
public class AddController {
    final Logger logger = (Logger) LoggerFactory.getLogger(AddController.class);
    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/pages/add")
    public String add() {
        logger.info("跳转添加页面");
        return "pages/add";
    }

    @RequestMapping("/pages/added")
    public String added(TeacherEntity teacherEntity) {
        teacherService.save(teacherEntity);
        logger.info("添加完成");
        return "redirect:/pages/list/1";
    }
    
}
