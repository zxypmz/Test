<%-- 
    Document   : updateStudent
    Created on : 2017-2-20, 15:33:30
    Author     : Administrator
--%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="db.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="style.css" rel="stylesheet" type="text/css">
        
        <title>查看学生信息</title>
    </head>
    <body>
        <%
            String id=request.getParameter("id");
            Student student = StudentManager.getStudent(id);
        %>
        <div align="center">
            <form action="updateStudent" method="post">
                <table width="500" cellpadding="1" cellspacing="1">
                    <tr>
                        <td colspan="9" align="center" class="title" height="30">学生信息</td>
                    </tr>
                    <tr height="30">
                        <td align="center" class="header">学号：</td>
                        <td align="center" class="data"><input name="id" value="<%=student.getId()%>" readonly></td>
                    </tr>
                    <tr height="30">
                        <td align="center" class="header">姓名：</td>
                        <td align="center" class="data"><input name="name" value="<%=student.getName()%>"></td>
                    </tr>
                    <tr height="30">
                        <td align="center" class="header">年龄：</td>
                        <td align="center" class="data"><input name="age" value="<%=student.getAge()%>"></td>
                    </tr>
                    <tr height="30">
                        <td align="center" class="header">性别：</td>
                        <td align="center" class="data"><select name="sex"> 
                                <%
                                    if(student.getSex()==1){
                                        
                                        out.print("<option value=\"1\" checked>男</option>");
                                        out.print("<option value=\"0\">女</option>");
                                    }else{
                                        out.print("<option value=\"1\">男</option>");
                                        out.print("<option value=\"0\" checked>女</option>");
                                    }
                                %>
                            </select> </td>
                    </tr>
                    <tr height="30">
                        <td align="center" class="header">专业：</td>
                        <td align="center" class="data"><input name="major" value="<%=student.getMajor()%>"></td>
                    </tr>
                    <tr height="30">
                        <td align="center" class="header">学院：</td>
                        <td align="center" class="data"><input name="college" value="<%=student.getCollege()%>"></td>
                    </tr>
                    <tr height="30">
                        <td align="center" class="header">简介：</td>
                        <td align="center" class="data"><input name="introduction" value="<%=student.getIntroduction()%>"></td>
                    </tr>
                    
                </table>
                <input type="submit" value="提交">
            </form>
        </div>
    </body>
</html>
