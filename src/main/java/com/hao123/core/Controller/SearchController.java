package com.hao123.core.Controller;

import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Repository.TeacherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {
    private final TeacherRepository teacherRepository;

    public SearchController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @RequestMapping("/pages/search")
    public String search(@RequestParam("name") String name, Model model) {
        List<TeacherEntity> list = teacherRepository.search(name);
        if (null == list || list.size() == 0) {
            list = teacherRepository.findAll();
            model.addAttribute("error", "未查到教师");
        }
        model.addAttribute("searchKey", list);
        return "pages/list_search";
    }
}
