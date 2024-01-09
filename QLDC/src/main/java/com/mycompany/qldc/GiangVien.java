/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qldc;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class GiangVien {
    private String MaGV;
    private String ten;
    private Date ngaySinh;
    private String hocVi;
    private String chucVu;

    public GiangVien(){}
    
    public GiangVien(String MaGV, String ten, Date ngaySinh, String hocVi, String chucVu){
        this.MaGV = MaGV;
        this.chucVu = chucVu;
        this.hocVi = hocVi;
        this.ngaySinh = ngaySinh;
        this.ten = ten;
    }
    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the hocVi
     */
    public String getHocVi() {
        return hocVi;
    }

    /**
     * @param hocVi the hocVi to set
     */
    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    /**
     * @return the chucVu
     */
    public String getChucVu() {
        return chucVu;
    }

    /**
     * @param chucVu the chucVu to set
     */
    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    /**
     * @return the MaGV
     */
    public String getMaGV() {
        return MaGV;
    }

    /**
     * @param MaGV the MaGV to set
     */
    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
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
    
}
