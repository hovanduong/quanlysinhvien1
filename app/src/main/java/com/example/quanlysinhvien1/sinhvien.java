package com.example.quanlysinhvien1;

public class sinhvien {
    private String masinhvien;
    private String hoten;
    private String ngaysinh;
    private String gioitinh;

    public sinhvien() {
    }

    public sinhvien(String masinhvien, String hoten, String ngaysinh, String gioitinh) {
        this.masinhvien = masinhvien;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
    }

    public String getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
}