<%@page import="CCM.*" errorPage="info.jsp" contentType="text/html" pageEncoding="UTF-8" %>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng Kí Khách Hàng</title>
    </head>
<%@ include file="qlnh.html" %>
<%@ include file="register.html" %>
<jsp:useBean id="KH" class="CCM.Customer" scope="session"/>
    <% if(request.getMethod().equals("POST")){ 
    String MaKH=request.getParameter("MaKH");
    String Matkhau=request.getParameter("Matkhau");
    String HoTen=request.getParameter("Hoten");
    int CMND=Integer.parseInt(request.getParameter("CMND").toString());
    String Email=request.getParameter("Email");
    Customer kh=new Customer();
      kh.AddCustomer(MaKH, Matkhau, HoTen, CMND, Email);
            out.write("<script type='text/javascript'>alert('thêm khách hàng :"+MaKH+" thành công');</script>");
            response.sendRedirect("./dologin.jsp");
}
%></TD></TR></TABLE>
<%@ include file="footer.jsp" %>

