package com.ssh.service;

import com.ssh.model.User;
import com.ssh.model.Student;

import java.util.List;


/**
 * @Author: zengsm.
 * @Description:
 * @Date:Created in 2017/12/6 15:30.
 * @Modified By:
 */
public interface UserService
{
    List<User> findAllUser();

    int saveUserEntity(User user);

    boolean saveOrUpdateUserEntity(User user);

    boolean updateUserEntity(User user);

    User getUserByName(String name);

    User getUserByNo(String no);

    boolean deleteUserById(Integer id);

    boolean deleteUserByNo(String no);

    boolean deleteUserByEntity(User user);


    List<Student> findAllStudent();

    int saveStudentEntity(Student user);

    boolean saveOrUpdateStudentEntity(Student user);

    boolean updateStudentEntity(Student user);

    Student getStudentByName(String name);

    Student getStudentByNo(String no);

    boolean deleteStudentById(Integer id);

    boolean deleteStudentByNo(String no);

    boolean deleteStudentByEntity(Student user);
}
