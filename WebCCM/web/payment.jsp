<%@page import="CCM.*" errorPage="info.jsp" contentType="text/html" pageEncoding="UTF-8" %>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chi Trả</title>
    </head>
<%@ include file="qlnh.html" %>
<jsp:useBean id="ct" class="CCM.creditcard" scope="session"/>
<jsp:useBean id="KH" class="CCM.Customer" scope="session"/>
<%if(KH.getMaKH()==null){
    response.sendRedirect("./dologin.jsp");
    out.write("<script type='text/javascript'>alert('Bạn phải đăng nhập');</script>");
}
else
{
     if(request.getMethod().equals("POST")){ 
        String Makh=request.getParameter("Makh");
        String Hoten=request.getParameter("hoten");
        String DDiem=request.getParameter("DiaChi");
        Double sotien=Double.parseDouble(request.getParameter("Sotien"));
        String loaigd=request.getParameter("loaigd");
        String Mota=request.getParameter("mta");
        if(creditcard.makePayment(sotien, Mota, DDiem, loaigd, ct)){
         out.write("<script type='text/javascript'>alert('Chi Trả Tài Khoản :"+Makh+" Thành Công');</script>");
            KH=new Customer(Makh);
            response.sendRedirect("XemNky.jsp");
        }else{
         out.write("<script type='text/javascript'>alert('Chi Trả Tài Khoản :"+Makh+"Thất Bại');</script>");
        }
                    
                }
        else{
                %>
                <CENTER>
                    <h1><b>Chi Trả</b></h1>
         <form method="post">
        <TABLE align="center">

        <TR><TD>Mã Khách Hàng : </TD>
            <TD>
                <input type="text" name="Makh" size="25" value="<%=KH.getMaKH() %>">
            </TD>
        </TR>
        <TR><TD>Họ Tên : </TD>
            <TD>
                <input type="text" name="hoten" size="25" value="<%=KH.getHoten() %>">
            </TD>
        </tr>
        <TR><TD>Địa Chỉ : </TD>
            <TD>
                <input type="text" name="DiaChi" size="25" value="">
            </TD>
        </tr>
        <TR><TD>Số Tiền : </TD>
            <TD>
                <input type="text" name="Sotien" size="25" value="">
            </TD>
        </tr>
        <tr>
            <TD>Loại Giao Dịch : </TD>
            <TD><select name="loaigd">
                <option value="TT">TT</option>
                <option value="MT">MT</option>
                <option value="KT">KT</option></select></TD></tr>
        <TR><TD>Mô Tả : </TD>
            <TD>
                <input type="text" name="mta" size="25" value="">
            </TD>
        </tr>
                </TR>

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
