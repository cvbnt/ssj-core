package com.hao123.core;

import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Repository.TeacherRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class CoreApplicationTests {
    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    void contextLoads() {
        Pageable pageable = PageRequest.of(0, 5,Sort.by(Sort.Direction.DESC, "id"));
        Page<TeacherEntity> page = teacherRepository.findAll(pageable);
        List<TeacherEntity> list = page.getContent();
        for (TeacherEntity t:list){
            System.out.println(t);
        }
    }

}