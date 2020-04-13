/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4;

/**
 *
 * @author Laptop
 */
public class Main4 {
    public static void main(String[] args) {
        QuanLiChuyenXe QLCX = new QuanLiChuyenXe();
        ChuyenXeNoiThanh CXNoT1 = new ChuyenXeNoiThanh(9, 200, "MS123", "Trương Hoàng Khoa", 59131078, 3000000);
        ChuyenXeNoiThanh CXNoT2 = new ChuyenXeNoiThanh(8, 190, "MS124", "Trần Minh Vương", 59134567, 2900000);
        ChuyenXeNoiThanh CXNoT3 = new ChuyenXeNoiThanh(7, 180, "MS125", "Trần Văn Biểu", 59135678, 2800000);
        ChuyenXeNgoaiThanh CXNgT1 = new ChuyenXeNgoaiThanh("Nha Trang", 4, "MS126", "Trần Văn A", 59485689, 1000000);
        ChuyenXeNgoaiThanh CXNgT2 = new ChuyenXeNgoaiThanh("Vũng Tàu", 4, "MS127", "Trần Văn B", 59131478, 2000000);
        ChuyenXeNgoaiThanh CXNgT3 = new ChuyenXeNgoaiThanh("Ninh Bình", 4, "MS128", "Trần Văn C", 59113698, 3000000);
        
        QLCX.themChuyenXe(CXNoT1);
        QLCX.themChuyenXe(CXNoT2);
        QLCX.themChuyenXe(CXNoT3);
        QLCX.themChuyenXe(CXNgT1);
        QLCX.themChuyenXe(CXNgT2);
        QLCX.themChuyenXe(CXNgT3);
        
        QLCX.inDSCX();
        
        System.out.println("Tổng doanh thu chuyến xe ngoại thành :"+QLCX.tinhDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu chuyến xe nội thành :"+QLCX.tinhDoanhThuNoiThanh());
        System.out.println("tổng doanh thu cả 2 loại xe :"+QLCX.tongDoanhThu());
    }
}