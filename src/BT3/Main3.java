/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author Laptop
 */
public class Main3 
{   
    public static void main(String[] args) {
        SinhVienPoly SV1 = new SinhVienIT(6, 8, 7, "Trương Hoàng Khoa", "Công nghệ thông tin") {} ;
        System.out.println("\nSinh vien IT cua sinh vien Poly");
        SV1.xuat();
        
        SinhVienPoly SV2 = new SinhVienBiz(8, 9.5, "Tô Phước Thái", "Tài chính ngân hàng") {};
        System.out.println("\nSinh vien Biz cua sinh vien Poly");
        SV2.xuat();
    }
}