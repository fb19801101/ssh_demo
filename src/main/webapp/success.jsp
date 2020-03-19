<%--
  Created by IntelliJ IDEA.
  User: zengsm
  Date: 2017/12/8
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
    <head>
        <title>SUCCESS</title>
    </head>

    <body>
        <h1>登录成功！</h1><br>
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

        <hr>
        <div>
            <h1>DataBase.tb_student:</h1><br>
            <%
                String[] cols = new String[]{"id","user_no","user_name","user_pwd","user_sex","user_birth","user_class","date_create","date_update"};
            %>
            <table bgcolor="#9999dd" border="1" align="center" width="100%">
                <tr>
                <c:forEach items="<%=cols%>" var="col">
                    <th>${col}</th>
                </c:forEach>
                </tr>
                <c:forEach items="${users}" var="item">
                <tr>
                    <td align="center" width="5%">${item.id}</td>
                    <td  align="center" width="9%">${item.user_no}</td>
                    <td  align="center" width="10%">${item.user_name}</td>
                    <td  align="center" width="10%">${item.user_pwd}</td>
                    <td  align="center" width="10%">${item.user_sex}</td>
                    <td align="center" width="10%"><fmt:formatDate value="${item.user_birth}"  type="date"/></td>
                    <td  align="center" width="10%">${item.user_class}</td>
                    <td align="right" width="18%"><fmt:formatDate value="${item.date_create}"  type="both"/></td>
                    <td align="right" width="18%"><fmt:formatDate value="${item.date_update}"  type="both"/></td>
                </tr>
                </c:forEach>
            </table>
        </div>

        <hr>
        <div>
            <h1>System.out.println:</h1><br>
            <%
                out.println(request.getAttribute("resultJson") + "<br/>");
                Enumeration en = request.getAttributeNames();
                while (en.hasMoreElements())
                {
                    out.println(en.nextElement() + "<br/>");
                }
                out.println(response + "<br/>");
            %>
            <script type="text/javascript">
            </script>
        </div>
    </body>
</html>
