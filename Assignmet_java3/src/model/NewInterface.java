/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface NewInterface {
    public boolean insert ();
    public sinhviendiem Find (String masv);
    public void Delete (String masv);
    public void update ();
    public List getlist();
    
}
