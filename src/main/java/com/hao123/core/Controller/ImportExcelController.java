package com.hao123.core.Controller;

import ch.qos.logback.classic.Logger;
import com.alibaba.excel.EasyExcel;
import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Lisenter.ReadExcelListener;
import com.hao123.core.Repository.TeacherRepository;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class ImportExcelController {
    final Logger logger = (Logger) LoggerFactory.getLogger(ImportExcelController.class);
    private final TeacherRepository teacherRepository;

    public ImportExcelController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @RequestMapping("/pages/importexcel")
    public String inputExcel(MultipartFile file)throws IOException{
        EasyExcel.read(file.getInputStream(), TeacherEntity.class,new ReadExcelListener(teacherRepository)).sheet().doRead();
        logger.info("导入成功");
        return "redirect:/pages/list";
    }
}
