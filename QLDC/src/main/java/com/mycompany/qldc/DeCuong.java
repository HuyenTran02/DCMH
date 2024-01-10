/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qldc;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
class DeCuong implements Comparable {

    private static int id = 1;
    int maDeCuong;
    MonHoc monHoc;
    HeDaoTao heDaoTao;
    List<String> mucTieu;
    List<String> chuanDauRa;
    List<String> noiDung;
    GiangVien giangVien;
    Map<HinhThucDanhGia, Integer> dsHinhThucDanhGia;

    public DeCuong() {
    }

    public DeCuong(MonHoc monHoc, HeDaoTao heDaoTao, List<String> mucTieu, List<String> chuanDauRa, List<String> noiDung, GiangVien giangVien, Map<HinhThucDanhGia, Integer> dsHinhThucDanhGia) {
        this.maDeCuong = id;
        this.monHoc = monHoc;
        this.heDaoTao = heDaoTao;
        this.mucTieu = mucTieu;
        this.chuanDauRa = chuanDauRa;
        this.noiDung = noiDung;
        this.giangVien = giangVien;
        this.dsHinhThucDanhGia = dsHinhThucDanhGia;

        id++;
    }

    public int getMaDeCuong() {
        return maDeCuong;
    }

    public void setMaDeCuong(int maDeCuong) {
        this.maDeCuong = maDeCuong;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(MonHoc monHoc) {
        this.monHoc = monHoc;
    }

    public HeDaoTao getHeDaoTao() {
        return heDaoTao;
    }

    public void setHeDaoTao(HeDaoTao heDaoTao) {
        this.heDaoTao = heDaoTao;
    }

    public List<String> getMucTieu() {
        return mucTieu;
    }

    public void setMucTieu(List<String> mucTieu) {
        this.mucTieu = mucTieu;
    }

    public List<String> getChuanDauRa() {
        return chuanDauRa;
    }

    public void setChuanDauRa(List<String> chuanDauRa) {
        this.chuanDauRa = chuanDauRa;
    }

    public List<String> getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(List<String> noiDung) {
        this.noiDung = noiDung;
    }

    public GiangVien getGiangVien() {
        return giangVien;
    }

    public void setGiangVien(GiangVien giangVien) {
        this.giangVien = giangVien;
    }

    public Map<HinhThucDanhGia, Integer> getDsHinhThucDanhGia() {
        return dsHinhThucDanhGia;
    }

    public void setDsHinhThucDanhGia(Map<HinhThucDanhGia, Integer> dsHinhThucDanhGia) {
        this.dsHinhThucDanhGia = dsHinhThucDanhGia;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Ma De Cuong: ").append(maDeCuong)
                .append("\nMon Hoc: ").append(monHoc.getTenMon())
                .append("\nHe Dao Tao: ").append(heDaoTao)
                .append("\nMuc Tieu: ").append(String.join("\n - ", mucTieu))
                .append("\nChuan Dau Ra: ").append(String.join("\n - ", chuanDauRa))
                .append("\nNoi Dung: ").append(String.join("\n - ", noiDung))
                .append("\nGiang Vien: ").append(giangVien.getTenGv())
                .append("\n===== Hinh Thuc Danh Gia =====\n");

        for (var entry : dsHinhThucDanhGia.entrySet()) {
            HinhThucDanhGia hinhThucDanhGia = entry.getKey();
            int tyTrong = entry.getValue();
            result.append(hinhThucDanhGia.toString()).append(" - Ty trong: ").append(tyTrong).append("%\n=============================\n");
        }

        return result.toString();
    }

    public boolean themMonTienQuyet(MonHoc monHoc) {
        return this.monHoc.themMonTienQuyet(monHoc);
    }

    public boolean themMonHocTruoc(MonHoc monHoc) {
        return this.monHoc.themMonHocTruoc(monHoc);
    }

    public boolean xoaMonTienQuyet(int maMon) {
        return this.monHoc.xoaMonTienQuyet(maMon);
    }

    public boolean xoaMonHocTruoc(int maMon) {
        return this.monHoc.xoaMonHocTruoc(maMon);
    }

    public boolean themHinhThucDanhGia(int tyTrong, HinhThucDanhGia hinhThucDanhGia) {
        for (var _hinhThucDanhGia : dsHinhThucDanhGia.entrySet()) {
            if (_hinhThucDanhGia.getKey().getMaHinhThucDanhGia() == hinhThucDanhGia.getMaHinhThucDanhGia()) {
                return false;
            }
        }
        this.dsHinhThucDanhGia.put(hinhThucDanhGia, tyTrong);
        return true;
    }

    public boolean xoaHinhThucDanhGia(int maHinhThucDanhGia) {
        for (var _hinhThucDanhGia : dsHinhThucDanhGia.entrySet()) {
            if (_hinhThucDanhGia.getKey().getMaHinhThucDanhGia() == maHinhThucDanhGia) {
                this.dsHinhThucDanhGia.remove(_hinhThucDanhGia);
                return true;
            }
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        var deCuong = (DeCuong) o;
        return this.monHoc.compareTo(deCuong.getMonHoc());
    }
}
