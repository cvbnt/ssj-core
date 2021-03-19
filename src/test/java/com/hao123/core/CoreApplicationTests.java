package com.hao123.core;

import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Repository.TeacherRepository;
import jdk.nashorn.internal.runtime.options.Option;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

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

}