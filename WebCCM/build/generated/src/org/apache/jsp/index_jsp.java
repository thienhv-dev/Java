package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import CCM.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/qlnh.html");
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

      out.write('\n');
 request.setCharacterEncoding("UTF-8"); 
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Thẻ tín dụng</title>\n");
      out.write("        <script>\n");
      out.write("            window.onload = function(){\n");
      out.write("                setTimeout(\"slide()\", 2500);\n");
      out.write("            };\n");
      out.write("            \n");
      out.write("            var im = 1;\n");
      out.write("            var no = 13;\n");
      out.write("            function slide(){\n");
      out.write("              im++;\n");
      out.write("              // Thay thế hình\n");
      out.write("              document.images['img'].src ='anh/' + im + '.jpg';\n");
      out.write("              // Gọi lại hàm nếu thõa đk\n");
      out.write("              if(im < no){\n");
      out.write("               setTimeout(\"slide()\", 2500);\n");
      out.write("              }\n");
      out.write("              else\n");
      out.write("              {\n");
      out.write("                  im=1;\n");
      out.write("                  setTimeout(\"slide()\", 2500);\n");
      out.write("              }   \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    ");
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
      out.write(" \n");
      out.write("<BODY><div id=\"ttm\">\n");
      out.write("        <img src=\"anh/14796146_2228937433912155_2070312194_o.png\"  ALT=\"\"/><HR></div> \n");
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
      out.write("                            if(thisYear < 1900) {thisYear += 1900}; \n");
      out.write("\n");
      out.write("                            document.write(\"Hôm nay: thứ\" + \" \" + thisDay +\"\"+\" ngày\"+\" \"+ now.getDate()+\"/\" + monthNames[now.getMonth()]+ \"/\" + thisYear);\n");
      out.write("\n");
      out.write("                            // --> \n");
      out.write("\n");
      out.write("                            </script> \n");
      out.write("                        </td>\n");
      out.write(" \n");
      out.write("                        <td width=\"75%\"> <marquee direction=\"left\" align=\"right\" scrolldelay=\"3\" style=\"color:red\"> Thời gian giao dịch phục vụ khách hàng tại các Chi nhánh, PGD, QTK của VietinBank - Từ thứ 2 tới thứ 6: Từ đầu giờ sáng tới 17h00 (trừ ngày lễ, tết).</marquee> </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("        </div>\n");
      out.write("<TABLE>\n");
      out.write("<TR>\n");
      out.write("     <div id=\"left\">\n");
      out.write("                    \n");
      out.write("                <center><p class=\"tt\"> DANH MỤC </p></center>\n");
      out.write("                <ul id=\"menua\">\n");
      out.write("                    <li><A HREF=\"./\">Trang Chủ</A></LI>\n");
      out.write("                    <li><A HREF=\"./dologin.jsp\">Đăng nhập</A><P></LI>\n");
      out.write("                    <li><A HREF=\"./doipass.jsp\">Đổi Mật Khẩu</A></LI>\n");
      out.write("                    <li><A HREF=\"./register.jsp\">Đăng Kí Khách Hàng</A></LI>\n");
      out.write("                    <li><A HREF=\"./capnhatTTKH.jsp\">Cập nhật thông tin</A></LI>\n");
      out.write("                    <li><A HREF=\"./changelevel.jsp\">Thay Đổi Hạn Mức</A></LI>\n");
      out.write("                    <li><A HREF=\"./doipin.jsp\">Thay Đổi Pin</A></LI>\n");
      out.write("                    <li><A HREF=\"./exit.jsp\">Thoát</A></LI>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("                 <center><p class=\"tt\">GIAO DỊCH</p></center>\n");
      out.write("                    <ul id=\"menua\">\n");
      out.write("                        <li><A href=\"./translog.jsp\"> Giao dịch</a></li>\n");
      out.write("                        <li><A href=\"./XemNky.jsp\">Nhật kí giao dịch</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                 <center><p class=\"tt\"> THẺ</p></center>\n");
      out.write("              <ul id=\"menua\">\n");
      out.write("                <li><A href=\"./registrationcard.jsp\">Mở thẻ</a></li>\n");
      out.write("                <li><A href=\"./payment.jsp\">Chi trả</a></li>\n");
      out.write("              </ul>\n");
      out.write("        </div>\n");
      out.write("</TR></TABLE>\t\n");
      out.write("</BODY>\n");
      out.write("</HTML>\n");
      out.write("      ");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"clearfix box2\">\n");
      out.write("            <div id=\"slide\">\n");
      out.write("                   <img src=\"anh/1.jpg\" name=\"img\" alt=\"\"/>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                var besps_770 = new besps_slideshow(\"770\", 25, 4000, 40, 1, 13);\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("                <div class=\"products\">\n");
      out.write("                    <div class=\"pleft\"><ul id=\"three\" li  >\n");
      out.write("                            <li><span class=\"top\">Khách hàng Cá nhân</a></span> <span class=\"normal\">Tiết kiệm tích lũy đa năng</a></span> <span class=\"normal\">Cho vay mua nhà</a></span> <span class=\"normal\">Cho vay sản xuất kinh doanh</a></span> <span class=\"normal\">Thẻ</a></span> <span class=\"normal\">Dịch vụ Khách hàng Ưu tiên</a></span></li>\n");
      out.write("                            <li><span class=\"top\">Khách hàng Doanh nghiệp</a></span> <span class=\"normal\">Tiền gửi</a></span> <span class=\"normal\">Cho vay</a></span> <span class=\"normal\">Thanh toán &amp; QL dòng tiền</a></span> <span class=\"normal\">TT Quốc tế &amp; Tài trợ thương mại</a></span> <span class=\"normal\">KD Ngoại tệ &amp; Thị trường vốn</a></span></li>\n");
      out.write("                            <li><span class=\"top\">Dịch vụ tiện ích</a></span> <span class=\"normal\">VietinBank iPay</a></span> <span class=\"normal\">iPay Mobile</a></span> <span class=\"normal\">VietinBank eFAST</a></span> <span class=\"normal\">SMS Banking</a></span> <span class=\"normal\">BankPlus</a></span></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"pright\" >\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                            <span class=\"top\">Sản phẩm mới</a></span><span class=\"normal\">Chuyển tiền di động, rút tiền linh hoạt không cần thẻ</a></span>\n");
      out.write("                            <span class=\"normal\">Ứng tiền mặt lên tới 100% hạn mức từ thẻ CASHPlus</a></span>\n");
      out.write("                            <span class=\"normal\">Tiết kiệm Phúc Lộc - Sản phẩm dành cho khách hàng trung niên</a></span>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    ");


    //out.write("Welcome to DCT Academic Management");

    
      out.write("\n");
      out.write("</TD></TR></TABLE>\n");
      out.write("\r\n");
      out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"#DBEAF5\" width=\"100%\" height=\"23\">\r\n");
      out.write("  <tr>\r\n");
      out.write("      \r\n");
      out.write("    <div id=\"noibat\"> \r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("        <hr style=\"size:1%\" width=\"100%\">\r\n");
      out.write("\t<div id=\"copyright\">\r\n");
      out.write("            <b>WEBSITE Ngân Hàng VietinBank</b><br>\r\n");
      out.write("            Copyright ny 2016. Design by: Nguyễn Công Thành™c<br>\r\n");
      out.write("            Mail__:<a href=\"mailto:nguyencongthanh347@gmail.com\" class=\"b\">nguyencongthanh347@gmail.com </a><br>\r\n");
      out.write("\t</div>\r\n");
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
