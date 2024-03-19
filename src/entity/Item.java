package entity;

import java.util.ArrayList;

public class Item {

    public static ArrayList<Item> dsmuaH = new ArrayList<>();
    public String ID;
    public int SL;
    public int sell;
    public int buy;
    public int MAX;

    public Item(String ID, int SL, int sell, int buy, int max) {
        this.ID = ID;
        this.SL = SL;
        this.sell = sell;
        this.buy = buy;
        this.MAX = max;
    }

    public static void delete(String id) {
        for (Item it : dsmuaH) {
            if (it.ID.equals(id)) {
                dsmuaH.remove(it);
            }
        }
    }

    public static boolean containItem(String id) {
        for (Item it : dsmuaH) {
            if (it.ID.equals(id)) {
                return true;
            }
        }
        return false;
    }

    public static Item searchItem(String id) {
        for (Item it : dsmuaH) {
            if (it.ID.equals(id)) {
                return it;
            }
        }
        return null;
    }
}
