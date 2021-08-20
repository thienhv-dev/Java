package CCM;

import java.io.Serializable;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author THANH
 */
public class Customer implements Serializable {
    private String MaKH,Hoten,Matkhau,Trangthai,Email;
    private int CMND;

    public Customer(String MaKH, String Hoten, String Matkhau, String Trangthai, String Email, int CMND) {
        this.MaKH = MaKH;
        this.Hoten = Hoten;
        this.Matkhau = Matkhau;
        this.Trangthai = Trangthai;
        this.Email = Email;
        this.CMND = CMND;
    }
public Customer(){
   try {
                Class.forName("net.sourceforge.jtds.jdbc.Driver");                  
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getMatkhau() {
        return Matkhau;
    }

    public void setMatkhau(String Matkhau) {
        this.Matkhau = Matkhau;
    }

    public String getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(String Trangthai) {
        this.Trangthai = Trangthai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

   

    @Override
    public String toString() {
        return "Customer{" + "MaKH=" + MaKH + ", Hoten=" + Hoten + ", Matkhau=" + Matkhau + ", Trangthai=" + Trangthai + ", Email=" + Email + ", CMND=" + CMND + '}';
    }
     public void AddCustomer(String MaKH,String Matkhau,String HoTen,int CMND, String Email){
         Connection con=null;
            String sql="insert into Customer(MaKH,Hoten,CMND,Email,Matkhau) values(?,?,?,?,?)";
        try {
              Class.forName("net.sourceforge.jtds.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:jtds:sqlserver://THANH-PC:1433/CongThanh","sa","12345");
              PreparedStatement st=con.prepareStatement(sql);
              st.setString(1, MaKH);
              st.setString(2,HoTen);
              st.setInt(3,CMND);
              st.setString(4,Email);
              st.setString(5,Matkhau);
              st.executeUpdate();
              
        } catch (Exception ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
      public void updateCustomer(String MaKH,String HoTen,int CMND, String Email){
            Connection con=null;
            String sql="update Customer SET Hoten=?,CMND=?,Email=? where MaKH=?" ;
        try {
              Class.forName("net.sourceforge.jtds.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:jtds:sqlserver://THANH-PC:1433/CongThanh","sa","12345");
              PreparedStatement st=con.prepareStatement(sql);
              st.setString(1,HoTen);
              st.setInt(2,CMND);
              st.setString(3,Email);
              st.setString(4,MaKH);
              st.executeUpdate();
              
        } catch (Exception ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
  public Customer(String MaKH){
      this();
      Connection con=null;
      try{
        con = DriverManager.getConnection("jdbc:jtds:sqlserver://THANH-PC:1433/CongThanh","sa","12345");
            PreparedStatement stmt = con.prepareStatement("Select MaKH,Hoten,CMND,Trangthai,Matkhau,Email from customer where MaKH=?");
            stmt.setString(1, MaKH);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                this.MaKH = MaKH;
                Hoten = rs.getString("Hoten");
                CMND = rs.getInt("CMND");
                Matkhau = rs.getString("MatKhau");
                Email = rs.getString("Email");
                Trangthai = rs.getString("Trangthai");
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
  }
 public void setAttribute(Customer KH)
    {
        MaKH = KH.MaKH;
        Hoten = KH.Hoten;
        Email = KH.Email;
        Matkhau = KH.Matkhau;
        Trangthai = KH.Trangthai;
        CMND = KH.CMND;
    }
  public void changePass(String newP){
      Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:jtds:sqlserver://THANH-PC:1433/CongThanh","sa", "12345");
            PreparedStatement stmt = con.prepareStatement("update customer set Matkhau=? where MaKH=?");
            stmt.setString(1, newP);
            stmt.setString(2, MaKH);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
      public static Customer login(String mkh, String pw){
        Customer c=null;
        Connection con;
        try{
            con=DriverManager.getConnection("jdbc:jtds:sqlserver://THANH-PC:1433/CongThanh","sa","12345");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("Select *from customer where MaKH='"+mkh+"' and Matkhau='"+pw+"'");
            if(rs.next())
                c=new Customer(mkh);
            con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
            return c;
        
    }
      public static void main(String[] args) {
        //TODO code application logic here
         //Customer c=new Customer("KH0012");
        // System.out.println(c);
         //c.changePass("abcd");
        System.out.println(login("KH0011","qwer"));
    
   }
}
