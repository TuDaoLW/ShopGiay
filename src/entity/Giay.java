/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author TuDao
 */
public class Giay {

    String maSP, hang, size, mau, soluong, gianhap, giaban;

    public Giay(String maSP, String hang, String size, String mau, String soluong, String gianhap, String giaban) {
        this.maSP = maSP;
        this.hang = hang;
        this.size = size;
        this.mau = mau;
        this.soluong = soluong;
        this.gianhap = gianhap;
        this.giaban = giaban;
    }

    public void suaGiay(String maSP, String hang, String size, String mau, String soluong, String gianhap, String giaban) {
        this.maSP = maSP;
        this.hang = hang;
        this.size = size;
        this.mau = mau;
        this.soluong = soluong;
        this.gianhap = gianhap;
        this.giaban = giaban;
    }
}
