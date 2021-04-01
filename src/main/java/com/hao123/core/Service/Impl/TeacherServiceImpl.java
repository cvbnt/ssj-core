package com.hao123.core.Service.Impl;

import com.hao123.core.Entity.TeacherEntity;
import com.hao123.core.Enum.PageEnum;
import com.hao123.core.Repository.TeacherRepository;
import com.hao123.core.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private TeacherService teacherService;
    @Override
    public List<TeacherEntity> findAll(int page) {
        Pageable pageable = PageRequest.of(page-1, PageEnum.NormalPageSize.getNumber());
        Page<TeacherEntity> teacherPage = teacherRepository.findAll(pageable);
        return teacherPage.getContent();
    }

    @Override
    public List<TeacherEntity> findAll() {
        return teacherRepository.findAll();
    }


    @Override
    public List<TeacherEntity> search(String name) {
        return teacherRepository.search(name);
    }

    @Override
    public void update(@Param("teacherEntity") TeacherEntity teacherEntity) {
        teacherRepository.update(teacherEntity);
    }

    @Override
    public Long count() {
        return teacherRepository.count();
    }

    @Override
    public void save(TeacherEntity teacherEntity) {
        teacherRepository.save(teacherEntity);
    }

    @Override
    public void deleteById(int id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public void saveAndFlush(TeacherEntity teacherEntity) {
        teacherRepository.saveAndFlush(teacherEntity);
    }

    @Override
    public TeacherEntity findById(int id) {
        return teacherRepository.findById(id).orElse(new TeacherEntity());
    }


}
