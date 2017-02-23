<%-- 
    Document   : addStudent
    Created on : 2017-2-20, 15:33:12
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
        <title>添加学生信息</title>
    </head>
    <body>
        <div align="center">
            <form action="addStudent" method="post">
                <table width="500" cellpadding="1" cellspacing="1">
                    <tr heigt="30">
                        <td align="center" class="header">学号：</td>
                        <td align="center" class="date"><input name="id"></td>
                    </tr>
                    <tr heigt="30">
                        <td align="center" class="header">姓名：</td>
                        <td align="center" class="date"><input name="name"></td>
                    </tr>
                    <tr heigt="30">
                        <td align="center" class="header">年龄：</td>
                        <td align="center" class="date"><input name="age"></td>
                    </tr>
                    <tr heigt="30">
                        <td align="center" class="header">性别：</td>
                        <td align="center" class="date"><select name="sex">
                                <option value="1">男</option>
                                <option value="0">女</option>
                            </select></td>
                    </tr>
                    <tr heigt="30">
                        <td align="center" class="header">专业：</td>
                        <td align="center" class="date"><input name="major"></td>
                    </tr>
                    <tr heigt="30">
                        <td align="center" class="header">学院：</td>
                        <td align="center" class="date"><input name="college"></td>
                    </tr>
                    <tr heigt="30">
                        <td align="center" class="header">简介：</td>
                        <td align="left" class="date"><textarea row="10" cols="50" name="introduction">
                            </textarea></td>
                    </tr>
                </table>
                <input type="submit" value="提交"></form>
        </div>
    </body>
</html>
