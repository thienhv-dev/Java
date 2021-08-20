<%@page import="java.text.DecimalFormat"%>
<%@page import="CCM.*" errorPage="info.jsp" contentType="text/html" pageEncoding="UTF-8" %>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thay Đổi Hạn Mức</title>
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
    DecimalFormat df=new DecimalFormat("0");
     if(request.getMethod().equals("POST")){ 
        String MaThe=request.getParameter("Mathe");
        Double HanMuc=Double.parseDouble(request.getParameter("HanMuc"));
        String HanMucmoi=request.getParameter("HanMucMoi");
        
        creditcard c=new creditcard();
        c.changeLevel(HanMucmoi, MaThe);
            out.write("<script type='text/javascript'>alert('Thay Đổi Hạn Mức :"+MaThe+" thành công');</script>");
           ct=new creditcard(MaThe);
    }
     else{
         %>
         <CENTER>
                    <h1><b>Thay Đổi Hạn Mức</b></h1>
         <form method="post">
        <TABLE align="center">

        <TR><TD>Mã Thẻ : </TD>
            <TD>
                <input type="text" name="Mathe" size="25" value="<%=ct.getMathe() %>">
            </TD>
        </TR>
        <TR><TD>Hạn Mức Hiện Tại : </TD>
            <TD>
                <input type="text" name="HanMuc" size="25" value="<%=df.format(ct.getHanMuc()) %>">
            </TD>
        </tr>
        <tr>
            <TD>Hạn Mức Mới : </TD>
            <TD><select name="HanMucMoi">
                <option value="50000000">50000000</option>
                <option value="70000000">70000000</option>
                <option value="80000000">80000000</option>
                <option value="100000000">100000000</option></select></TD></tr>
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
