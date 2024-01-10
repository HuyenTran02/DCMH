/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qldc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

class HeThongQuanLy {

    List<MonHoc> dsMonHoc;
    List<DeCuong> dsDeCuong;
    List<GiangVien> dsGiangVien;
    List<HinhThucDanhGia> dsHinhThucDanhGia;

    public HeThongQuanLy() {
        this.dsMonHoc = new ArrayList<>();
        this.dsDeCuong = new ArrayList<>();
        this.dsGiangVien = new ArrayList<>();
        this.dsHinhThucDanhGia = new ArrayList<>();
    }

    public HeThongQuanLy(List<MonHoc> dsMonHoc, List<GiangVien> dsGiangVien, List<HinhThucDanhGia> dsHinhThucDanhGia) {
        this.dsMonHoc = dsMonHoc;
        this.dsDeCuong = new ArrayList<>();
        this.dsGiangVien = dsGiangVien;
        this.dsHinhThucDanhGia = dsHinhThucDanhGia;
    }

    public List<MonHoc> getDsMonHoc() {
        return dsMonHoc;
    }

    public void setDsMonHoc(List<MonHoc> dsMonHoc) {
        this.dsMonHoc = dsMonHoc;
    }

    public List<DeCuong> getDsDeCuong() {
        return dsDeCuong;
    }

    public void setDsDeCuong(List<DeCuong> dsDeCuong) {
        this.dsDeCuong = dsDeCuong;
    }

    public List<GiangVien> getDsGiangVien() {
        return dsGiangVien;
    }

    public void setDsGiangVien(List<GiangVien> dsGiangVien) {
        this.dsGiangVien = dsGiangVien;
    }

    public List<HinhThucDanhGia> getDsHinhThucDanhGia() {
        return dsHinhThucDanhGia;
    }

    public void setDsHinhThucDanhGia(List<HinhThucDanhGia> dsHinhThucDanhGia) {
        this.dsHinhThucDanhGia = dsHinhThucDanhGia;
    }

    public MonHoc taoMonHoc(String maMon, String tenMon, String moTa, int soTinChi, KhoiKienThuc khoiKienThuc) {
        return null;
    }

    public boolean deCuongMonHocDaCoTrongHeDaoTao(int maMon, HeDaoTao heDaoTao) {
        for (var deCuong : dsDeCuong) {
            if (deCuong.getMonHoc().getMaMon() == maMon) {
                if (deCuong.getHeDaoTao() == heDaoTao) {
                    return true;
                }
            }
        }
        return false;
    }

    public DeCuong taoDeCuong(MonHoc monHoc, HeDaoTao heDaoTao, List<String> mucTieu, List<String> chuanDauRa, List<String> noiDung, GiangVien giangVien, Map<HinhThucDanhGia, Integer> dsHinhThucDanhGia) {
        DeCuong deCuong = new DeCuong(monHoc, heDaoTao, mucTieu, chuanDauRa, noiDung, giangVien, dsHinhThucDanhGia);
        this.dsDeCuong.add(deCuong);

        return deCuong;
    }

    public DeCuong timKiemDeCuongBangMa(int maDeCuong) {
        for (var deCuong : dsDeCuong) {
            if (deCuong.getMaDeCuong() == maDeCuong) {
                return deCuong;
            }
        }

        return null;
    }

    public void capNhatThongTinDeCuong(DeCuong deCuong, String mucTieu, String chuanDauRa, String noiDung, GiangVien giangVien) {

    }

    public boolean themMonHocTruoc(int maDeCuong, MonHoc monHocTruoc) {
        for (var deCuong : dsDeCuong) {
            if (deCuong.getMaDeCuong() == maDeCuong) {
                return deCuong.themMonHocTruoc(monHocTruoc);
            }
        }

        return false;
    }

    public boolean themMonHocTienQuyet(int maDeCuong, MonHoc monHocTienQuyet) {
        for (var deCuong : dsDeCuong) {
            if (deCuong.getMaDeCuong() == maDeCuong) {
                return deCuong.themMonTienQuyet(monHocTienQuyet);
            }
        }

        return false;
    }

    public boolean xoaMonHocTruoc(int maDeCuong, int maMonHocTruoc) {
        for (var deCuong : dsDeCuong) {
            if (deCuong.getMaDeCuong() == maDeCuong) {
                return deCuong.xoaMonHocTruoc(maMonHocTruoc);
            }
        }

        return false;
    }

