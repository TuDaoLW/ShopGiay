package entity;

import java.util.ArrayList;

public class ChiTietHoaDon {

    public static ArrayList<ChiTietHoaDon> dsmuaH = new ArrayList<>();
    public String ID;
    public int SL;
    public int sell;
    public int buy;
    public int MAX;

    public ChiTietHoaDon(String ID, int SL, int sell, int buy, int max) {
        this.ID = ID;
        this.SL = SL;
        this.sell = sell;
        this.buy = buy;
        this.MAX = max;
    }

    public static void delete(String id) {
        for (ChiTietHoaDon it : dsmuaH) {
            if (it.ID.equals(id)) {
                dsmuaH.remove(it);
            }
        }
    }

    public static boolean containItem(String id) {
        for (ChiTietHoaDon it : dsmuaH) {
            if (it.ID.equals(id)) {
                return true;
            }
        }
        return false;
    }

    public static ChiTietHoaDon searchItem(String id) {
        for (ChiTietHoaDon it : dsmuaH) {
            if (it.ID.equals(id)) {
                return it;
            }
        }
        return null;
    }
}
