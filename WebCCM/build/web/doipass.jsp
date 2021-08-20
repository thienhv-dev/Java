<%@page import="CCM.*"errorPage="info.jsp" contentType="text/html" pageEncoding="UTF-8" %>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đổi Mật Khẩu</title>
    </head>
<%@ include file="qlnh.html" %>
<%@ include file="doipass.html" %>
<jsp:useBean id="KH" class="CCM.Customer" scope="session" />
<%  if (KH.getMaKH()==null) {
                response.sendRedirect("./dologin.jsp");
               out.write("<script type='text/javascript'>alert('Bạn phải đăng nhập');</script>");
                        }else{ 
                        if(request.getMethod().equals("POST")) {        
                        String passc = request.getParameter("passc");
                        String newP = request.getParameter("newP");
                        String RNewP = request.getParameter("RNewP");
                        Customer kh = new Customer(KH.getMaKH());
                            if(passc.equals(kh.getMatkhau())) 
                        {
                           if(RNewP.equals(newP))
                                 {
                                    kh.changePass(newP);
                                    out.write("<script type='text/javascript'>alert('Đổi Mật Khẩu Thành Công');</script>");
                                    response.sendRedirect("dologin.jsp");
                                 }
                           else
                                {
                                 out.write("<script type='text/javascript'>alert('Mật Khẩu Mới Không Trùng');</script>");
                                }
                           }
                        else
                                out.write("<script type='text/javascript'>alert('Mật Khẩu Cũ Không Đúng');</script>");
                        }              
        }
%></TD></TR></TABLE>
<%@ include file="footer.jsp" %>

