/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.50
 * Generated at: 2018-08-11 07:42:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");

	String contextPath = request.getContextPath();
	String serverName = request.getServerName();
	int port = request.getServerPort();
	String baseUrl = "http://" + serverName + ":" + port + contextPath + "/";

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>用户登录</title>\r\n");
      out.write("<link href=\"");
      out.print(baseUrl);
      out.write("css/style.css\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\tmedia=\"all\" />\r\n");
      out.write("<link href=\"");
      out.print(baseUrl);
      out.write("css/bootstrap.min.css\" type=\"text/css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(baseUrl);
      out.write("js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(baseUrl);
      out.write("js/bootstrap.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar __links = document.querySelectorAll('a');\r\n");
      out.write("\tfunction __linkClick(e) {\r\n");
      out.write("\t\tparent.window.postMessage(this.href, '*');\r\n");
      out.write("\t};\r\n");
      out.write("\tfor (var i = 0, l = __links.length; i < l; i++) {\r\n");
      out.write("\t\tif (__links[i].getAttribute('data-t') == '_blank') {\r\n");
      out.write("\t\t\t__links[i].addEventListener('click', __linkClick, false);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tvar LOGIN = {\r\n");
      out.write("\t\tcheckData : function() {\r\n");
      out.write("\t\t\t//alert(\"checkData start\");\r\n");
      out.write("\t\t\tif ($('#loginName').val() == '用户名') {\r\n");
      out.write("\t\t\t\talert(\"用户名不能为空\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif ($('#loginPwd').val() == '密码') {\r\n");
      out.write("\t\t\t\talert(\"密码不能为空\")\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tdoLogin : function() {\r\n");
      out.write("\t\t\t//alert(\"doLogin start\");\r\n");
      out.write("\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login\", $('#formlogin').serialize(), function(data) {\r\n");
      out.write("\t\t\t\t//alert(data.username);\r\n");
      out.write("\t\t\t\tif (data.accoutType == 0) {\r\n");
      out.write("\t\t\t\t\tlocation.href = \"http://172.16.2.9:8080/anim-console/index\";\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tlocation.href = \"/\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tlogin : function() {\r\n");
      out.write("\t\t\tif (this.checkData()) {\r\n");
      out.write("\t\t\t\tthis.doLogin();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('#loginsubmit').click(function() {\r\n");
      out.write("\t\t\t//alert(\"start login\");\r\n");
      out.write("\t\t\tLOGIN.login();\r\n");
      out.write("\t\t})\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- contact-form -->\r\n");
      out.write("\t<div class=\"message warning\">\r\n");
      out.write("\t\t<div class=\"inset\">\r\n");
      out.write("\t\t\t<div class=\"login-head\">\r\n");
      out.write("\t\t\t\t<h1>用户登录</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<form id=\"formlogin\" method=\"post\" onsubmit=\"return false;\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><input type=\"text\" class=\"text\" name=\"username\"\r\n");
      out.write("\t\t\t\t\t\tid=\"loginName\" value=\"用户名\" onfocus=\"this.value = '';\"\r\n");
      out.write("\t\t\t\t\t\tonblur=\"if (this.value == '') {this.value = '用户名';}\"><a\r\n");
      out.write("\t\t\t\t\t\tclass=\" icon user\" onclick=\"clearName()\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><input type=\"password\" value=\"*******\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\tid=\"loginPwd\" onfocus=\"this.value = '';\"\r\n");
      out.write("\t\t\t\t\t\tonblur=\"if (this.value == '') {this.value = '';}\"> <a\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon lock\" onclick=\"clearPwd()\"></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div class=\"submit\">\r\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-default btn-md\" id=\"loginsubmit\"><span\r\n");
      out.write("\t\t\t\t\t\tstyle=\"font-size: 20px\">登 录</span></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!--- footer --->\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t<p>Copyright &copy; 广东阳光视界教育科技有限公司-动画部 2018</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}