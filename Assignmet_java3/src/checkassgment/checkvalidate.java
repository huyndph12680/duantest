/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkassgment;

import javax.swing.JOptionPane;
import model.User;
import model.UserDAO;

/**
 *
 * @author Admin
 */
public class checkvalidate {
    public boolean checkemty(String txt){
        
    if(txt.isBlank()){
        JOptionPane.showMessageDialog(null, "trường không để trống !", "thông báo ",JOptionPane.WARNING_MESSAGE);
        return false;
    }
        return true;
    }
    public boolean checktaikhoan(String txt){
    String reCode = "[f]{1}[p]{1}[t]{1}[0-9]{5}";
    if(!txt.matches(reCode)){
    JOptionPane.showMessageDialog(null, "định dạng tài khoản sai \n mời nhập theo định dạng fpt12345", "thông báo", JOptionPane.WARNING_MESSAGE);
    return false;
    }
        return true;
    }
    
}
