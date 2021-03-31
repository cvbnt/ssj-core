package com.hao123.core.Controller;

import ch.qos.logback.classic.Logger;
import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Service.TeacherService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {
    final Logger logger = (Logger) LoggerFactory.getLogger(SearchController.class);
    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/pages/search")
    public String search(@RequestParam("name") String name, Model model) {
        List<TeacherEntity> list = teacherService.search(name);
        if (null == list || list.size() == 0) {
            list = teacherService.findAll();
            model.addAttribute("error", "未查到教师");
            logger.info("未查到教师");
        }
        model.addAttribute("searchKey", list);
        logger.info("搜索成功");
        return "pages/list_search";
    }
}
