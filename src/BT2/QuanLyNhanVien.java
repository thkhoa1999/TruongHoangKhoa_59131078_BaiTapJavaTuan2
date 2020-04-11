  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import BT1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author Laptop
 */
public class QuanLyNhanVien {
    ArrayList<NhanVien> DSNV = new ArrayList<>();
    
    public void them(NhanVien nv){
        DSNV.add(nv);
    }
    
    public void inDS() {
       for(int i = 0; i< DSNV.size();i++)
            System.out.println(DSNV.get(i).getThongTin());
    }
}