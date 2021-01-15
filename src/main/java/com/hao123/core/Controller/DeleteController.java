package com.hao123.core.Controller;

import com.hao123.core.Repository.TeacherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeleteController {
    private final TeacherRepository teacherRepository;

    public DeleteController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @RequestMapping("/pages/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        teacherRepository.deleteById(id);
        return "redirect:/pages/list";
    }
}
