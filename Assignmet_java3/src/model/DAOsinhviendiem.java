/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DAOsinhviendiem implements NewInterface {

    List<sinhviendiem> ls = new ArrayList();

    @Override
    public boolean insert() {
        return false;

    }

    @Override
    public sinhviendiem Find(String masv) {
//        List<sinhviendiem> ls = new ArrayList();
        try {
//            Connection con = DBconnect.getconnect("assignment");
//            String sql = "select * from sinhvien where masv = ?";
//            PreparedStatement pstm = con.prepareStatement(sql);
//            pstm.setString(1, masv);
//            pstm.executeUpdate();
//            ResultSet rs = pstm.executeQuery(sql);
//            while (rs.next()) {
//                String hoten = rs.getString(1);
//                String masv1 = rs.getString(2);
//                Float ta = rs.getFloat(3);
//                Float tin = rs.getFloat(4);
//                Float gdtc = rs.getFloat(5);
//                sinhviendiem sv = new sinhviendiem(masv, hoten, ta, tin, gdtc);
//                return sv;
//            }
            for (sinhviendiem x : getlist()) {
                if (x.getMasv().trim().equals(masv.trim())) {                 
//                txtfullname.setText(x.getHoten());
//                txtgdtc.setText(x.getGdtc() + "");
//                txtmasv.setText(x.getMasv());
//                txttienganh.setText(x.getTienganh() + "");
//                txttinhoc.setText(x.getTinhoc() + "");
                    if (x.getMasv().matches(masv)) {
                        JOptionPane.showMessageDialog(null, x.toString());
                    }
                }
                if (!x.getMasv().matches(masv)) {
                    JOptionPane.showMessageDialog(null, "không tìm thấy sinh viên");
                }
            }
        } catch (Exception e) {
        }
        return null;

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
    public List<sinhviendiem> getlist() {
//        String sql = "select * from sinhvien";
//
//        try (
//                 Connection con = DBconnect.getconnect("assignment");  Statement stm = con.createStatement();  ResultSet rs = stm.executeQuery(sql);) {
//            while (rs.next()) {
//                String hoten = rs.getString(1);
//                String masv = rs.getString(2);
//                Float tienganh = Float.parseFloat(rs.getString(3));
//                Float tinhoc = Float.parseFloat(rs.getString(4));
//                Float gdtc = Float.parseFloat(rs.getString(5));
//                Float diemtb = (tienganh + tinhoc + gdtc) / 3;
//                sinhviendiem sv = new sinhviendiem(masv, hoten, tienganh, tinhoc, gdtc);
//                ls.add(sv);
//                return ls;
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
//        }
        return null;
    }

}
