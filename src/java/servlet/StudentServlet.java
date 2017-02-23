/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import db.StudentManager;
/**
 *
 * @author Administrator
 */
public class StudentServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        if(request.getRequestURI().endsWith("/deleteStudent")){
            doDeleteStudent(request,response);
        }else if(request.getRequestURI().endsWith("/addStudent")){
            doAddStudent(request,response);
        }else if(request.getRequestURI().endsWith("/updateStudent")){
            doUpdateStudent(request,response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    //删除学生信息
    private void doDeleteStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        String id = request.getParameter("id");
        StudentManager.deleteStudent(id);
        response.sendRedirect("index.jsp");
    }
    //添加学生信息
    private void doAddStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String sex = request.getParameter("sex");
        String major = request.getParameter("major");
        String college = request.getParameter("college");
        String introduction = request.getParameter("introduction");
        StudentManager.addStudent(id,name,new Integer(age),new Integer(sex),major,college,introduction);
        response.sendRedirect("index.jsp");
    }
    //修改学生信息
    private void doUpdateStudent(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
       String id = request.getParameter("id");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String sex = request.getParameter("sex");
        String major = request.getParameter("major");
        String college = request.getParameter("college");
        String introduction = request.getParameter("introduction");
        StudentManager.updateStudent(id,name,new Integer(age),new Integer(sex),major,college,introduction);
        response.sendRedirect("index.jsp");
    }

}
