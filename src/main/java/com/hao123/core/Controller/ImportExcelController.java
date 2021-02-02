package com.hao123.core.Controller;

import com.alibaba.excel.EasyExcel;
import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Lisenter.ReadExcelListener;
import com.hao123.core.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class ImportExcelController {
    @Autowired
    private TeacherRepository teacherRepository;
    @RequestMapping("/pages/importexcel")
    public String inputExcel(MultipartFile file)throws IOException{
        EasyExcel.read(file.getInputStream(), TeacherEntity.class,new ReadExcelListener(teacherRepository)).sheet().doRead();
        return "redirect:/pages/list";
    }
}
