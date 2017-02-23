<%-- 
    Document   : newjspviewStudent
    Created on : 2017-2-20, 15:33:42
    Author     : Administrator
--%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="db.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="style.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>查看学生信息</title>
    </head>
    <body>
        <%
            String id = request.getParameter("id");
            Student student =StudentManager.getStudent(id);
        %>
        <div align="center">
            <table width="500" cellpadding="1" cellspacing="1">
                <tr>
                    <td colspan="9" align="center" class="title" height="30">学生信息</td>
                </tr>
                <tr height="30">
                    <td align="center" class="header" width="100">学号：</td>
                    <td align="center" class="date"><%=student.getId()%></td>
                </tr>
                <tr height="30">
                    <td align="center" class="header" width="100">姓名：</td>
                    <td align="center" class="date"><%=student.getName()%></td>
                </tr>
                <tr height="30">
                    <td align="center" class="header" width="100">年龄：</td>
                    <td align="center" class="date"><%=student.getAge()%></td>
                </tr>
                <tr height="30">
                    <td align="center" class="header" width="100">性别：</td>
                    <td align="center" class="date"><%=student.getSex()==1?"男":"女"%></td>
                </tr>
                <tr height="30">
                    <td align="center" class="header" width="100">专业：</td>
                    <td align="center" class="date"><%=student.getMajor()%></td>
                </tr>
                <tr height="30">
                    <td align="center" class="header" width="100">学院：</td>
                    <td align="center" class="date"><%=student.getCollege()%></td>
                </tr>
                <tr height="30">
                    <td align="center" class="header" width="100">简介：</td>
                    <td align="center" class="date"><%=student.getIntroduction()%></td>
                </tr>
            </table>
                <a href="index.jsp">返回</a>
        </div>
    </body>
</html>
