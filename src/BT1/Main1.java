/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author Laptop
 */
public class Main1 {
    public static void main(String[] args) {
        NhanVien NV1 = new NhanVien("Trương Hoàng Khoa", "Khánh Hoà", 21, 9000000, 400);
        NhanVien NV2 = new NhanVien("Lê Thế Dũng", "Bình Định", 21, 8000000, 300);
        NhanVien NV3 = new NhanVien("Phạm Văn Cường", "Ninh Hoà", 21, 7000000, 200);
        
        System.out.println("Thông tin nhân viên thứ nhất \n"+NV1.getThongTin());
        System.out.println("Thông tin nhân viên thứ hai \n"+NV2.getThongTin());
        System.out.println("Thông tin nhân viên thứ ba \n"+NV3.getThongTin());
    }
}