package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.*;
import java.util.*;

public final class viewStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>查看学生信息</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String id = request.getParameter("id");
            Student student =StudentManager.getStudent(id);
        
      out.write("\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <table width=\"500\" cellpadding=\"1\" cellspacing=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"9\" align=\"center\" class=\"title\" height=\"30\">学生信息</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr height=\"30\">\n");
      out.write("                    <td align=\"center\" class=\"header\" width=\"100\">学号：</td>\n");
      out.write("                    <td align=\"center\" class=\"date\">");
      out.print(student.getId());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr height=\"30\">\n");
      out.write("                    <td align=\"center\" class=\"header\" width=\"100\">姓名：</td>\n");
      out.write("                    <td align=\"center\" class=\"date\">");
      out.print(student.getName());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr height=\"30\">\n");
      out.write("                    <td align=\"center\" class=\"header\" width=\"100\">年龄：</td>\n");
      out.write("                    <td align=\"center\" class=\"date\">");
      out.print(student.getAge());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr height=\"30\">\n");
      out.write("                    <td align=\"center\" class=\"header\" width=\"100\">性别：</td>\n");
      out.write("                    <td align=\"center\" class=\"date\">");
      out.print(student.getSex()==1?"男":"女");
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr height=\"30\">\n");
      out.write("                    <td align=\"center\" class=\"header\" width=\"100\">专业：</td>\n");
      out.write("                    <td align=\"center\" class=\"date\">");
      out.print(student.getMajor());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr height=\"30\">\n");
      out.write("                    <td align=\"center\" class=\"header\" width=\"100\">学院：</td>\n");
      out.write("                    <td align=\"center\" class=\"date\">");
      out.print(student.getCollege());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr height=\"30\">\n");
      out.write("                    <td align=\"center\" class=\"header\" width=\"100\">简介：</td>\n");
      out.write("                    <td align=\"center\" class=\"date\">");
      out.print(student.getIntroduction());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
