package com.hao123.core.Repository;

import com.hao123.core.Entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author cvbnt
 */
@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity, Integer> {
    @Query(value = "select * from teacher where locate (?1,name) > 0", nativeQuery = true)
    List<TeacherEntity> search(String name);

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "update teacher set " +
            "schoolId=:#{#teacherEntity.schoolId}," +
            "teacherCode=:#{#teacherEntity.teacherCode}," +
            "avatar=:#{#teacherEntity.avatar}, " +
            "name=:#{#teacherEntity.name}, " +
            "sex=:#{#teacherEntity.sex}," +
            "title=:#{#teacherEntity.title}," +
            "subject=:#{#teacherEntity.subject}," +
            "phone=:#{#teacherEntity.phone}," +
            "startTeachDate=:#{#teacherEntity.startTeachDate}," +
            "createAt=:#{#teacherEntity.createAt}," +
            "updateAt=:#{#teacherEntity.updateAt} " +
            "where id=:#{#teacherEntity.id}", nativeQuery = true)
    void update(@Param("teacherEntity") TeacherEntity teacherEntity);

    int countById(@Param("teacherEntity") TeacherEntity teacherEntity);
}
