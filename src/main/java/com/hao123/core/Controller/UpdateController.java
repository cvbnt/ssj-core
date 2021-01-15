package com.hao123.core.Controller;

import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Repository.TeacherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cvbnt
 */
@Controller
public class UpdateController {
    private final TeacherRepository teacherRepository;

    public UpdateController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @RequestMapping("/pages/update/{id}")
    public String update(@PathVariable("id") int id, Model model) {
        TeacherEntity teacherEntity = teacherRepository.findById(id).orElse(new TeacherEntity());
        model.addAttribute("updateKey", teacherEntity);
        return "pages/update";
    }

    @RequestMapping("/pages/updated")
    public String update(TeacherEntity teacherEntity) {
        teacherRepository.saveAndFlush(teacherEntity);
        return "redirect:/pages/list";
    }
}
