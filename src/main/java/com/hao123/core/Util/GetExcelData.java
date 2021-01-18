package com.hao123.core.Util;

import com.alibaba.excel.EasyExcel;
import com.hao123.core.Entity.ExcelData.TeacherData;
import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cvbnt
 */
@Component
public class GetExcelData {
    @Autowired
    private TeacherRepository teacherRepository;

    public GetExcelData(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<TeacherData> data(){
        List<TeacherData> list = new ArrayList<>();
        for (int i=1;i<teacherRepository.count()+1;i++){
            TeacherData teacherData = teacherRepository.findById(i).orElse(new TeacherEntity());
            list.add(teacherData);
        }
        return list;
    }
}
