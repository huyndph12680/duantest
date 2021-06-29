/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class SinhVienDAO implements NewInterface{

    List<SinhVien> SV = new ArrayList<>();

    public boolean insert(SinhVien sv) throws SQLException {
        String sql = "insert into svinfo\n" +
"values (?,?,?,?,?)";
        try ( Connection con = DBconnect.getconnect("assignment"); 
                PreparedStatement pstm = con.prepareStatement(sql);
                )
        {
            pstm.setString(1, sv.getMaSv());
            pstm.setString(2, sv.getName());
            pstm.setString(3, sv.getEmail());
            pstm.setString(4, sv.getSdt());
            pstm.setString(5, sv.getDiachi());
            return pstm.executeUpdate() > 0;
            
        }

    }

    public List<SinhVien> getAllsinhvien() {
        try {
            Connection con = DBconnect.getconnect("assignment");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select * from svinfo");
            while (rs.next()) {                
                String masv = rs.getString(1);
                String hoten = rs.getString(2);
                String email = rs.getString(3);
                String sdt = rs.getString(4);
                String gioitinh = rs.getString(5);
                String diachi = rs.getString(6);
                SinhVien sv = new SinhVien(hoten, masv, sdt, email, gioitinh, diachi, null);
                SV.add(sv);
                for (SinhVien sinhVien : SV) {
                    System.out.println(sinhVien);
                }
            }
            return SV;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public boolean insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    @Override
    public void Delete(String masv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getlist() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public sinhviendiem Find(String masv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
}
