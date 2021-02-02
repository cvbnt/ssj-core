package com.hao123.core;

import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Repository.TeacherRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CoreApplicationTests {
    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    void contextLoads() {
        List<TeacherEntity> list = teacherRepository.search("张");
        for (TeacherEntity t : list) {
            System.out.println(t);
        }
    }

    @Test
    void test() {
        TeacherEntity teacherEntity = teacherRepository.findById(13).orElse(new TeacherEntity());
//        teacherEntity.setSex("男");
        teacherEntity.setSex("女");
        teacherRepository.update(teacherEntity);
    }

    @Test
    void list() {
        TeacherEntity teacherEntity = teacherRepository.findById(3).orElse(new TeacherEntity());
        teacherEntity.setName("你好");
        teacherRepository.update(teacherEntity);
    }




    @Test
    void name2() {
        long count = teacherRepository.count();
        for (int i=1;i<count;i++){
            TeacherEntity teacherEntity = teacherRepository.findById(i).orElse(new TeacherEntity());
            System.out.println(teacherEntity.getName());
        }
    }
}
