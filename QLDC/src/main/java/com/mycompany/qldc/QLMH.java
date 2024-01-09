/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qldc;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QLMH {

    private List<MonHoc> mh = new ArrayList<>();

    public void themMH(MonHoc... m) {
        this.mh.addAll(Arrays.asList(m));
    }

    public void themMH(MonHoc m) throws ParseException {
        this.mh.add(m);
    }

    public boolean xoaMH(MonHoc m) {
        if (mh.remove(m) == true) {
            return true;
        }
        return false;
    }

    public void suaMH(MonHoc m) {

    }

    public MonHoc timMHTheoTen(String tuKhoa) {
        for (MonHoc m : mh) {
            if (m.getTen().equals(tuKhoa) == true) {
                return m;
            }
        }
        return null;
    }

    public MonHoc timMHTheoId(String tuKhoa) {
        for (MonHoc m : mh) {
            if (m.getId().equals(tuKhoa) == true) {
                return m;
            }
        }
        return null;
    }

    /**
     * @return the mh
     */
    public List<MonHoc> getMh() {
        return mh;
    }

    /**
     * @param mh the mh to set
     */
    public void setMh(List<MonHoc> mh) {
        this.mh = mh;
    }
}
