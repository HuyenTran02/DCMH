/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qldc;

import java.util.List;

/**
 *
 * @author Admin
 */
public class MonHoc {
    private String id;
    private String ten;
    private String moTa;
    private float soTC;
    private KhoiKienThuc kt;
    private List<MonHoc> dstq;
    private List<MonHoc> dstr;
    
    public MonHoc() {}

    public MonHoc(String id, String ten, String moTa, float soTC, KhoiKienThuc kt) {
        this.id = id;
        this.moTa = moTa;
        this.soTC = soTC;
        this.ten = ten;
        this.kt = kt;
    }

    public MonHoc(String id, String ten, String moTa, float soTC, KhoiKienThuc kt,
            List<MonHoc> dstq, List<MonHoc> dstr) {
        this.id = id;
        this.moTa = moTa;
        this.soTC = soTC;
        this.ten = ten;
        this.kt = kt;
        this.dstq = dstq;
        this.dstr = dstr;
    }

    public MonHoc(String id, String ten, String moTa, float soTC, KhoiKienThuc kt, 
            List<MonHoc> dstr) {
        this.id = id;
        this.moTa = moTa;
        this.soTC = soTC;
        this.ten = ten;
        this.kt = kt;
        this.dstr = dstr;
    }

    public boolean checkList(MonHoc m) {
        for (MonHoc mon : this.dstq) {
            if (mon.equals(m) == true) {
                return true;
            }
        }
        for (MonHoc mon : this.dstr) {
            if (mon.equals(m) == true) {
                return true;
            }
        }
        return false;
    }
     
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the moTa
     */
    public String getMoTa() {
        return moTa;
    }

    /**
     * @param moTa the moTa to set
     */
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    /**
     * @return the soTC
     */
    public float getSoTC() {
        return soTC;
    }

    /**
     * @param soTC the soTC to set
     */
    public void setSoTC(float soTC) {
        this.soTC = soTC;
    }

    /**
     * @return the kt
     */
    public KhoiKienThuc getKt() {
        return kt;
    }

    /**
     * @param kt the kt to set
     */
    public void setKt(KhoiKienThuc kt) {
        this.kt = kt;
    }

    /**
     * @return the dstq
     */
    public List<MonHoc> getDstq() {
        return dstq;
    }

    /**
     * @param dstq the dstq to set
     */
    public void setDstq(List<MonHoc> dstq) {
        this.dstq = dstq;
    }

    /**
     * @return the dstr
     */
    public List<MonHoc> getDstr() {
        return dstr;
    }

    /**
     * @param dstr the dstr to set
     */
    public void setDstr(List<MonHoc> dstr) {
        this.dstr = dstr;
    }
}
