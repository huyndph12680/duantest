/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class User {
    private  String username;
    private  String Passwword;
    private String role;

    public User() {
    }

    public User(String username, String Passwword) {
        this.username = username;
        this.Passwword = Passwword;
    }

    public User(String username, String Passwword, String role) {
        this.username = username;
        this.Passwword = Passwword;
        this.role = role;
    }

    public String getPasswword() {
        return Passwword;
    }

    public String getUsername() {
        return username;
    }

    public void setPasswword(String Passwword) {
        this.Passwword = Passwword;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    

    public void setUsername(String username) {
        this.username = username;
    }
   
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(username);
//        sb.append(Passwword);
//        sb.append(role);
//        return sb.toString();
//    }
//     

    @Override
    public String toString() {
        return username + "'" + Passwword + "'" + role ;
    }
    
}
