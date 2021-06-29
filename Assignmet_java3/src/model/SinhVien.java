/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private  String Name;
    private  String maSv;
    private String Sdt;
    private String Email;
    private String gioitinh;
    private String Diachi;
    private String images;

    public SinhVien() {
    }

    public SinhVien(String Name, String maSv, String Sdt, String Email, String gioitinh, String Diachi, String images) {
        this.Name = Name;
        this.maSv = maSv;
        this.Sdt = Sdt;
        this.Email = Email;
        this.gioitinh = gioitinh;
        this.Diachi = Diachi;
        this.images = images;
    }

   

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }


    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SinhVien{Name=").append(Name);
        sb.append(", maSv=").append(maSv);
        sb.append(", Sdt=").append(Sdt);
        sb.append(", Email=").append(Email);
        sb.append(", gioitinh=").append(gioitinh);
        sb.append(", Diachi=").append(Diachi);
        sb.append(", images=").append(images);
        sb.append('}');
        return sb.toString();
    }

    
   
    
}
