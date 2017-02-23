package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.*;
import java.util.*;

public final class addStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>添加学生信息</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <form action=\"addStudent\" method=\"post\">\n");
      out.write("                <table width=\"500\" cellpadding=\"1\" cellspacing=\"1\">\n");
      out.write("                    <tr heigt=\"30\">\n");
      out.write("                        <td align=\"center\" class=\"header\">学号：</td>\n");
      out.write("                        <td align=\"center\" class=\"date\"><input name=\"id\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr heigt=\"30\">\n");
      out.write("                        <td align=\"center\" class=\"header\">姓名：</td>\n");
      out.write("                        <td align=\"center\" class=\"date\"><input name=\"name\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr heigt=\"30\">\n");
      out.write("                        <td align=\"center\" class=\"header\">年龄：</td>\n");
      out.write("                        <td align=\"center\" class=\"date\"><input name=\"age\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr heigt=\"30\">\n");
      out.write("                        <td align=\"center\" class=\"header\">性别：</td>\n");
      out.write("                        <td align=\"center\" class=\"date\"><select name=\"sex\">\n");
      out.write("                                <option value=\"1\">男</option>\n");
      out.write("                                <option value=\"0\">女</option>\n");
      out.write("                            </select></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr heigt=\"30\">\n");
      out.write("                        <td align=\"center\" class=\"header\">专业：</td>\n");
      out.write("                        <td align=\"center\" class=\"date\"><input name=\"major\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr heigt=\"30\">\n");
      out.write("                        <td align=\"center\" class=\"header\">学院：</td>\n");
      out.write("                        <td align=\"center\" class=\"date\"><input name=\"college\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr heigt=\"30\">\n");
      out.write("                        <td align=\"center\" class=\"header\">简介：</td>\n");
      out.write("                        <td align=\"left\" class=\"date\"><textarea row=\"10\" cols=\"50\" name=\"introduction\">\n");
      out.write("                            </textarea></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <input type=\"submit\" value=\"提交\"></form>\n");
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
