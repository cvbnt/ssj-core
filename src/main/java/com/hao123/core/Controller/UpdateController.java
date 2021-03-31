package com.hao123.core.Controller;

import ch.qos.logback.classic.Logger;
import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Service.TeacherService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cvbnt
 */
@Controller
public class UpdateController {
    final Logger logger = (Logger) LoggerFactory.getLogger(UpdateController.class);
    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/pages/update/{id}")
    public String update(@PathVariable("id") int id, Model model) {
        TeacherEntity teacherEntity = teacherService.findById(id);
        model.addAttribute("updateKey", teacherEntity);
        logger.info("更新页面");
        return "pages/update";
    }

    @RequestMapping("/pages/updated")
    public String update(TeacherEntity teacherEntity) {
        teacherService.saveAndFlush(teacherEntity);
        logger.info("更新成功");
        return "redirect:/pages/list/1";
    }
}
