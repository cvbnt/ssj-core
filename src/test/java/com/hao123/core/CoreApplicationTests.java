package com.hao123.core;

import com.alibaba.excel.EasyExcel;
import com.hao123.core.Entity.ExcelData.TeacherData;
import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Repository.TeacherRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
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
    void name() {
        String fileName = System.currentTimeMillis() + ".xlsx";
        EasyExcel.write(fileName, TeacherData.class).sheet("模板").doWrite(data());
    }

    private List<TeacherData> data(){
        List<TeacherData> list = new ArrayList<>();
        for (long i=0;i<teacherRepository.count();i++){
            TeacherData teacherData = teacherRepository.findById(Math.toIntExact(i)).orElse(new TeacherEntity());
            list.add(teacherData);
        }
        return list;
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
