package com.hao123.core.Controller;

import ch.qos.logback.classic.Logger;
import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Repository.TeacherRepository;
import org.slf4j.LoggerFactory;
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
    private final TeacherRepository teacherRepository;

    public UpdateController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @RequestMapping("/pages/update/{id}")
    public String update(@PathVariable("id") int id, Model model) {
        TeacherEntity teacherEntity = teacherRepository.findById(id).orElse(new TeacherEntity());
        model.addAttribute("updateKey", teacherEntity);
        logger.info("更新页面");
        return "pages/update";
    }

    @RequestMapping("/pages/updated")
    public String update(TeacherEntity teacherEntity) {
        teacherRepository.saveAndFlush(teacherEntity);
        logger.info("更新成功");
        return "redirect:/pages/list";
    }
}
