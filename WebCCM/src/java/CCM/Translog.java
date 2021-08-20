package CCM;


import java.io.Serializable;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.text.DecimalFormat;
import java.util.Vector;
import java.util.logging.Logger;/*
import 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author THANH
 */
public class Translog implements Serializable {
    
    DecimalFormat df=new DecimalFormat("0.00");
    private String Mathe,Diachi,Mota,LoaiGD;
    private double Sotien;
    private Date NgayGioGD;
    private int LogID;

    public Translog(){
         try {
                Class.forName("net.sourceforge.jtds.jdbc.Driver");                  
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Translog.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    public Translog(String Mathe){
        this();
      Connection con=null;
      try{
          con = DriverManager.getConnection("jdbc:jtds:sqlserver://THANH-PC:1433/CongThanh","sa","12345");
            PreparedStatement stmt = con.prepareStatement("Select Mathe,NgayGioGD,Diachi,Sotien,LoaiGD,Mota,LogID from translog where MaThe=?");
            stmt.setString(1, Mathe);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                this.Mathe = Mathe;
                NgayGioGD=rs.getDate("NgayGioGD");
                Diachi=rs.getString("Diachi");
                Sotien=rs.getDouble("Sotien");
                LoaiGD = rs.getString("LoaiGD");
                Mota = rs.getString("Mota");
                LogID = rs.getInt("LogID");
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
    public boolean AddTransLog(String MaThe,String Diachi,double SoTien,String LoaiGiaoDich,String MoTa){
         Connection con=null;
            String sql="insert into TransLog(Mathe,DiaChi,Sotien,LoaiGD,Mota) values(?,?,?,?,?)";
        try {
              Class.forName("net.sourceforge.jtds.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:jtds:sqlserver://THANH-PC:1433/CongThanh","sa","12345");
              PreparedStatement st=con.prepareStatement(sql);
              st.setString(1,MaThe);
              st.setString(2,Diachi);
              st.setDouble(3,SoTien);
              st.setString(4,LoaiGiaoDich);
              st.setString(5,MoTa);
              st.executeUpdate();
              
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Translog.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
          
        }
        public static java.sql.Date setNgayGioGiaoDich (String NgayGioGiaoDich){
        SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
        Date d;
        try {
            return new Date(sd.parse(NgayGioGiaoDich).getTime());
        } catch (ParseException e) {
        }
        return null;
    }
    public Translog(String Mathe, String Diachi, String Mota, String LoaiGD, double Sotien, Date NgayGioGD, int LogID) {
        this.Mathe = Mathe;
        this.Diachi = Diachi;
        this.Mota = Mota;
        this.LoaiGD = LoaiGD;
        this.Sotien = Sotien;
        this.NgayGioGD = NgayGioGD;
        this.LogID = LogID;
    }

    public String getMathe() {
        return Mathe;
    }

    public void setMathe(String Mathe) {
        this.Mathe = Mathe;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public String getLoaiGD() {
        return LoaiGD;
    }

    public void setLoaiGD(String LoaiGD) {
        this.LoaiGD = LoaiGD;
    }

    public double getSotien() {
        return Sotien;
    }

    public void setSotien(double Sotien) {
        this.Sotien = Sotien;
    }

    public Date getNgayGioGD() {
        return NgayGioGD;
    }

    public void setNgayGioGD(Date NgayGioGD) {
        this.NgayGioGD = NgayGioGD;
    }

    public int getLogID() {
        return LogID;
    }

    public void setLogID(int LogID) {
        this.LogID = LogID;
    }

    @Override
    public String toString() {
        return "Translog{" + "Mathe=" + Mathe + ", Diachi=" + Diachi + ", Mota=" + Mota + ", LoaiGD=" + LoaiGD + ", Sotien=" + Sotien + ", NgayGioGD=" + NgayGioGD + ", LogID=" + LogID + '}';
    }
    public void setAttribute(Translog T)
    {
        Mathe = T.Mathe;
        Diachi = T.Diachi;
        Mota = T.Mota;
        LoaiGD = T.LoaiGD;
        Sotien = T.Sotien;
        NgayGioGD =T.NgayGioGD;
        LogID=T.LogID;
    }
    public static Vector getall(creditcard cc)  {
    Vector v=new Vector();
    Connection con=null;
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:jtds:sqlserver://THANH-PC:1433/CongThanh","sa","12345");
            PreparedStatement stmt=con.prepareStatement("SELECT  Mathe,NgayGioGD,Sotien,Mota,DiaChi,LoaiGD FROM translog where Mathe=?");    
            stmt.setString(1,cc.getMathe());
            ResultSet rs=stmt.executeQuery();
            int i=0;
            while(rs.next()){
                Translog t=new Translog();
                t.setMathe(rs.getString("Mathe"));
                t.setNgayGioGD(rs.getDate("NgayGioGD"));
                t.setSotien(rs.getDouble("Sotien"));
                t.setMota(rs.getString("Mota"));
                t.setDiachi(rs.getString("DiaChi"));
                t.setLoaiGD(rs.getString("LoaiGD"));
                v.add(t);
                i++;
            }
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(Translog.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return v;
    
}
     public static void main(String[] args) {
        //TODO code application logic here
         Translog c=new Translog("9704158403344480");
         System.out.println(c);
         //c.AddTransLog("9704158394030239", "TT", "40000000.00", "Thành Công", "41 Cao Thắng");
}
}