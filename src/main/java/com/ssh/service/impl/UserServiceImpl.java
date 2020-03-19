package com.ssh.service.impl;

import com.ssh.dao.StudentDao;
import com.ssh.dao.UserDao;
import com.ssh.model.Student;
import com.ssh.model.User;
import com.ssh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @Author: zengsm.
 * @Description:
 * @Date:Created in 2017/12/6 15:31.
 * @Modified By:
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAllUser()
    {
        List<User> allUser = userDao.findAllUser();
        return allUser;
    }

    @Override
    public int saveUserEntity(User user)
    {
        int id = userDao.saveUserEntity(user);
        return id;
    }

    @Override
    public boolean saveOrUpdateUserEntity(User user)
    {
        try
        {
            userDao.saveOrUpdateUserEntity(user);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateUserEntity(User user)
    {
        try
        {
            userDao.updateUserEntity(user);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public User getUserByName(String name)
    {
        try
        {
            User user = userDao.getUserByName(name);
            return user;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public User getUserByNo(String no)
    {
        try
        {
            User user = userDao.getUserByNo(no);
            return user;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean deleteUserById(Integer id)
    {
        try
        {
            userDao.deleteUserById(id);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteUserByNo(String no)
    {
        try
        {
            userDao.deleteUserByNo(no);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteUserByEntity(User user)
    {
        try
        {
            userDao.deleteUserByEntity(user);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }


    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> findAllStudent()
    {
        List<Student> allStudent = studentDao.findAllStudent();
        return allStudent;
    }

    @Override
    public int saveStudentEntity(Student student)
    {
        int id = studentDao.saveStudentEntity(student);
        return id;
    }

    @Override
    public boolean saveOrUpdateStudentEntity(Student student)
    {
        try
        {
            studentDao.saveOrUpdateStudentEntity(student);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateStudentEntity(Student student)
    {
        try
        {
            studentDao.updateStudentEntity(student);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Student getStudentByName(String name)
    {
        try
        {
            Student student = studentDao.getStudentByName(name);
            return student;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Student getStudentByNo(String no)
    {
        try
        {
            Student student = studentDao.getStudentByNo(no);
            return student;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean deleteStudentById(Integer id)
    {
        try
        {
            studentDao.deleteStudentById(id);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteStudentByNo(String no)
    {
        try
        {
            studentDao.deleteStudentByNo(no);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteStudentByEntity(Student student)
    {
        try
        {
            studentDao.deleteStudentByEntity(student);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
