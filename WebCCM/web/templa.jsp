<%@page import="CCM.*" errorPage="info.jsp" contentType="text/html" pageEncoding="UTF-8" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Xin Chào Khách Hàng</title>
    </head>
<%@ include file="qlnh.html" %>
<jsp:useBean id="KH" class="CCM.Customer" scope="session" />
<%
   /// Customer kh=new Customer();
    out.write("<H3>Xin Chào Khách Hàng :"+KH.getHoten()+"</H3>");
    
	
%>
</TD></TR></TABLE>
<%@ include file="footer.jsp" %>

