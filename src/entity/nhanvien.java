/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author TuDao
 */
public class nhanvien {

    static int s_mnv = 1;
    String mnv, usrname, passwd, hoten, gioitinh, diachi, sdt;
    boolean login_state;

    public nhanvien(String usrname, String passwd) {
        this.mnv = "nv" + s_mnv;
        this.usrname = usrname;
        this.passwd = passwd;
        this.login_state=true;
        s_mnv++;
    }

    public void edit(String usrname, String passwd, String ten, 
            String gioitinh, String diachi, String sdt, boolean login) {
        this.usrname = usrname;
        this.passwd = passwd;
        this.hoten = ten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.login_state=login;
    }
}
