package com.hao123.core.Controller;

import ch.qos.logback.classic.Logger;
import com.hao123.core.Repository.TeacherRepository;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeleteController {
    final Logger logger = (Logger) LoggerFactory.getLogger(DeleteController.class);
    private final TeacherRepository teacherRepository;

    public DeleteController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @RequestMapping("/pages/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        teacherRepository.deleteById(id);
        logger.info("删除成功");
        return "redirect:/pages/list";
    }
}
