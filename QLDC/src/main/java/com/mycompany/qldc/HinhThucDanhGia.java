/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qldc;

/**
 *
 * @author Admin
 */
class HinhThucDanhGia {

    private static int id = 1;
    int maHinhThucDanhGia;
    String phuongPhap;
    String noiDung;

    public HinhThucDanhGia() {
    }

    public HinhThucDanhGia(String phuongPhap, String noiDung) {
        this.maHinhThucDanhGia = id;
        this.phuongPhap = phuongPhap;
        this.noiDung = noiDung;
        
        id++;
    }

    public int getMaHinhThucDanhGia() {
        return maHinhThucDanhGia;
    }

    public void setMaHinhThucDanhGia(int maHinhThucDanhGia) {
        this.maHinhThucDanhGia = maHinhThucDanhGia;
    }

    public String getPhuongPhap() {
        return phuongPhap;
    }

    public void setPhuongPhap(String phuongPhap) {
        this.phuongPhap = phuongPhap;
    }

    @Override
    public String toString() {
        return "Ma Hinh Thuc Danh Gia: " + maHinhThucDanhGia
                + "\nPhuong Phap: " + phuongPhap
                + "\nNoi Dung: " + noiDung;
    }
}
