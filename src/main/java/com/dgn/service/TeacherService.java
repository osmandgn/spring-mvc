package com.dgn.service;

import com.dgn.domain.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> getAll();

    Teacher getById(Long id);
    void saveTeacher(Teacher teacher);
    void updateTeacher(Teacher teacher);
    void deleteTeacher(Long id);

}
