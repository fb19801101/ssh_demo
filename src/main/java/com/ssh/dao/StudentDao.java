package com.ssh.dao;

import com.ssh.model.Student;

import java.util.List;


/**
 * @Author: zengsm.
 * @Description:
 * @Date:Created in 2017/12/6 15:32.
 * @Modified By:
 */
public interface StudentDao
{
    List<Student> findAllStudent();

    int saveStudentEntity(Student student);

    void saveOrUpdateStudentEntity(Student student);

    void updateStudentEntity(Student student);

    Student getStudentByName(String name);

    Student getStudentByNo(String no);

    void deleteStudentById(Integer id);

    void deleteStudentByNo(String no);

    void deleteStudentByEntity(Student student);
}
