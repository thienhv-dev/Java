<%@page import="CCM.*" errorPage="info.jsp" contentType="text/html" pageEncoding="UTF-8" %>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Giao Dịch</title>
    </head>
<%@ include file="qlnh.html" %>
<jsp:useBean id="KH" class="CCM.Customer" scope="session"/>
<jsp:useBean id="ct" class="CCM.creditcard" scope="session"/>
<%if(KH.getMaKH()==null){
    response.sendRedirect("./dologin.jsp");
    out.write("<script type='text/javascript'>alert('Bạn phải đăng nhập');</script>");
}
else
{
     if(request.getMethod().equals("POST")){ 
    String MaThe=request.getParameter("Mathe");
    String Diachi=request.getParameter("Diachi");
    Double SoTien=Double.parseDouble(request.getParameter("Sotien").toString());
    String LoaiGiaoDich=request.getParameter("LoaiGD");
    String MoTa=request.getParameter("Mota");
    Translog tl=new Translog();
        tl.AddTransLog(MaThe, Diachi, SoTien, LoaiGiaoDich, MoTa);
            out.write("<script type='text/javascript'>alert('Giao Dịch của :"+MaThe+" thành công');</script>");
            ct=new creditcard(MaThe);
            response.sendRedirect("XemNky.jsp");
}
     else
     {
         %>
         <CENTER>
        <h1><b> Giao Dịch </b></h1>
        <form method="POST" name="regForm" action="translog.jsp" >
        <TABLE>
            <TR><TD>Mã Thẻ </TD><TD><input type="text" name="Mathe" size="25" value="<%=ct.getMathe() %>"></TD></TR>
        <TR><TD>Loại Giao Dịch </TD><TD><input type="text" name="LoaiGD" size="25"></TD></TR>
        <TR><TD>Số Tiền </TD><TD><input type="text" name="Sotien" size="25"></TD></TR>
        <TR><TD>Mô Tả</TD><TD><input type="text" name="Mota" size="25"></TD></TR>
        <TR><TD>Điạ Điểm Giao Dịch</TD><TD><input type="text" name="Diachi" size="25"></TD></TR>
        </TABLE>
        <p>
        <input type="submit" value="Submit" onclick="return checkNull(accno);">
        <input type="reset" value="Reset">
        </form>
        </CENTER>
         <%
     }
}
%></TD></TR></TABLE>
<%@ include file="footer.jsp" %>
