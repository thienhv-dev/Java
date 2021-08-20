<%@page import="CCM.*" contentType="text/html" pageEncoding="UTF-8" import="CCM.*" errorPage="error.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tạm Biệt Khách Hàng</title>
    </head>
<%@include file="qlnh.html" %>
<jsp:useBean id="KH" class="CCM.Customer" scope="session"/>
<% 
if(KH.getMaKH()!=null)     
{
        out.write("<H3>Tạm biệt khách hàng : "+KH.getHoten()+"</H3>");
        Counter.setN(0);
        session.invalidate();
}   
%>
</TD></TR></TABLE>
<%@include file="footer.html" %>