    public boolean xoaMonHocTienQuyet(int maDeCuong, int maMonHocTienQuyet) {
        for (var deCuong : dsDeCuong) {
            if (deCuong.getMaDeCuong() == maDeCuong) {
                return deCuong.xoaMonTienQuyet(maMonHocTienQuyet);
            }
        }

        return false;
    }

    public boolean themHinhThucDanhGia(int maDeCuong, int tyTrong, HinhThucDanhGia hinhThucDanhGia) {
        for (var deCuong : dsDeCuong) {
            if (deCuong.getMaDeCuong() == maDeCuong) {
                return deCuong.themHinhThucDanhGia(tyTrong, hinhThucDanhGia);
            }
        }

        return false;
    }

    public boolean xoaHinhThucDanhGia(int maDeCuong, int maHinhThucDanhGia) {
        for (var deCuong : dsDeCuong) {
            if (deCuong.getMaDeCuong() == maDeCuong) {
                return deCuong.xoaHinhThucDanhGia(maHinhThucDanhGia);
            }
        }

        return false;
    }

    public List<MonHoc> timKiemMonHoc(String tuKhoa) {
        List<MonHoc> ketQua = new ArrayList();

        for (var monHoc : dsMonHoc) {
            if (monHoc.getMaMon() == Integer.parseInt(tuKhoa) || monHoc.getTenMon().contains(tuKhoa)) {
                ketQua.add(monHoc);
            }
        }

        return ketQua;
    }

    public MonHoc timKiemMonHocBangMaMonHoc(int maMon) {
        for (var monHoc : dsMonHoc) {
            if (monHoc.getMaMon() == maMon) {
                return monHoc;
            }
        }

        return null;
    }

    public List<MonHoc> danhSachMonHocTruoc(int maMon) {
        List<MonHoc> ketQua = new ArrayList();

        for (var monHoc : dsMonHoc) {
            if (monHoc.getMaMon() == maMon) {
                continue;
            }

            for (var monHocTruoc : monHoc.getDsMonHocTruoc()) {
                if (monHocTruoc.getMaMon() == maMon) {
                    ketQua.add(monHoc);
                    break;
                }
            }
        }

        return ketQua;
    }

    public List<MonHoc> danhSachMonHocTienQuyet(int maMon) {
        List<MonHoc> ketQua = new ArrayList();

        for (var monHoc : dsMonHoc) {
            if (monHoc.getMaMon() == maMon) {
                continue;
            }

            for (var monHocTruoc : monHoc.getDsMonHocTienQuyet()) {
                if (monHocTruoc.getMaMon() == maMon) {
                    ketQua.add(monHoc);
                    break;
                }
            }
        }

        return ketQua;
    }

    public void sapXepDeCuong() {
        Collections.sort(dsDeCuong, Collections.reverseOrder());
    }

    public List<DeCuong> danhSachDeCuongGv(int maGv) {
        for (var giangVien : dsGiangVien) {
            if (giangVien.getMaGv() == maGv) {
                return giangVien.getDsDeCuong();
            }
        }

        return new ArrayList<DeCuong>();
    }

    public GiangVien timKiemGiangVienBangMaGiangVien(int maGiangVien) {
        for (var giangVien : dsGiangVien) {
            if (giangVien.getMaGv() == maGiangVien) {
                return giangVien;
            }
        }

        return null;
    }

    public HinhThucDanhGia timKiemHinhThucDanhGiaBangMa(int maHinhThucDanhGia) {
        for (var hinhThucDanhGia : dsHinhThucDanhGia) {
            if (hinhThucDanhGia.getMaHinhThucDanhGia() == maHinhThucDanhGia) {
                return hinhThucDanhGia;
            }
        }

        return null;
    }

    public void xuatDeCuongHoanChinh(int maDeCuong) {
        DeCuong deCuong = timKiemDeCuongBangMa(maDeCuong);

        if (deCuong != null) {
            System.out.println("===== Thong Tin De Cuong =====");
            System.out.println(deCuong.toString());
            System.out.println("==============================");
        } else {
            System.out.println("De cuong khong ton tai.");
        }
    }
}
