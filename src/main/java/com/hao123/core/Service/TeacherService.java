package com.hao123.core.Service;

import com.hao123.core.Entity.TeacherEntity;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeacherService  {

    /**
     * @param page 页码
     * @return 条目列表
     */
    List<TeacherEntity> findAll(int page);

    /**
     * @return 返回全部信息
     */
    List<TeacherEntity> findAll();
    /**
     * @param name 名字
     * @return 返回搜索结果
     */
    List<TeacherEntity> search(String name);


    /**
     * @param teacherEntity 更新信息
     */
    void update(@Param("teacherEntity") TeacherEntity teacherEntity);

    /**
     * @return 返回所有条目数
     */
    Long count();

    void save(TeacherEntity teacherEntity);

    void deleteById(int id);

    void saveAndFlush(TeacherEntity teacherEntity);

    TeacherEntity findById(int id);
}
