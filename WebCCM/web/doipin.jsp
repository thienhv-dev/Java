<%@page import="CCM.*"errorPage="info.jsp" contentType="text/html" pageEncoding="UTF-8" %>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thay Đổi Pin</title>
    </head>
<%@ include file="qlnh.html" %>
<jsp:useBean id="ct" class="CCM.creditcard" scope="session" />
<jsp:useBean id="KH" class="CCM.Customer" scope="session" />
<%  if (KH.getMaKH()==null) {
                response.sendRedirect("./dologin.jsp");
               out.write("<script type='text/javascript'>alert('Bạn phải đăng nhập');</script>");
                        }else{ 
                        if(request.getMethod().equals("POST")) {
                        String mst =request.getParameter("Mathe");
                        String oldPin = request.getParameter("oldPin");
                        String newPin = request.getParameter("newPin");
                        String RNewP = request.getParameter("RNewPin");
                        creditcard CT =new creditcard(ct.getMathe());
                            if(oldPin.equals(ct.getPin())) 
                        {
                           if(RNewP.equals(newPin))
                                 {
                                    CT.changePin(newPin);
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
                        else
                        {
                            %>
                            <CENTER>
                            <h1><b>Thay Đổi Pin</b></h1>
                            <form method="POST"  action="doipin.jsp">
                            <TABLE>
                                <TR><TD>Mã Số Thẻ </TD><TD><input type="text" name="Mathe" size="25" value="<%=ct.getMathe() %>"/></TD></TR>
                            <TR><TD>Mật Khẩu Cũ </TD><TD><input type="password" name="oldPin" size="25"/></TD></TR>
                            <TR><TD>Mật Khẩu Mới </TD><TD><input  type="password" name="newPin" size="25"/></TD></TR>
                            <TR><TD>Nhập Lại Mật Khẩu </TD><TD><input type="password" name="RNewPin" size="25"/></TD></TR>
                            </TABLE>
                            <p>
                            <input type="submit" value="Cập Nhật" >
                            <input type="reset" value="Reset">
                            </form>
                            </CENTER>
                            <%
                        }
        }
%>
</TD></TR></TABLE>
<%@ include file="footer.jsp" %>
