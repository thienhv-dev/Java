<%@page import="CCM.*"errorPage="info.jsp" contentType="text/html" pageEncoding="UTF-8" %>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng Nhập</title>
    </head>
<%@ include file="qlnh.html" %>
<%@ include file="login.html" %>

<jsp:useBean id="KH" class="CCM.Customer" scope="session"/>
<jsp:useBean id="ct" class="CCM.creditcard" scope="session"/>

<% if(request.getMethod().equals("POST")) { 
    String mkh=request.getParameter("accno");
    String pw=request.getParameter("pw");
    Customer kh=new Customer();
    kh=Customer.login(mkh, pw);
    creditcard cc=new creditcard();
    if(kh!=null){
        out.write("<script type='text/javascript'>alert('xin chào :"+kh.getHoten()+"');</script>");
        KH.setAttribute(kh);
        ct.setAttribute(new creditcard(kh));
        response.sendRedirect("templa.jsp");
        Counter.setN(1);
    }
    else
        out.write("<script type='text/javascript'>alert('Dang nhap khong thanh cong');</script>");
}
        
	
%>
</TD></TR></TABLE>
<%@ include file="footer.html" %>

