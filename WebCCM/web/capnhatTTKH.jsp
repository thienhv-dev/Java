<%@page import="CCM.*" errorPage="info.jsp" contentType="text/html" pageEncoding="UTF-8" %>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cập nhật thông tin</title>
    </head>
<%@ include file="qlnh.html" %>

<jsp:useBean id="KH" class="CCM.Customer" scope="session"/>
<%if(KH.getMaKH()==null){
    response.sendRedirect("./dologin.jsp");
    out.write("<script type='text/javascript'>alert('Bạn phải đăng nhập');</script>");
}
else
{
     if(request.getMethod().equals("POST")){ 
        String MaKH=request.getParameter("MaKH");
        String HoTen=request.getParameter("Hoten");
        int CMND=Integer.parseInt(request.getParameter("CMND").toString());
        String Email=request.getParameter("Email");
        Customer kh=new Customer();
        kh.updateCustomer(MaKH, HoTen, CMND, Email);
            out.write("<script type='text/javascript'>alert('Thay Đổi Thông Tin :"+MaKH+" thành công');</script>");
            KH=new Customer(MaKH);
    }
     else{
         %>
         <CENTER>
                    <h1><b>Cập Nhật </b></h1>
                    <h1>Thông Khách Hàng</h1>
         <form method="post">
        <TABLE align="center">

        <TR><TD>Mã khách hàng : </TD>
            <TD>
                <input type="text" name="MaKH" size="25" value="<%=KH.getMaKH() %>">
            </TD>
        </TR>
        <TR><TD>Họ và tên : </TD>
            <TD>
                <input type="text" name="Hoten" size="25" value="<%=KH.getHoten() %>">
            </TD>
        </tr>
        <tr>
            <TD>Chứng minh nhân dân : </TD>
            <TD>
                <input type="text" name="CMND" size="25" value="<%= KH.getCMND() %>">
            </TD>
        </TR>
         <tr>
                    <TD>Email:</TD>
                    <TD>
                        <input type="text" name="Email" size="25" value="<%=KH.getEmail() %>"></td>
                </tr>   
        </TABLE>
                
                <p align="center" >
                <input type="submit" value="Submit" onclick="return checkNull(accno);">
                <input type="reset" value="Reset"></p>
         </form></center>
        </TD></TR></TABLE>
         
         <%
     }
         
}
%>

<%@ include file="footer.jsp" %>