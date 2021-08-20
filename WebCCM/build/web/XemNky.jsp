<%@page import="java.text.DecimalFormat"%>
<%@page import="CCM.*" errorPage="info.jsp"contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.util.Vector"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lịch sử giao dịch</title>
    </head>
<%@ include file="qlnh.html" %>
<jsp:useBean id="KH" class="CCM.Customer" scope="session" />
<jsp:useBean id="ct" class="CCM.creditcard" scope="session" />
<H1>Nhật Kí Giao Dịch</H1>
<center><TABLE border='1' width=80% >
        <THEAD><TR><TD>STT<TD width=15%>Mã Thẻ</TD><TD width=20%>Địa Chỉ</TD><TD width=15%>Mô tả</TD>
        <TD width=15%>Loại Giao Dịch</TD><TD width=15%>Số Tiền</TD><TD width=30%>Ngày Giờ Giao Dịch</TD>
                 
</TR></THEAD>
<%  if (KH.getMaKH()==null) {
                response.sendRedirect("./dologin.jsp");
               out.write("<script type='text/javascript'>alert('Bạn phải đăng nhập');</script>");
}else{           
    DecimalFormat df=new DecimalFormat("0");
    int i=0;
  Vector h=Translog.getall(ct);
    for(i=0;i<h.size();i++){
        Translog t=(Translog)h.elementAt(i);
      out.write("<tr><td>"+(i+1)+"</td>"
                    + "<td>"+t.getMathe()+"</td>"
                    + "<td>"+t.getDiachi()+"</td>"
                    + "<td>"+t.getMota()+"</td>"
                    + "<td>"+t.getLoaiGD()+"</td>"
                    + "<td>"+df.format(t.getSotien())+"</td>"
                    + "<td>"+t.getNgayGioGD()+"</td></tr>");   
                    
                   
                   // + "<td>"+t.getLoaiGD()+"</td>"
            //  + "<td>"+t.getDiachi()+"</td></tr>");
    }
    out.write("<H3>Tổng số giao dịch:"+i+"</H3>");
}%>
</table></center>
</TD></TR></TABLE>
<%@ include file="footer.jsp" %>