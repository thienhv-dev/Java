package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import CCM.*;

public final class doipass_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/qlnh.html");
    _jspx_dependants.add("/doipass.html");
    _jspx_dependants.add("/footer.html");
  }

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
      			"info.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>DCT Human Resource Management</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<HTML>\n");
      out.write("<HEAD>\n");
      out.write("<TITLE>Trang Quản Lý Ngân Hàng</TITLE>\n");
      out.write("    <META NAME=\"Generator\" CONTENT=\"EditPlus\" Charset=\"UTF-8\">\n");
      out.write("<SCRIPT language=JavaScript src=\"Validate.js\"></SCRIPT>\n");
      out.write("<LINK REL=StyleSheet HREF='qlns.css' TYPE='text/css'/>\n");
      out.write("<link rel=stylesheet href='style_nang.css' type=\"text/css\"/>\n");
      out.write("<link rel=stylesheet type=\"text/css\" href=\"style.css\"/>\n");
      out.write("<link rel=stylesheet href='menu_style.css' type=\"text/css\"/>\n");
      out.write("<link rel=stylesheet href='CSSmoi.css' type=\"text/css\"/>\n");
      out.write("</HEAD>\n");
      out.write("<BODY><CENTER>\n");
      out.write("    <img src=\"anh/vietinbank_logo.jpg\" alt=\"\"WIDTH=\"1024\" HEIGHT=\"100\" BORDER=0 ALT=\"\"/><HR></CENTER> \n");
      out.write("\n");
      out.write("    <div id=\"ngayh\">\n");
      out.write("\t\t<table border=\"0\">\n");
      out.write("                    <tr>\n");
      out.write("\t\t\t<td width=\"25%\">\n");
      out.write("                            <script language=\"\" type=\"text/javascript\"> \n");
      out.write(" \n");
      out.write("                            <!-- // Array ofmonth Names \n");
      out.write("\n");
      out.write("                           \n");
      out.write("                            var monthNames = new Array(\"01\",\"02\",\"03\",\"04\",\"05\",\"06\",\"07\",\"08\",\"09\" ,\"10\",\"11\",\"12\"); \n");
      out.write("\n");
      out.write("                            var dayNames = new Array(\"Chủ nhật,\",\"2,\",\"3,\",\"4,\",\"5,\",\"6,\",\"7,\") \n");
      out.write("\n");
      out.write("                            var now = new Date(); \n");
      out.write("\n");
      out.write("                            thisYear = now.getYear(); \n");
      out.write("\n");
      out.write("                            thisDay = dayNames[now.getDay()]; \n");
      out.write("\n");
      out.write("                            if(thisYear < 1900) {thisYear += 1900}; // corrections if Y2K display problem \n");
      out.write("\n");
      out.write("                            document.write(\"Hôm nay: thứ\" + \" \" + thisDay +\"\"+\" ngày\"+\" \"+ now.getDate()+\"/\" + monthNames[now.getMonth()]+ \"/\" + thisYear);\n");
      out.write("\n");
      out.write("                            // --> \n");
      out.write("\n");
      out.write("                            </script> \n");
      out.write("                        </td>\n");
      out.write(" \n");
      out.write("                        <td width=\"75%\"> <marquee direction=\"left\" align=\"right\" scrolldelay=\"3\" style=\"color:red\">chào mừng bạn đến với trang quản lý khách hàng</marquee> </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("        </div>\n");
      out.write("<TABLE>\n");
      out.write("<TR>\n");
      out.write("     <div id=\"left\">\n");
      out.write("                    \n");
      out.write("                <center><b> DANH MỤC </b></center>\n");
      out.write("                <ul id=\"menua\">\n");
      out.write("\n");
      out.write("                    <li><A HREF=\"template.jsp\">Trang Chủ</A></LI>\n");
      out.write("                    <li><A HREF=\"thongtinKH.jsp\">Cập nhật thông tin</A></LI>\n");
      out.write("                    <li><A HREF=\"doipass.jsp\">Đổi Mật Khẩu</A></LI>\n");
      out.write("                    <li><A HREF=\"dologin.jsp\">Đăng nhập</A><P></LI>\n");
      out.write("                    <li><A HREF=\"listds.jsp\">Xem danh sách nhân viên</A></LI>\n");
      out.write("                    <li><A HREF=\"exit.jsp\">Thoát</A></LI>\n");
      out.write("                </ul>\n");
      out.write("        </div>\n");
      out.write("\t<TD Width=\"1\" Valign=\"top\"><IMG SRC=\"\" WIDTH=\"1\" HEIGHT=\"350\" BORDER=1 ALT=\"\"></TD>\n");
      out.write("        <TD >");
      out.write('\n');
      out.write("\r\n");
      out.write("<CENTER>\r\n");
      out.write("<h1><b>Đổi Mật Khẩu</b></h1>\r\n");
      out.write("\r\n");
      out.write("<form method=\"POST\"  action=\"doipass.jsp\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR><TD>Mật Khẩu Cũ </TD><TD><input type=\"password\" name=\"passc\" size=\"25\"/></TD></TR>\r\n");
      out.write("<TR><TD>Mật Khẩu Mới </TD><TD><input  type=\"password\" name=\"newP\" size=\"25\"/></TD></TR>\r\n");
      out.write("<TR><TD>Nhập Lại Mật Khẩu </TD><TD><input type=\"password\" name=\"RNewP\" size=\"25\"/></TD></TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<p>\r\n");
      out.write("<input type=\"submit\" value=\"Cập Nhật\" >\r\n");
      out.write("<input type=\"reset\" value=\"Reset\">\r\n");
      out.write("</form>\r\n");
      out.write("</CENTER>");
      out.write('\n');
      CCM.Customer KH = null;
      synchronized (session) {
        KH = (CCM.Customer) _jspx_page_context.getAttribute("KH", PageContext.SESSION_SCOPE);
        if (KH == null){
          KH = new CCM.Customer();
          _jspx_page_context.setAttribute("KH", KH, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');

if (KH.getMaKH()==null) {
        response.sendRedirect("dologin.jsp");
    }else{
             if(request.getMethod().equals("POST")) {        
                    
                        String passc = request.getParameter("passc");
                        String newP = request.getParameter("passm");
                        String RNewP = request.getParameter("passxn");
                        Customer kh = new Customer(KH.getMaKH());
                        if(passc.equals(kh.getMatkhau())) 
                        {
                           if(RNewP.equals(newP))
                                 {
                                    kh.changePass(newP);
                                    out.write("<script type='text/javascript'>alert('Đổi Mật Khẩu Thành Công');</script>");
                                   response.sendRedirect("dologin.jsp");
                                 }
                           else
                                {
                                 out.write("<script type='text/javascript'>alert('Mật Khẩu Mới Không Trùng');</script>");
                                }
                           }
                        else
                                out.write("<script type='text/javascript'>alert('Mật Khẩu Cũ Không Đúng');</script>");
                        }              
        }

      out.write("\n");
      out.write("</TD></TR></TABLE>\n");
      out.write("\r\n");
      out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"#DBEAF5\" width=\"100%\" height=\"23\">\r\n");
      out.write("  <tr>\r\n");
      out.write("      <td>\r\n");
      out.write("    <div id=\"noibat\"> \r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("        <hr style=\"size:1%\" width=\"100%\">\r\n");
      out.write("\t<div id=\"copyright\">\r\n");
      out.write("            <b>WEBSITE Ngân Hàng ViettinBank</b><br>\r\n");
      out.write("            Copyright ny 2016. Design by: Nguyễn Công Thành™c<br>\r\n");
      out.write("            Mail__:<a href=\"mailto:nguyencongthanh347@gmail.com\" class=\"b\">nguyencongthanh347@gmail.com </a>\r\n");
      out.write("\t</div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</HTML>\r\n");
      out.write("\r\n");
      out.write('\n');
      out.write('\n');
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
