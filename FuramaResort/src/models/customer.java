package models;

import java.util.Date;

public class customer {
    private int id;
    private String hoten;
    private int ngaysinh ;
    private String gioitinh;
    private int CMND;
    private int SDT;
    private String Email;
    private String loaikhach;
    private String diachi;

    public customer(int id, String hoten,int ngaysinh, String gioitinh, int CMND, int SDT, String email, String loaikhach, String diachi) {
        this.id = id;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.CMND = CMND;
        this.SDT = SDT;
        Email = email;
        this.loaikhach = loaikhach;
        this.diachi = diachi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(int ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getLoaikhach() {
        return loaikhach;
    }

    public void setLoaikhach(String loaikhach) {
        this.loaikhach = loaikhach;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}

