<%@page import="CCM.*" errorPage="info.jsp" contentType="text/html" pageEncoding="UTF-8" %>
<jsp:useBean id="n" class="CCM.Counter" scope="session" />
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" bordercolor="#DBEAF5" width="100%" height="23">
  <tr>
      
    <div id="noibat"> 
	</div>
	
        <hr style="size:1%" width="100%">
	<div id="copyright">
            <b>WEBSITE Ngân Hàng VietinBank</b><br>
            Copyright ny 2016. Design by: Nguyễn Công Thành™c<br>
            Mail__:<a href="mailto:nguyencongthanh347@gmail.com" class="b">nguyencongthanh347@gmail.com </a><br>
	</div>
  </tr>
  <tr><td>
      <p> Số Lượt Truy Cập: <%=Counter.getN()%></p>
  </td></tr>
</table>
</body>
</HTML>

