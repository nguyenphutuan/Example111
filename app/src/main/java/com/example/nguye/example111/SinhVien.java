package com.example.nguye.example111;

/**
 * Created by nguyen phu tuan on 3/7/2016.
 */
public class SinhVien {
    private String ten;
    private String hinh;
    private String tuoi;

    public SinhVien(String ten, String hinh, String tuoi) {
        this.ten = ten;
        this.hinh = hinh;
        this.tuoi = tuoi;
    }



    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }
}
