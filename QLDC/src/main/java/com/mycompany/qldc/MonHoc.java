/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qldc;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class MonHoc implements Comparable {

    private static int id = 1;
    private int maMon;
    private String tenMon;
    private String moTa;
    private int soTinChi;
    private KhoiKienThuc khoiKienThuc;
    private List<MonHoc> dsMonHocTruoc;
    private List<MonHoc> dsMonHocTienQuyet;

    public MonHoc() {
    }

    public MonHoc(String tenMon, String moTa, int soTinChi, KhoiKienThuc khoiKienThuc) {
        this.maMon = id;
        this.tenMon = tenMon;
        this.moTa = moTa;
        this.soTinChi = soTinChi;
        this.khoiKienThuc = khoiKienThuc;
        this.dsMonHocTruoc = new ArrayList<>();
        this.dsMonHocTienQuyet = new ArrayList<>();

        id++;
    }

    public int getMaMon() {
        return maMon;
    }

    public void setMaMon(int maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public List<MonHoc> getDsMonHocTruoc() {
        return dsMonHocTruoc;
    }

    public void setDsMonHocTruoc(List<MonHoc> dsMonHocTruoc) {
        this.dsMonHocTruoc = dsMonHocTruoc;
    }

    public List<MonHoc> getDsMonHocTienQuyet() {
        return dsMonHocTienQuyet;
    }

    public void setDsMonHocTienQuyet(List<MonHoc> dsMonHocTienQuyet) {
        this.dsMonHocTienQuyet = dsMonHocTienQuyet;
    }

    public KhoiKienThuc getKhoiKienThuc() {
        return khoiKienThuc;
    }

    public void setKhoiKienThuc(KhoiKienThuc khoiKienThuc) {
        this.khoiKienThuc = khoiKienThuc;
    }

    @Override
    public String toString() {
        return "Ma Mon Hoc: " + maMon
                + "\nTen Mon Hoc: " + tenMon
                + "\nMo Ta: " + moTa
                + "\nSo Tin Chi: " + soTinChi
                + "\nKhoi Kien Thuc: " + khoiKienThuc
                + "\n=============================";
    }

    @Override
    public int compareTo(Object o) {
        var monHoc = (MonHoc) o;
        var ketQuaSoSanh = this.soTinChi - monHoc.getSoTinChi();
        if (ketQuaSoSanh == 0) {
            ketQuaSoSanh = this.maMon - monHoc.getMaMon();
        }
        return ketQuaSoSanh;
    }

    public boolean themMonTienQuyet(MonHoc monHoc) {
        if (this.dsMonHocTienQuyet.size() >= 3) {
            return false;
        }
        for (var monHocTienQuyet : dsMonHocTienQuyet) {
            if (monHocTienQuyet.getMaMon() == monHoc.getMaMon()) {
                return false;
            }
        }
        this.dsMonHocTienQuyet.add(monHoc);
        return true;
    }

    public boolean themMonHocTruoc(MonHoc monHoc) {
        if (this.dsMonHocTruoc.size() >= 3) {
            return false;
        }
        for (var monHocTruoc : dsMonHocTruoc) {
            if (monHocTruoc.getMaMon() == monHoc.getMaMon()) {
                return false;
            }
        }
        this.dsMonHocTruoc.add(monHoc);
        return true;
    }

    public boolean xoaMonTienQuyet(int maMon) {
        if (this.dsMonHocTienQuyet.isEmpty()) {
            return false;
        }
        for (var monHocTienQuyet : dsMonHocTienQuyet) {
            if (monHocTienQuyet.getMaMon() == maMon) {
                this.dsMonHocTienQuyet.remove(monHocTienQuyet);
                return true;
            }
        }
        return false;
    }

    public boolean xoaMonHocTruoc(int maMon) {
        if (this.dsMonHocTruoc.isEmpty()) {
            return false;
        }
        for (var monHocTruoc : dsMonHocTruoc) {
            if (monHocTruoc.getMaMon() == maMon) {
                this.dsMonHocTruoc.remove(monHocTruoc);
                return true;
            }
        }
        return false;
    }
}
