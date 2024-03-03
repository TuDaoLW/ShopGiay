/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author TuDao
 */
public class HoaDon {

    String maHD, khachhang, sdt, nhanvien, time;
    ArrayList<Giay> giohang = new ArrayList<>();

    public HoaDon(String maHD, String khachhang, String sdt, String nhanvien, String time) {
        this.maHD = maHD;
        this.khachhang = khachhang;
        this.sdt = sdt;
        this.nhanvien = nhanvien;
        this.time = time;
    }

}
