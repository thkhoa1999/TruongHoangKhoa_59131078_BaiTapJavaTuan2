/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import BT1.NhanVien;

/**
 *
 * @author Laptop
 */
public class Main2 {
    public static void main(String[] args) {
        QuanLyNhanVien QLNV = new QuanLyNhanVien();
        
        NhanVien NV1 = new NhanVien("Lê Văn A", "Khánh Hoà", 21, 900000, 500);
        NhanVien NV2 = new NhanVien("Lê Văn B", "Khánh Hoà", 21, 800000, 450);
        NhanVien NV3 = new NhanVien("Lê Văn C", "Khánh Hoà", 21, 700000, 300);
        NhanVien NV4 = new NhanVien("Lê Văn D", "Khánh Hoà", 21, 600000, 200);
        NhanVien NV5 = new NhanVien("Lê Văn A", "Khánh Hoà", 21, 6000000, 180);       
        QLNV.them(NV1);
        QLNV.them(NV2);
        QLNV.them(NV3);
        QLNV.them(NV4);
        QLNV.them(NV5);
        QLNV.inDS();
    }
}