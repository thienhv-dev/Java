<%@page import="CCM.*" errorPage="info.jsp" contentType="text/html" pageEncoding="UTF-8" %>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thẻ tín dụng</title>
        <script>
            window.onload = function(){
                setTimeout("slide()", 2500);
            };
            
            var im = 1;
            var no = 13;
            function slide(){
              im++;
              // Thay thế hình
              document.images['img'].src ='anh/' + im + '.jpg';
              // Gọi lại hàm nếu thõa đk
              if(im < no){
               setTimeout("slide()", 2500);
              }
              else
              {
                  im=1;
                  setTimeout("slide()", 2500);
              }   
            }
            
        </script>
    </head>

    <%@ include file="qlnh.html" %>
    <body>
        <div class="clearfix box2">
            <div id="slide">
                   <img src="anh/1.jpg" name="img" alt=""/>
            </div>


            <script type="text/javascript">
                var besps_770 = new besps_slideshow("770", 25, 4000, 40, 1, 13);

            </script>

                <div class="products">
                    <div class="pleft"><ul id="three" li  >
                            <li><span class="top">Khách hàng Cá nhân</a></span> <span class="normal">Tiết kiệm tích lũy đa năng</a></span> <span class="normal">Cho vay mua nhà</a></span> <span class="normal">Cho vay sản xuất kinh doanh</a></span> <span class="normal">Thẻ</a></span> <span class="normal">Dịch vụ Khách hàng Ưu tiên</a></span></li>
                            <li><span class="top">Khách hàng Doanh nghiệp</a></span> <span class="normal">Tiền gửi</a></span> <span class="normal">Cho vay</a></span> <span class="normal">Thanh toán &amp; QL dòng tiền</a></span> <span class="normal">TT Quốc tế &amp; Tài trợ thương mại</a></span> <span class="normal">KD Ngoại tệ &amp; Thị trường vốn</a></span></li>
                            <li><span class="top">Dịch vụ tiện ích</a></span> <span class="normal">VietinBank iPay</a></span> <span class="normal">iPay Mobile</a></span> <span class="normal">VietinBank eFAST</a></span> <span class="normal">SMS Banking</a></span> <span class="normal">BankPlus</a></span></li>
                        </ul>
                    </div>
                    <div class="pright" >
                        <ul>
                            <li>
                            <span class="top">Sản phẩm mới</a></span><span class="normal">Chuyển tiền di động, rút tiền linh hoạt không cần thẻ</a></span>
                            <span class="normal">Ứng tiền mặt lên tới 100% hạn mức từ thẻ CASHPlus</a></span>
                            <span class="normal">Tiết kiệm Phúc Lộc - Sản phẩm dành cho khách hàng trung niên</a></span>
                            </li>
                        </ul>
                    </div>
            </div>
        </div>
    </body>
    <%

    //out.write("Welcome to DCT Academic Management");

    %>
</TD></TR></TABLE>
<%@ include file="footer.html" %>

