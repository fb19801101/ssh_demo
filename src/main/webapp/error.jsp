<%--
  Created by IntelliJ IDEA.
  User: zengsm
  Date: 2017/12/7
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<html>
    <head>
        <title>ERROR</title>
    </head>
    <body>
        <h1>登录失败！</h1><br>
        登录名称：<%=request.getParameter("username")%><br>
        登录密码：<%=request.getParameter("password")%><br>

        <hr>
        <div>
            <h1>查询结果:</h1><br>
            <%--需要建立对应的界面JavaBean，后台传入对象实例--%>
            消息：<input value=${message}><br>
            名字：<input value=${user.user_name}><br>
            密码：<input value=${user.user_pwd}><br>
            性别：<input value=${user.user_sex}><br>
            编号：<input value=${user.user_no}><br>
            生日：<input value=${user.user_birth}><br>
            班级：<input value=${user.user_class}><br>
            <hr>
            <h1>ResultJson:</h1><br>
            <span>${resultJson}</span>
        </div>
    </body>
</html>
