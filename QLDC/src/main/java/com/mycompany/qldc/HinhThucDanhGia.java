/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qldc;

/**
 *
 * @author Admin
 */
public abstract class HinhThucDanhGia {
    private int ma;
    private String phuongPDG;
    private String noiDung;
    private float tiTrong;
    public HinhThucDanhGia(){}
    public abstract void them();
    public abstract void xoa();

    /**
     * @return the ma
     */
    public int getMa() {
        return ma;
    }

    /**
     * @param ma the ma to set
     */
    public void setMa(int ma) {
        this.ma = ma;
    }

    /**
     * @return the phuongPDG
     */
    public String getPhuongPDG() {
        return phuongPDG;
    }

    /**
     * @param phuongPDG the phuongPDG to set
     */
    public void setPhuongPDG(String phuongPDG) {
        this.phuongPDG = phuongPDG;
    }

    /**
     * @return the noiDung
     */
    public String getNoiDung() {
        return noiDung;
    }

    /**
     * @param noiDung the noiDung to set
     */
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    /**
     * @return the tiTrong
     */
    public float getTiTrong() {
        return tiTrong;
    }

    /**
     * @param tiTrong the tiTrong to set
     */
    public void setTiTrong(float tiTrong) {
        this.tiTrong = tiTrong;
    }
}
