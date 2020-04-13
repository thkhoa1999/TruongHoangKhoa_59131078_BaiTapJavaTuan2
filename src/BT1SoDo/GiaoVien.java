
package BT1SoDo;


public class GiaoVien extends CaNhan{
    private String monDay;
    private String toBoMon;

    public GiaoVien() {
    }

    public GiaoVien(String monDay, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public void hienThiTT() {
        System.out.println("Ho ten: " + getHoTen());
        System.out.println("Tuoi: " + getTuoi());
        System.out.println("Dia chi: " + getDiaChi());
        System.out.println("So dien thoai: " + getSdt());
        System.out.println("Mon day: "+ monDay);
        System.out.println("To Bo Mon: "+ toBoMon);
    }
}