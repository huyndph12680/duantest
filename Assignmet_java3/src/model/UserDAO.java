/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.List;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class UserDAO {
    SinhVien sv = new SinhVien();
    ArrayList<User> ls = new ArrayList<>();
    Connection con ;
    public  UserDAO(){
                try {
            String sql = "select * from taikhoan";
            Connection con = DBconnect.getconnect("assignment");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String pass = rs.getString(2);
                String role = rs.getString(3);
                ls.add(new User(id, pass, role));                             
            }

        } catch (Exception e) {
        }
//    ls.add(new User("fpt11111", "huyfpt", "Giảng viên"));
//    ls.add(new User("fpt11112", "huyfpt", "Giảng viên"));
//    ls.add(new User("fpt11113", "huyfpt", "Đào Tạo"));
//    ls.add(new User("fpt11114", "huyfpt", "Giảng viên"));
//    ls.add(new User("fpt11115", "huyfpt", "Đào Tạo"));
    }
    public  String  checkLogin(String username , String pass){
        for (User x : ls) {
            if(x.getUsername().equalsIgnoreCase(username) && x.getPasswword().equals(pass)){
            return x.getRole();
            }
        }
        return null;
    }
public boolean checkusser (String user){
        UserDAO us = new UserDAO();
        for (User x : ls) {
            System.out.println(x);
            if(x.getUsername().equalsIgnoreCase(user)){
                JOptionPane.showMessageDialog(null, "user đã tồn tại !");
                return false;
            }
        }
        return true;
    }
public void add (String user, String pass ,String vaitro){
    
    try {
        String sql = "insert into taikhoan \n" +
"values (?,?,?)";
        con = DBconnect.getconnect("assignment");
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1, user);
         pstm.setString(2, pass);
          pstm.setString(3, vaitro);
          pstm.executeUpdate();
          ls.add(new User(user, pass, vaitro));
    } catch (Exception e) {
    }
    ls.add(new User(user, pass, vaitro));
    for (User l : ls) {
        System.out.println(l+"'");
        System.out.println("==============================");
    }
}
}
