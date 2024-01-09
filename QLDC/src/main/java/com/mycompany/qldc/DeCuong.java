/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qldc;

/**
 *
 * @author Admin
 */
public class DeCuong {
    private String id;
    private String mucTieu;
    private String chuanDauRa;
    private HeDaoTao he;
    private GiangVien gV;
    private MonHoc mh;

    public DeCuong(){}
    
    public DeCuong(String id, String mucTieu, String chuanDauRa, HeDaoTao he, GiangVien gV, MonHoc mh){
        this.chuanDauRa = chuanDauRa;
        this.gV = gV;
        this.he = he;
        this.id = id;
        this.mh = mh;
        this.mucTieu = mucTieu;
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
     * @return the mucTieu
     */
    public String getMucTieu() {
        return mucTieu;
    }

    /**
     * @param mucTieu the mucTieu to set
     */
    public void setMucTieu(String mucTieu) {
        this.mucTieu = mucTieu;
    }

    /**
     * @return the chuanDauRa
     */
    public String getChuanDauRa() {
        return chuanDauRa;
    }

    /**
     * @param chuanDauRa the chuanDauRa to set
     */
    public void setChuanDauRa(String chuanDauRa) {
        this.chuanDauRa = chuanDauRa;
    }

    /**
     * @return the he
     */
    public HeDaoTao getHe() {
        return he;
    }

    /**
     * @param he the he to set
     */
    public void setHe(HeDaoTao he) {
        this.he = he;
    }

    /**
     * @return the gV
     */
    public GiangVien getgV() {
        return gV;
    }

    /**
     * @param gV the gV to set
     */
    public void setgV(GiangVien gV) {
        this.gV = gV;
    }

    /**
     * @return the mh
     */
    public MonHoc getMh() {
        return mh;
    }

    /**
     * @param mh the mh to set
     */
    public void setMh(MonHoc mh) {
        this.mh = mh;
    }
    
}
