package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"us\">\n");
      out.write("<head>\n");
      out.write("    <title>Mobile Passenger Registration System (pre-alpha)</title>\n");
      out.write("    <meta name=\"language\" content=\"English\" />\n");
      out.write("    <meta name=\"copyright\" content=\"Golovko Igor (c) 2011\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/main.css\" type=\"text/css\" />\n");
      out.write("    <!--[if IE]>\n");
      out.write("        <script src=\"js/html5.js\"></script><![endif]-->\n");
      out.write("    <!--[if lte IE 8]>\n");
      out.write("\t<script src=\"js/IE8.js\" type=\"text/javascript\"></script><![endif]-->\n");
      out.write("<!--[if lt IE 7]\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"css/ie8.css\"/><![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"index\" class=\"home\">\n");
      out.write("    <header id=\"banner\" class=\"body\">\n");
      out.write("\t<h1>Passenger Registration System</h1>\n");
      out.write("    </header><!-- /#banner -->\n");
      out.write("    <br><br>\n");
      out.write("    <aside id=\"featured\" class=\"body\"><article>\n");
      out.write("\t<figure>\n");
      out.write("            <img src=\"img/featured.png\" alt=\"Smashing Magazine\" />\n");
      out.write("\t</figure>\n");
      out.write("\t<hgroup>\n");
      out.write("            <h3>Mobile version (pre-alpha)</h3>\n");
      out.write("\t</hgroup>\n");
      out.write("            <p>This is mobile version of Passenger Registration System. <br> You have to take a picture of QR-code on your ticket and upload it below.\n");
      out.write("           After successful registration you have to go to baggage drop-off point. <a href=\"#\"> How do</a></p>\n");
      out.write("\t</article>\n");
      out.write("    </aside><!-- /#featured -->\n");
      out.write("    <section id=\"content\" class=\"body\">\n");
      out.write("\t<ol id=\"posts-list\" class=\"hfeed\">\n");
      out.write("            <li><article class=\"hentry\"><a href=\"#test\" style=\"display: block\">\n");
      out.write("            <h2 class=\"entry-title\">Upload QR-Code</h2>\n");
      out.write("            <footer class=\"post-info\">\n");
      out.write("\t<!--<abbr class=\"published\" ><!--title=\"2005-10-10T14:07:00-07:00\"></abbr><!-- YYYYMMDDThh:mm:ss+ZZZZ -->\n");
      out.write("\t<!--<address class=\"vcard author\">\n");
      out.write("\tQr-Code\n");
      out.write("        </address>-->\n");
      out.write("            </footer><!-- /.post-info -->\n");
      out.write("            <div class=\"entry-content\">\n");
      out.write("            <p>Click for upload the QR-code.</p>\n");
      out.write("            </div>\n");
      out.write("            </a></article></li>\n");
      out.write("            <li><article class=\"hentry\"><a href=\"#test\" style=\"display: block\">\n");
      out.write("            <h2 class=\"entry-title\">QR-Code from WEB-Cam</h2>\n");
      out.write("            <footer class=\"post-info\">\n");
      out.write("        <!--<abbr class=\"published\" ><!--title=\"2005-10-10T14:07:00-07:00\"><!-- YYYYMMDDThh:mm:ss+ZZZZ\n");
      out.write("        Web-Cam\n");
      out.write("\t</abbr> -->\n");
      out.write("            <address class=\"vcard author\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("            </address>\n");
      out.write("            </footer>\n");
      out.write("            <p>Click for upload QR-Code from WEB-Cam.</p>\n");
      out.write("            </a></article></li>\n");
      out.write("            <li><article class=\"hentry\"><a href=\"handinput.jsp\" style=\"display: block\">\n");
      out.write("            <h2 class=\"entry-title\">Hand input your data</h2>\n");
      out.write("            <footer class=\"post-info\">\n");
      out.write("        <!--<abbr class=\"published\" ><!--title=\"2005-10-10T14:07:00-07:00\"><!-- YYYYMMDDThh:mm:ss+ZZZZ\n");
      out.write("\tWeb-Cam\n");
      out.write("\t</abbr> -->\n");
      out.write("            <address class=\"vcard author\">\n");
      out.write("\n");
      out.write("            </address>\n");
      out.write("            </footer>\n");
      out.write("            <p>Click for input name and plane number.</p>\n");
      out.write("            </a></article></li>\n");
      out.write("        </ol><!-- /#posts-list -->\n");
      out.write("    </section><!-- /#content -->\n");
      out.write("\t\n");
      out.write("\t<footer id=\"contentinfo\" class=\"body\">\n");
      out.write("\t\t<address id=\"about\" class=\"vcard body\">\n");
      out.write("\t\t\t<span class=\"primary\">\n");
      out.write("\t\t\t\t<strong><a href=\"#\" class=\"fn url\">English</a> <a href=\"ru/index-ru.html\" class=\"fn url\">Russian</a></strong>\n");
      out.write("\t\t\t</span><!-- /.primary -->\n");
      out.write("\t\t</address><!-- /#about -->\n");
      out.write("\t\t\n");
      out.write("\t\t<p>2011 <a href=\"#\">GSM Co.</a></p>\n");
      out.write("\t</footer><!-- /#contentinfo -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
