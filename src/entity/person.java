/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author TuDao
 */
public class person {

    String usrname, passwd, hoten, diachi, sdt;
    int login_state, rate, chucvu,gioitinh;

    public person() {
        this.login_state = 1;// co the dang nhap
        this.chucvu = 1;// nvien
    }

    public person(String usrname, String passwd) {
        this.usrname = usrname;
        this.passwd = passwd;
        this.login_state = 1;// co the dang nhap
        this.chucvu = 1;// nvien
    }

    public void editPerson(String usrname, String passwd, String hoten, int gioitinh, String diachi, String sdt, int login_state, int rate, int chucvu) {
        this.usrname = usrname;
        this.passwd = passwd;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.login_state = login_state;
        this.rate = rate;
        this.chucvu = chucvu;
    }

    void layDSNV() {

    }

}
