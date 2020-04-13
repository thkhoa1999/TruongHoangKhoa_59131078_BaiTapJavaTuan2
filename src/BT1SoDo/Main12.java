package BT1SoDo;


public class Main12 {

    public static void main(String[] args) {
        LopHoc LH = new LopHoc();
        
        HocSinh HS1 = new HocSinh("61KDTM", "Đá Bóng", "Lê Văn A", 24, "Ninh Bình", "0123456789");
        HocSinh HS2 = new HocSinh("59DDT", "Bóng chày", "Lê Văn B", 23, "Khánh Hoà", "9876543210");
        HocSinh HS3 = new HocSinh("59CNTT", "Hát", "Lê Văn C", 22, "Vĩnh Phương", "1472583690");
        
        LH.themHocSinh(HS1);
        LH.themHocSinh(HS2);
        LH.themHocSinh(HS3);
        
        LH.inDSHS();
    }
    
}