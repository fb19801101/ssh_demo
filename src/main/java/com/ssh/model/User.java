package com.ssh.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * @Author: zengsm.
 * @Description:
 * @Date:Created in 2017/12/6 15:19.
 * @Modified By:
 */
@Entity
@Table(name = "tb_student")
public class User implements Serializable
{
    private static final long serialVersionUID = 2313421496945642L;

    private int id;

    private String user_no;

    private String user_name;

    private String user_pwd;

    private String user_sex;

    private Date user_birth;

    private String user_class;

    private Date date_create;

    private Date date_update;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUser_no()
    {
        return user_no;
    }

    public void setUser_no(String user_no)
    {
        this.user_no = user_no;
    }

    public String getUser_name()
    {
        return user_name;
    }

    public void setUser_name(String user_name)
    {
        this.user_name = user_name;
    }

    public String getUser_pwd()
    {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd)
    {
        this.user_pwd = user_pwd;
    }

    public String getUser_sex()
    {
        return user_sex;
    }

    public void setUser_sex(String user_sex)
    {
        this.user_sex = user_sex;
    }

    public Date getUser_birth()
    {
        return user_birth;
    }

    public void setUser_birth(Date user_birth)
    {
        this.user_birth = user_birth;
    }

    public String getUser_class()
    {
        return user_class;
    }

    public void setUser_class(String user_class)
    {
        this.user_class = user_class;
    }

    public Date getDate_create()
    {
        return date_create;
    }

    public void setDate_create(Date date_create)
    {
        this.date_create = date_create;
    }

    public Date getDate_update()
    {
        return date_update;
    }

    public void setDate_update(Date date_update)
    {
        this.date_update = date_update;
    }
}
