
package BT1SoDo;


public class HocSinh extends CaNhan{
    private String lop;
    private String nangKhieu;

    public HocSinh(String lop, String nangKhieu, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

    @Override
    public void hienThiTT() {
        System.out.println("Ho ten: " + getHoTen());
        System.out.println("Tuoi: " + getTuoi());
        System.out.println("Dia chi: " + getDiaChi());
        System.out.println("So dien thoai: " + getSdt());
        System.out.println("Lop: " + lop);
        System.out.println("Nang khieu: " + nangKhieu);
    }
}