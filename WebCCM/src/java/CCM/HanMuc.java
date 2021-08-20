/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CCM;

import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author THANH
 */
public class HanMuc {
    private int Mahm,hanmuc;
    
public HanMuc(){
   try {
                Class.forName("net.sourceforge.jtds.jdbc.Driver");                  
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HanMuc.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public HanMuc(int Mahm, int hanmuc) {
        this.Mahm = Mahm;
        this.hanmuc = hanmuc;
    }

    public int getMahm() {
        return Mahm;
    }

    public void setMahm(int Mahm) {
        this.Mahm = Mahm;
    }

    public int getHanmuc() {
        return hanmuc;
    }

    public void setHanmuc(int hanmuc) {
        this.hanmuc = hanmuc;
    }

    @Override
    public String toString() {
        return "HanMuc{" + "Mahm=" + Mahm + ", hanmuc=" + hanmuc + '}';
    }

     public static Vector<HanMuc> getAll() {
        Vector<HanMuc> v = new Vector<HanMuc>();
        Connection con = null;
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:jtds:sqlserver://THANH-PC:1433/CongThanh","sa","12345");
            PreparedStatement stmt = con.prepareStatement("Select MaHM,HanMuc from HanMuc");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){                    
                int Mhm=rs.getInt(1);
                int hm=rs.getInt(2);
            }
        } catch (Exception e) {
            Logger.getLogger(HanMuc.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                con.close();
            } catch (Exception ex) {
                Logger.getLogger(HanMuc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return v;
    }

}
