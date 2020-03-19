package com.ssh.dao.impl;

import com.ssh.dao.UserDao;
import com.ssh.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @Author: zengsm.
 * @Description:
 * @Date:Created in 2017/12/6 15:36.
 * @Modified By:
 */
@Repository("userDao")
public class UserDaoImpl extends HibernateDaoSupport implements UserDao
{
    /*sessionFactory依赖注入*/
//    @Resource(name="sessionFactory")
    //这里的属性名一定要和配置中的属性名一致
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<User> findAllUser()
    {
        Session session = sessionFactory.openSession();
        //将所有的数据查询出来并放到List集合里 User是表对应的实例名称
        List<User> list = session.createQuery("from User").list();
        session.close();
        return list;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int saveUserEntity(User user)
    {
        Session session = sessionFactory.openSession();
        //返回插入数据id
        Object id = session.save(user);
        session.close();
        return Integer.valueOf(id.toString());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveOrUpdateUserEntity(User user)
    {
        Session session = sessionFactory.openSession();
        session.saveOrUpdate(user);
        session.close();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateUserEntity(User user)
    {
        Session session = sessionFactory.openSession();
        session.update(user);
        session.close();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public User getUserByName(String name)
    {
//        Session session = sessionFactory.getCurrentSession();
        Session session = sessionFactory.openSession();
        //根据id查询,结果返回 User.class
//        User user = (User)session.get(User.class, 2);
        //将所有的数据查询出来并放到List集合里 User是表对应的实例名称
        List users = session.createQuery("from User where user_name='" + name + "'").list();
        session.close();
        return (User)users.get(0);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public User getUserByNo(String no)
    {
        Session session = sessionFactory.openSession();
        List users = session.createQuery("from User where user_no='" + no + "'").list();
        session.close();
        return (User)users.get(0);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteUserById(Integer id)
    {
        Session session = sessionFactory.openSession();
        String sql = "delete from User where id=:id";
        Query query = session.createQuery(sql);
        query.setParameter("id", id);
        query.executeUpdate();
        session.close();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteUserByNo(String no)
    {
        Session session = sessionFactory.openSession();
        String sql = "delete from User where user_no=:no";
        Query query = session.createQuery(sql);
        query.setParameter("no", no);
        query.executeUpdate();
        session.close();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteUserByEntity(User user)
    {
        Session session = sessionFactory.openSession();
        //传入实例对象，比较id删除对应行，，没有id匹配就不删除
        session.delete(User.class.getName(), user);
        session.close();
    }
}