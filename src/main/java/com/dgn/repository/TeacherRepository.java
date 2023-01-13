package com.dgn.repository;

import com.dgn.domain.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherRepository {

    List<Teacher> getAll();
    Optional<Teacher> findById(Long id);
    void updateTeacher(Teacher teacher);
    void saveTeacher(Teacher teacher);
    void deleteTeacher(Long id);



}
