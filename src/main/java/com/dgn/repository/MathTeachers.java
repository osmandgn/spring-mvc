package com.dgn.repository;

import com.dgn.domain.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MathTeachers implements TeacherRepository {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Teacher> getAll() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        List<Teacher> teacherList = session.createQuery("From Teacher", Teacher.class).getResultList();

        tx.commit();
        session.close();

        return teacherList;

    }

    @Override
    public Optional<Teacher> findById(Long id) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Teacher teacher = session.get(Teacher.class, id);
        Optional<Teacher> optionalTeacher = Optional.ofNullable(teacher);

        tx.commit();
        session.close();
        return optionalTeacher;
    }

    @Override
    public void updateTeacher(Teacher teacher) {

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(teacher);
        tx.commit();
        session.close();

    }

    @Override
    public void saveTeacher(Teacher teacher) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.saveOrUpdate(teacher);

        tx.commit();
        session.close();


    }

    @Override
    public void deleteTeacher(Long id) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Teacher teacher = session.load(Teacher.class, id);
        session.delete(teacher);
        tx.commit();
        session.close();

    }
}
