package com.hao123.core.Controller;

import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Repository.TeacherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cvbnt
 */
@Controller
public class AddController {
    private final TeacherRepository teacherRepository;

    public AddController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @RequestMapping("/pages/add")
    public String add() {
        return "pages/add";
    }

    @RequestMapping("/pages/added")
    public String added(TeacherEntity teacherEntity) {
        teacherRepository.save(teacherEntity);
        return "redirect:/pages/list";
    }
}
