<%@page import="CCM.*" errorPage="info.jsp" contentType="text/html" pageEncoding="UTF-8" %>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng Kí Mở Thẻ</title>
    </head>
<%@ include file="qlnh.html" %>
<%@ include file="registrationcard.html" %>
<jsp:useBean id="KH" class="CCM.Customer" scope="session" />
<jsp:useBean id="ct" class="CCM.creditcard" scope="session" />
<%// request.setCharacterEncoding("UTF-8");
 if (KH.getMaKH()==null ) {
     out.write("<script type='text/javascript'>alert('Bạn phải đăng nhập');</script>");
            response.sendRedirect("./dologin.jsp");
        } else {
             if(ct.getMathe()!=null){
                 out.write("<script type='text/javascript'>alert('Bạn đã có thẻ');</script>");
                 response.sendRedirect("index.jsp");
             }
                       if(request.getMethod().equals("POST")){
                           request.setCharacterEncoding("UTF-8");
                            String MaThe = request.getParameter("Mathe");
                            String pin = request.getParameter("pin");
                            String Makh = request.getParameter("MaKH");
                            int monhethan=Integer.parseInt(request.getParameter("Monthhethan"));
                            int thanghethan=Integer.parseInt(request.getParameter("Namhethan"));
                            double HanMuc = Double.parseDouble(request.getParameter("HanMuc"));
                            String loaithe=request.getParameter("loaithe");
                            creditcard a=new creditcard();
                            a.AddCreditCard(MaThe, Makh, pin, HanMuc, loaithe, monhethan, thanghethan);
                                out.write("<script type='text/javascript'>alert('Đăng Kí :"+MaThe+" thành công');</script>");
                                //response.sendRedirect("translog.jsp"); 
            }
     }  
  // response.sendRedirect("creditcard.jsp");            
%>
</TD></TR></TABLE>
<%@ include file="footer.jsp" %>