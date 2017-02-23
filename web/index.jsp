<%-- 
    Document   : index
    Created on : 2017-2-20, 15:32:44
    Author     : Administrator
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="db.*" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="http://www.bootcss.com/" >
        <link href="style.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>学生管理系统</title>
    </head>
    <body>
        <div align="center">
           <table width="600" cellpadding="1" cellspacing="1">
               <tr>
                   <td colspan="9" align="right" height="30">
                       <a href="addStudent.jsp"><button type="button" class="btn btn-info btn-block"><h1>添加学生</h1></button></a>
                   </td>
               </tr>
           </table>
         <table width="600" cellpadding="1" cellspacing="1">
               <tr height="100" bgcolor="blue">
                   <td colspan="9" align="center" class="title" height="30">
                       <h2 ><font color="red">全部学生信息</font></h2>
                   </td>
               </tr>
               <tr height="50"color="white" >
                   <td align="center" width="100" class="header">
                       <font color="red" > 学号</font>
                   </td>
                   <td align="center" width="100" class="header">
                       姓名
                   </td>
                   <td align="center" width="100" class="header">
                       年龄
                   </td>
                   <td align="center" width="100" class="header">
                       性别
                   </td>
                   <td align="center" width="100" class="header">
                       专业
                   </td>
                   <td align="center" width="100" class="header">
                       学院
                   </td>
                   <td align="center"  colspan="3" class="header">
                       操作
                   </td>
                </tr>
                <%
                    ArrayList<Student> students=StudentManager.getAllStudents();
                    
                    for(Student student:students)
                    {
                %>
                <tr height="20" width="100" bgcolor="white">
                    <td align="center" class="data">
                        <%=student.getId()%>
                    </td>
                    <td align="center" width="100" class="data">
                        <%=student.getName() %>     
                    </td>
                    <td align="center" width="100" class="data">
                        <%=student.getAge() %>     
                    </td>
                    <td align="center" width="100" class="data">
                        <%=student.getSex()==1?"男":"女" %>     
                    </td>
                    <td align="center" width="100" class="data">
                        <%=student.getMajor() %>     
                    </td>
                    <td align="center" width="100" class="data">
                        <%=student.getCollege() %>     
                    </td>
                    <td align="center" class="data">
                        <a href="viewStudent.jsp?id=<%=student.getId()%>">
                            <button class="button button-highlight button-pill button-large">查看</button></a>      
                  </td>
                    <td align="center" class="data">
                        <a href="updateStudent.jsp?id=<%=student.getId()%>"><button class="button button-highlight button-pill button-large">修改</button></a>      
                  </td>
                    <td align="center" class="data">
                        <a href="deleteStudent?id=<%=student.getId()%>"><button class="button button-highlight button-pill button-large">删除</button></a>     
                    </td>

                </tr>
                <%
                 }
                %>
           </table>
        </div>
    </body>
</html>
