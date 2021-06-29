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
public class sinhviendiem {
    private String masv , hoten;
    private float tienganh,tinhoc,gdtc;

    public sinhviendiem() {
    }

    public sinhviendiem(String masv, String hoten, float tienganh, float tinhoc, float gdtc) {
        this.masv = masv;
        this.hoten = hoten;
        this.tienganh = tienganh;
        this.tinhoc = tinhoc;
        this.gdtc = gdtc;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float getTienganh() {
        return tienganh;
    }

    public void setTienganh(float tienganh) {
        this.tienganh = tienganh;
    }

    public float getTinhoc() {
        return tinhoc;
    }

    public void setTinhoc(float tinhoc) {
        this.tinhoc = tinhoc;
    }

    public float getGdtc() {
        return gdtc;
    }

    public void setGdtc(float gdtc) {
        this.gdtc = gdtc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sinhviendiem{masv=").append(masv);
        sb.append(", hoten=").append(hoten);
        sb.append(", tienganh=").append(tienganh);
        sb.append(", tinhoc=").append(tinhoc);
        sb.append(", gdtc=").append(gdtc);
        sb.append('}');
        return sb.toString();
    }
    
    
     
    
}
