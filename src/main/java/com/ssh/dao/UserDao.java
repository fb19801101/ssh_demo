package com.ssh.dao;

import com.ssh.model.User;

import java.util.List;


/**
 * @Author: zengsm.
 * @Description:
 * @Date:Created in 2017/12/6 15:32.
 * @Modified By:
 */
public interface UserDao
{
    List<User> findAllUser();

    int saveUserEntity(User user);

    void saveOrUpdateUserEntity(User user);

    void updateUserEntity(User user);

    User getUserByName(String name);

    User getUserByNo(String no);

    void deleteUserById(Integer id);

    void deleteUserByNo(String no);

    void deleteUserByEntity(User user);
}
