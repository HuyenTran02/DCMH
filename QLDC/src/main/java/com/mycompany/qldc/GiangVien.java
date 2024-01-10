/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qldc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
class GiangVien {

    private static int id = 1;
    private int maGv;
    private String tenGv;
    private List<DeCuong> dsDeCuong;

    public GiangVien() {
    }

    public GiangVien(String tenGv) {
        this.maGv = id;
        this.tenGv = tenGv;
        this.dsDeCuong = new ArrayList<>();

        id++;
    }

    public int getMaGv() {
        return maGv;
    }

    public void setMaGv(int maGv) {
        this.maGv = maGv;
    }

    public String getTenGv() {
        return tenGv;
    }

    public void setTenGv(String tenGv) {
        this.tenGv = tenGv;
    }

    public List<DeCuong> getDsDeCuong() {
        return dsDeCuong;
    }

    public void setDsDeCuong(List<DeCuong> dsDeCuong) {
        this.dsDeCuong = dsDeCuong;
    }
}
