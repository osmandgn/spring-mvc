package com.dgn.service;

import com.dgn.domain.Teacher;
import com.dgn.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MathTeachers implements TeacherService{

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.getAll();
    }

    @Override
    public Teacher getById(Long id) {
        return teacherRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    @Override
    public void saveTeacher(Teacher teacher) {
        teacherRepository.saveTeacher(teacher);
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        teacherRepository.updateTeacher(teacher);
    }

    @Override
    public void deleteTeacher(Long id) {
        teacherRepository.deleteTeacher(id);
    }
}
