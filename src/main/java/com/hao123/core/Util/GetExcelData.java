package com.hao123.core.Util;

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

    public List<TeacherEntity> data(){
        List<TeacherEntity> list = new ArrayList<>();
        for (int i=1;i<teacherRepository.count()+1;i++){
            TeacherEntity teacherEntity = teacherRepository.findById(i).orElse(new TeacherEntity());
            list.add(teacherEntity);
        }
        return list;
    }
}
