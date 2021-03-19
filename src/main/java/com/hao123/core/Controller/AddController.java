package com.hao123.core.Controller;

import ch.qos.logback.classic.Logger;
import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Repository.TeacherRepository;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cvbnt
 */
@Controller
public class AddController {
    final Logger logger = (Logger) LoggerFactory.getLogger(AddController.class);
    private final TeacherRepository teacherRepository;
    public AddController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @RequestMapping("/pages/add")
    public String add() {
        logger.info("跳转添加页面");
        return "pages/add";
    }

    @RequestMapping("/pages/added")
    public String added(TeacherEntity teacherEntity) {
        teacherRepository.save(teacherEntity);
        logger.info("添加完成");
        return "redirect:/pages/list";
    }
    
}
