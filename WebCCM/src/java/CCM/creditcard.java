package CCM;

import java.io.Serializable;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class creditcard implements Serializable {
    private String Mathe,MaKH,status,pin,loaithe;
    private double HanMuc,SoDu;
    private int Monthhethan,Namhethan;
    private Date NgayCap;
    public creditcard(){
        try {
                Class.forName("net.sourceforge.jtds.jdbc.Driver");                  
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(creditcard.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public creditcard(String Mathe){
           this();
      Connection con=null;
      try{
        con = DriverManager.getConnection("jdbc:jtds:sqlserver://THANH-PC:1433/CongThanh","sa","12345");
            PreparedStatement stmt = con.prepareStatement("Select Mathe,MaKH,HanMuc,SoDu,Pin,Status,NgayCap,Monthhethan,Namhethan,Loaithe from creditcard where MaThe=?");
            stmt.setString(1, Mathe);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                this.Mathe = Mathe;
                MaKH=rs.getString("MaKH");
                HanMuc=rs.getDouble("HanMuc");
                SoDu=rs.getDouble("SoDu");
                pin = rs.getString("Pin");
                status = rs.getString(6);
                NgayCap = rs.getDate(7);
                Monthhethan = rs.getInt(8);
                Namhethan=rs.getInt(9);
                loaithe=rs.getString(10);
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
    public creditcard(Customer c){
           this();
      Connection con=null;
      try{
        con = DriverManager.getConnection("jdbc:jtds:sqlserver://THANH-PC:1433/CongThanh","sa","12345");
            PreparedStatement stmt = con.prepareStatement("Select Mathe,MaKH,HanMuc,SoDu,Pin,Status,NgayCap,Monthhethan,Namhethan,Loaithe from creditcard where MaKH=?");
            stmt.setString(1, c.getMaKH());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                this.MaKH = c.getMaKH();
                Mathe=rs.getString("Mathe");
                HanMuc=rs.getDouble("HanMuc");
                SoDu=rs.getDouble("SoDu");
                pin = rs.getString("Pin");
                status = rs.getString(6);
                NgayCap = rs.getDate(7);
                Monthhethan = rs.getInt(8);
                Namhethan=rs.getInt(9);
                loaithe=rs.getString(10);
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
    

    public creditcard(String Mathe, String MaKH, String status, String pin, String loaithe, double HanMuc, double SoDu, int Monthhethan, int Namhethan, Date NgayCap) {
        this.Mathe = Mathe;
        this.MaKH = MaKH;
        this.status = status;
        this.pin = pin;
        this.loaithe = loaithe;
        this.HanMuc = HanMuc;
        this.SoDu = SoDu;
        this.Monthhethan = Monthhethan;
        this.Namhethan = Namhethan;
        this.NgayCap = NgayCap;
    }

    public String getMathe() {
        return Mathe;
    }

    public void setMathe(String Mathe) {
        this.Mathe = Mathe;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getLoaithe() {
        return loaithe;
    }

    public void setLoaithe(String loaithe) {
        this.loaithe = loaithe;
    }

    public double getHanMuc() {
        return HanMuc;
    }

    public void setHanMuc(double HanMuc) {
        this.HanMuc = HanMuc;
    }

    public double getSoDu() {
        return SoDu;
    }

    public void setSoDu(double SoDu) {
        this.SoDu = SoDu;
    }

    public int getMonthhethan() {
        return Monthhethan;
    }

    public void setMonthhethan(int Monthhethan) {
        this.Monthhethan = Monthhethan;
    }

    public int getNamhethan() {
        return Namhethan;
    }

    public void setNamhethan(int Namhethan) {
        this.Namhethan = Namhethan;
    }

    public Date getNgayCap() {
        return NgayCap;
    }

    public void setNgayCap(Date NgayCap) {
        this.NgayCap = NgayCap;
    }

    @Override
    public String toString() {
        return "creditcard{" + "Mathe=" + Mathe + ", MaKH=" + MaKH + ", status=" + status + ", pin=" + pin + ", loaithe=" + loaithe + ", HanMuc=" + HanMuc + ", SoDu=" + SoDu + ", Monthhethan=" + Monthhethan + ", Namhethan=" + Namhethan + ", NgayCap=" + NgayCap + '}';
    }
    public void setAttribute(creditcard ct)
    {
        Mathe = ct.Mathe;
        MaKH = ct.MaKH;
        status = ct.status;
        pin = ct.pin;
        loaithe = ct.loaithe;
        HanMuc =ct.HanMuc;
        SoDu=ct.SoDu;
        Monthhethan=ct.Monthhethan;
        Namhethan=ct.Namhethan;     
        NgayCap=ct.NgayCap;
    }
     public static Vector<creditcard> getAll(){
        Vector vto= new Vector();
        Connection con=null;
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:jtds:sqlserver://THANH-PC:1433/CongThanh","sa","12345");
            PreparedStatement stmt=con.prepareStatement("select * from creditcard");
            ResultSet rs= stmt.executeQuery();
            while(rs.next()){
                String MaThe= rs.getString("Mathe");
               vto.add(rs.getString("Mathe"));
            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(creditcard.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vto;
    }
    public void changePin(String newPin){
        Connection con=null;
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:jtds:sqlserver://THANH-PC:1433/CongThanh","sa","12345");
            PreparedStatement stmt=con.prepareStatement("update creditcard set Pin=? where Mathe=?");
            stmt.setString(1,newPin);
            stmt.setString(2,Mathe);
             stmt.executeUpdate();
            con.close();
             
        } catch (Exception ex) {
            Logger.getLogger(creditcard.class.getName()).log(Level.SEVERE, null, ex);
           
        }
    }
    
    public static boolean makePayment(double soTien,String moTa,String DDiem,String loaigd,creditcard cc){
        Date d =new Date();
        int m=d.getMonth();
        int y=d.getYear();
        if(cc.getNamhethan()<y||(cc.getNamhethan()==y)&&(cc.getMonthhethan()<m))
            System.out.println("");;
        if(cc.getSoDu()+soTien > cc.getHanMuc())
            System.out.println("");;
        Connection con;
        try{
            con = DriverManager.getConnection("jdbc:jtds:sqlserver://THANH-PC:1433/CongThanh","sa","12345");
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement("update creditcard set SoDu = SoDu + ? where MaThe=?");
            stmt.setDouble(1, soTien);
            stmt.setString(2, cc.getMathe());
            int rc=stmt.executeUpdate();
            if(rc==1){
                stmt=con.prepareStatement("Insert into translog(Mathe,Sotien,Mota,Diachi,LoaiGD)values(?,?,?,?,?)");
                stmt.setString(1, cc.getMathe());
                stmt.setDouble(2, soTien);
                stmt.setString(3, moTa);
                stmt.setString(4, DDiem);
                stmt.setString(5, loaigd);
                rc=stmt.executeUpdate();
                if(rc==1)
                {
                    con.commit();
                    return true;
                }
                else
                    con.rollback();
            }
        } catch (SQLException ex) {
                Logger.getLogger(Translog.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return false;
    }
    public void AddCreditCard(String MaThe,String Makh,String pin,double HanMuc,String loaithe,int monhethan,int thanghethan){
        Connection con=null;
        String sql="insert into creditcard (MaThe,MaKH,Pin,HanMuc,Loaithe,Monthhethan,Namhethan) values(?,?,?,?,?,?,?)";
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver"); 
           con = DriverManager.getConnection("jdbc:jtds:sqlserver://THANH-PC:1433/CongThanh","sa","12345");
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1,MaThe);
            st.setString(2,Makh);
            st.setString(3,pin);
            st.setDouble(4,HanMuc);
            st.setString(5, loaithe);
            st.setInt(6,monhethan);
            st.setInt(7,thanghethan);
            st.executeUpdate();
            
        } catch (Exception ex) {
            Logger.getLogger(creditcard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void changeLevel(String HanMuc,String MaThe){
        Connection con=null;
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:jtds:sqlserver://THANH-PC:1433/CongThanh","sa","12345");
            PreparedStatement stmt=con.prepareStatement("update CreditCard set HanMuc=? where MaThe='"+MaThe+"'");
            stmt.setString(1,HanMuc);
             stmt.executeUpdate();
            con.close();
             
        } catch (Exception ex) {
            Logger.getLogger(creditcard.class.getName()).log(Level.SEVERE, null, ex);
           
        }
    }
     public static void main(String[] args)throws Exception {
        //TODO code application logic here
         creditcard c=new creditcard("9704158403344480");
//          c.makePayment(2000000.0, "Lai", "Da Nang");
         System.out.println(c);
         
}
}