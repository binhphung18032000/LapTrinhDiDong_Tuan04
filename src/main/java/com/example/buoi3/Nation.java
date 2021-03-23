package com.example.buoi3;

import java.io.Serializable;

public class Nation implements Serializable {
    int hinh;
    String tennuoc, danso;

    public Nation(int hinh, String tennuoc, String danso) {
        this.hinh = hinh;
        this.tennuoc = tennuoc;
        this.danso = danso;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTennuoc() {
        return tennuoc;
    }

    public void setTennuoc(String tennuoc) {
        this.tennuoc = tennuoc;
    }

    public String getDanso() {
        return danso;
    }

    public void setDanso(String danso) {
        this.danso = danso;
    }
}
