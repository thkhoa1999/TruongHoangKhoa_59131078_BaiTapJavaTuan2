
package BT1SoDo;

import java.util.ArrayList;


public class QLDS implements IQLDS{
    ArrayList<CaNhan> ds;

    public QLDS() {
        ds = new ArrayList();
    }

    @Override
    public int them(CaNhan p) {
        ds.add(p);
        return 1;
    }

    @Override
    public int xoa(String ten) {
        for (int i = 0; i<ds.size(); i++){
            if (ds.get(i).getHoTen().equals(ten)){
                ds.remove(i);
            }
        }
        return 1;
    }

    @Override
    public void inDS() {
        for(int i=0; i<ds.size(); i++){
            ds.get(i).hienThiTT();
        }
    }
     
}