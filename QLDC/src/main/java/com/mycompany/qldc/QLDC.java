/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.qldc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLDC {

    public static void main(String[] args) {
        HeThongQuanLy heThongQuanLy = khoiTaoHeThong();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Tao de cuong");
            System.out.println("2. Cap nhat thong tin de cuong");
            System.out.println("3. Tim kiem mon hoc");
            System.out.println("4. Danh sach mon hoc truoc");
            System.out.println("5. Danh sach mon hoc tien quyet");
            System.out.println("6. Sap xep de cuong");
            System.out.println("7. Danh sach de cuong cua giao vien");
            System.out.println("8. Xuat de cuong hoan chinh");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    MonHoc monHoc = null;

                    do {
                        System.out.print("Nhap ma mon hoc can lap de cuong: ");
                        int maMonHoc = scanner.nextInt();

                        monHoc = heThongQuanLy.timKiemMonHocBangMaMonHoc(maMonHoc);

                        if (monHoc == null) {
                            System.out.println("Mon hoc khong ton tai trong he thong. Vui long nhap lai");
                        }
                    } while (monHoc == null);

                    System.out.println("===== Thong tin mon hoc =====");
                    System.out.println(monHoc.toString());

                    HeDaoTao heDaoTao = null;
                    boolean daTonTaiDeCuong = false;
                    boolean quayVeManHinhChinh = false;

                    do {
                        System.out.println("Chon he dao tao:");
                        System.out.println("1. CHINH QUY");
                        System.out.println("2. LIEN THONG");

                        int heDaoTaoChoice;
                        System.out.print("Chon: ");
                        heDaoTaoChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch (heDaoTaoChoice) {
                            case 1:
                                heDaoTao = HeDaoTao.CHINH_QUY;
                                break;
                            case 2:
                                heDaoTao = HeDaoTao.LIEN_THONG;
                                break;
                            default:
                                System.out.println("Lua chon khong hop le. Vui long nhap lai");
                        }

                        daTonTaiDeCuong = heThongQuanLy.deCuongMonHocDaCoTrongHeDaoTao(monHoc.getMaMon(), heDaoTao);

                        if (daTonTaiDeCuong) {
                            System.out.println("Da ton tai de cuong cho mon hoc nay trong he dao tao. Ban co muon chon he dao tao khac hay thoat?");
                            System.out.println("1. Chon he dao tao khac");
                            System.out.println("2. Quay ve man hinh chinh");

                            int luaChon;
                            do {
                                System.out.print("Chon: ");
                                luaChon = scanner.nextInt();
                                scanner.nextLine();

                                switch (luaChon) {
                                    case 1:
                                        break;
                                    case 2:
                                        System.out.println("Quay ve man hinh chinh.");
                                        quayVeManHinhChinh = true;
                                        break;
                                    default:
                                        System.out.println("Lua chon khong hop le. Vui long nhap lai.");
                                }
                            } while (luaChon != 1 && luaChon != 2);
                        }
                        if (quayVeManHinhChinh) {
                            break;
                        }
                    } while (daTonTaiDeCuong);

                    if (quayVeManHinhChinh) {
                        break;
                    }

                    List<String> dsMucTieu = new ArrayList<>();
                    List<String> dsChuanDauRa = new ArrayList<>();
                    List<String> dsNoiDung = new ArrayList<>();

                    System.out.println("Nhap Muc Tieu:");
                    do {
                        System.out.print(" - ");
                        String mucTieu = scanner.nextLine();
                        dsMucTieu.add(mucTieu);

                        System.out.println("Ban muon nhap them Muc Tieu khac khong? (y/n)");
                        String tiepTuc = scanner.nextLine();
                        if (!tiepTuc.equalsIgnoreCase("y")) {
                            break;
                        }
                    } while (true);

                    System.out.println("Nhap Chuan Dau Ra:");
                    do {
                        System.out.print(" - ");
                        String chuanDauRa = scanner.nextLine();
                        dsChuanDauRa.add(chuanDauRa);

                        System.out.println("Ban muon nhap them Chuan Dau Ra khac khong? (y/n)");
                        String tiepTuc = scanner.nextLine();
                        if (!tiepTuc.equalsIgnoreCase("y")) {
                            break;
                        }
                    } while (true);

                    System.out.println("Nhap Noi Dung:");
                    do {
                        System.out.print(" - ");
                        String noiDung = scanner.nextLine();
                        dsNoiDung.add(noiDung);

                        System.out.println("Ban muon nhap them Noi Dung khac khong? (y/n)");
                        String tiepTuc = scanner.nextLine();
                        if (!tiepTuc.equalsIgnoreCase("y")) {
                            break;
                        }
                    } while (true);

                    GiangVien giangVien = null;
                    do {
                        System.out.print("Nhap Ma Giang Vien: ");
                        int maGiangVien = scanner.nextInt();
                        giangVien = heThongQuanLy.timKiemGiangVienBangMaGiangVien(maGiangVien);

                        if (giangVien == null) {
                            System.out.println("Khong tim thay Giang vien co ma " + maGiangVien + ". Vui long nhap lai.");
                        }
                    } while (giangVien == null);

                    Map<HinhThucDanhGia, Integer> dsHinhThucDanhGia = new HashMap();

                    int i = 0;
                    boolean themTiep = true;
                    int tongTyTrong = 0;

                    while (themTiep && i < 4) {
                        HinhThucDanhGia hinhThucDanhGia = null;
                        do {
                            System.out.println("===== Thong Tin Hinh Thuc Danh Gia " + (i + 1) + " =====");
                            System.out.print("Nhap Ma Hinh Thuc Danh Gia: ");
                            int maHinhThucDanhGia = scanner.nextInt();
                            scanner.nextLine();

                            hinhThucDanhGia = heThongQuanLy.timKiemHinhThucDanhGiaBangMa(maHinhThucDanhGia);

                            if (hinhThucDanhGia == null) {
                                System.out.println("Khong tim thay Hinh thuc danh gia co ma " + maHinhThucDanhGia + ". Vui long nhap lai.");
                            }
                        } while (hinhThucDanhGia == null);

                        if (!dsHinhThucDanhGia.containsKey(hinhThucDanhGia)) {
                            int tyTrong = 0;
                            do {
                                System.out.print("Nhap Ty trong cho Hinh Thuc Danh Gia: ");
                                tyTrong = scanner.nextInt();
                                scanner.nextLine();

                                if (tongTyTrong + tyTrong < 0 || tongTyTrong + tyTrong > 100) {
                                    System.out.println("Tong ty trong phai >= 0 va <= 100.");
                                } else {
                                    tongTyTrong += tyTrong;
                                    break;
                                }
                            } while (true);
                            dsHinhThucDanhGia.put(hinhThucDanhGia, tyTrong);
                            System.out.println("\n===== Hinh Thuc Danh Gia =====\n");
                            System.out.println(hinhThucDanhGia.toString() + "\n=============================\n");
                        } else {
                            System.out.println("Hinh thuc danh gia da ton tai trong de cuong.");
                        }
                        
                        if (tongTyTrong == 100) {
                            themTiep = false;
                            continue;
                        }

                        if (i < 3) {
                            System.out.println("Ban muon nhap them Noi Dung khac khong? (y/n)");
                            String tiepTuc = scanner.nextLine();
                            if (!tiepTuc.equalsIgnoreCase("y")) {
                                themTiep = false;
                            }
                        }

                        i++;
                    }

                    var deCuong = heThongQuanLy.taoDeCuong(monHoc, heDaoTao, dsMucTieu, dsChuanDauRa, dsNoiDung, giangVien, dsHinhThucDanhGia);
                    if (deCuong != null) {
                        System.out.println("Da tao De cuong thanh cong!");
                        heThongQuanLy.xuatDeCuongHoanChinh(deCuong.getMaDeCuong());
                    } else {
                        System.out.println("Tao De cuong that bai!");
                    }
                    break;
                }

                case 2:
                    break;
                case 3: {
                    System.out.print("Nhap ten hoac ma mon hoc: ");
                    String tuKhoa = scanner.nextLine();
                    List<MonHoc> ketQua = heThongQuanLy.timKiemMonHoc(tuKhoa);

                    if (!ketQua.isEmpty()) {
                        System.out.println("===== Ket Qua Tim Kiem =====");
                        for (MonHoc monHoc : ketQua) {
                            System.out.println(monHoc.toString());
                        }
                    } else {
                        System.out.println("Khong tim thay mon hoc nao.");
                    }
                    break;
                }
                case 4: {
                    System.out.print("Nhap ma mon hoc: ");
                    var maMonHoc = scanner.nextInt();
                    var ketQua = heThongQuanLy.danhSachMonHocTruoc(maMonHoc);

                    if (!ketQua.isEmpty()) {
                        System.out.println("===== Danh Sach Mon Hoc =====");
                        for (MonHoc monHoc : ketQua) {
                            System.out.println(monHoc.toString());
                        }
                    } else {
                        System.out.println("Khong co mon hoc nao");
                    }
                    break;
                }

                case 5: {
                    System.out.print("Nhap ma mon hoc: ");
                    var maMonHocTienQuyet = scanner.nextInt();
                    List<MonHoc> ketQua = heThongQuanLy.danhSachMonHocTienQuyet(maMonHocTienQuyet);

                    if (!ketQua.isEmpty()) {
                        System.out.println("===== Danh Sach Mon Hoc =====");
                        for (MonHoc monHoc : ketQua) {
                            System.out.println(monHoc.toString());
                        }
                    } else {
                        System.out.println("Khong co mon hoc nao");
                    }
                    break;
                }

                case 6: {
                    System.out.println("===== Truoc Sap Xep De Cuong =====");
                    for (DeCuong deCuong : heThongQuanLy.getDsDeCuong()) {
                        System.out.println(deCuong.toString());
                        System.out.println("===============================");
                    }
                    heThongQuanLy.sapXepDeCuong();
                    System.out.println("===== Ket Qua Sap Xep De Cuong =====");
                    for (DeCuong deCuong : heThongQuanLy.getDsDeCuong()) {
                        System.out.println(deCuong.toString());
                        System.out.println("===============================");
                    }
                    break;
                }
                case 7: {
                    System.out.print("Nhap ma giao vien: ");
                    var maGv = scanner.nextInt();
                    List<DeCuong> dsDeCuongGv = heThongQuanLy.danhSachDeCuongGv(maGv);

                    if (!dsDeCuongGv.isEmpty()) {
                        System.out.println("===== Danh Sach De Cuong Cua Giao Vien =====");
                        for (DeCuong deCuong : dsDeCuongGv) {
                            System.out.println(deCuong.toString());
                        }
                    } else {
                        System.out.println("Khong co de cuong nao duoc phan cong cho giao vien co ma " + maGv);
                    }
                    break;
                }
                case 8: {
                    System.out.print("Nhap ma De cuong: ");
                    int maDeCuong = scanner.nextInt();
                    scanner.nextLine();

                    heThongQuanLy.xuatDeCuongHoanChinh(maDeCuong);
                    break;
                }
                case 0:
                    System.out.println("Thoat chuong trinh. Hen gap lai!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 0);
    }

    public static HeThongQuanLy khoiTaoHeThong() {
        MonHoc monHoc1 = new MonHoc("Toan Cao Cap", "Mon hoc ve toan cao cap", 4, KhoiKienThuc.CO_SO);
        MonHoc monHoc2 = new MonHoc("Lap Trinh Java", "Hoc lap trinh bang Java", 3, KhoiKienThuc.CO_SO_CHUYEN_NGANH);
        MonHoc monHoc3 = new MonHoc("Co So Du Lieu", "Hoc ve co so du lieu", 4, KhoiKienThuc.CHUYEN_NGANH);
        MonHoc monHoc4 = new MonHoc("Mang may tinh", "Hoc ve mang may tinh", 3, KhoiKienThuc.CO_SO_CHUYEN_NGANH);
        MonHoc monHoc5 = new MonHoc("Tri tue nhan tao", "Hoc ve AI", 4, KhoiKienThuc.CHUYEN_NGANH);

        monHoc2.setDsMonHocTruoc(new ArrayList<MonHoc>(Arrays.asList(monHoc1)));
        monHoc3.setDsMonHocTruoc(new ArrayList<MonHoc>(Arrays.asList(monHoc1, monHoc2)));
        monHoc4.setDsMonHocTruoc(new ArrayList<MonHoc>(Arrays.asList(monHoc1, monHoc2, monHoc3)));
        monHoc5.setDsMonHocTruoc(new ArrayList<MonHoc>(Arrays.asList(monHoc3)));
        monHoc5.setDsMonHocTienQuyet(new ArrayList<MonHoc>(Arrays.asList(monHoc1)));

        GiangVien giangVien1 = new GiangVien("Nguyen Van A");
        GiangVien giangVien2 = new GiangVien("Tran Thi B");

        HinhThucDanhGia hinhThuc1 = new HinhThucDanhGia("Kiem tra giua ky", "Kiem tra sau mot phan cua khoa hoc");
        HinhThucDanhGia hinhThuc2 = new HinhThucDanhGia("Bai kiem tra cuoi ky", "Kiem tra toan bo noi dung cua khoa hoc");
        HinhThucDanhGia hinhThuc3 = new HinhThucDanhGia("Bai tap lon", "Thuc hanh va nop bai tap lon");

        return new HeThongQuanLy(
                new ArrayList<MonHoc>(Arrays.asList(monHoc1, monHoc2, monHoc3, monHoc4, monHoc5)),
                new ArrayList<GiangVien>(Arrays.asList(giangVien1, giangVien2)),
                new ArrayList<HinhThucDanhGia>(Arrays.asList(hinhThuc1, hinhThuc2, hinhThuc3))
        );
    }
}
