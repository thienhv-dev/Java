package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import CCM.*;
import java.util.Vector;
import CCM.*;

public final class XemNky_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/qlnh.html");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lịch sử giao dịch</title>\n");
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
      CCM.creditcard ct = null;
      synchronized (session) {
        ct = (CCM.creditcard) _jspx_page_context.getAttribute("ct", PageContext.SESSION_SCOPE);
        if (ct == null){
          ct = new CCM.creditcard();
          _jspx_page_context.setAttribute("ct", ct, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      CCM.Translog T = null;
      synchronized (session) {
        T = (CCM.Translog) _jspx_page_context.getAttribute("T", PageContext.SESSION_SCOPE);
        if (T == null){
          T = new CCM.Translog();
          _jspx_page_context.setAttribute("T", T, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<H1>Nhật Kí Giao Dịch</H1>\n");
      out.write("<center><TABLE border='1' width=80% >\n");
      out.write("        <THEAD><TR><TD>STT<TD width=15%>Mã Thẻ</TD><TD width=20%>Địa Chỉ</TD><TD width=15%>Mô tả</TD>\n");
      out.write("        <TD width=15%>Loại Giao Dịch</TD><TD width=15%>Số Tiền</TD><TD width=35%>Ngày Giờ Giao Dịch</TD>\n");
      out.write("                 \n");
      out.write("</TR></THEAD>\n");
  if (KH.getMaKH()==null) {
               out.write("<script type='text/javascript'>alert('Bạn phải đăng nhập');</script>");
}else{           
    DecimalFormat df=new DecimalFormat("0");
  Vector h=Translog.getall(ct.getMathe());
     int i=1;
    for(i=1;i<=h.size();i++){
   /* Vector cot = new Vector();
        cot.addElement("Mã Thẻ");
        cot.addElement("Ngày giờ giao dịch");
        cot.addElement("Số tiền");
        cot.addElement("Mô tả");*/
        Translog t=(Translog)h.elementAt(i);
       
      out.write("\n");
      out.write("       <TR>\n");
      out.write("            <TD>");
      out.print(i+1);
      out.write("</TD>\n");
      out.write("            <TD>");
      out.print(t.getMathe());
      out.write("</TD>\n");
      out.write("            <TD>");
      out.print(t.getDiachi());
      out.write("</TD>\n");
      out.write("            <TD>");
      out.print(t.getMota());
      out.write("</TD>\n");
      out.write("            <TD>");
      out.print(t.getLoaiGD());
      out.write("</TD>\n");
      out.write("            <TD>");
      out.print(df.format(t.getSotien()));
      out.write("</TD>\n");
      out.write("            <TD>");
      out.print(t.getNgayGioGD());
      out.write("</TD>\n");
      out.write("            </tr>\n");
}}
      out.write("\n");
      out.write("    </table></center>\n");
      out.write("</TD></TR></TABLE>\n");
      out.write('\n');
      CCM.Counter n = null;
      synchronized (session) {
        n = (CCM.Counter) _jspx_page_context.getAttribute("n", PageContext.SESSION_SCOPE);
        if (n == null){
          n = new CCM.Counter();
          _jspx_page_context.setAttribute("n", n, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"#DBEAF5\" width=\"100%\" height=\"23\">\n");
      out.write("  <tr>\n");
      out.write("      \n");
      out.write("    <div id=\"noibat\"> \n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("        <hr style=\"size:1%\" width=\"100%\">\n");
      out.write("\t<div id=\"copyright\">\n");
      out.write("            <b>WEBSITE Ngân Hàng VietinBank</b><br>\n");
      out.write("            Copyright ny 2016. Design by: Nguyễn Công Thành™c<br>\n");
      out.write("            Mail__:<a href=\"mailto:nguyencongthanh347@gmail.com\" class=\"b\">nguyencongthanh347@gmail.com </a><br>\n");
      out.write("\t</div>\n");
      out.write("  </tr>\n");
      out.write("  <tr><td>\n");
      out.write("      ");
      out.print(Counter.getN());
      out.write("\n");
      out.write("  </td></tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</HTML>\n");
      out.write("\n");
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
