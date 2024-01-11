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
            System.out.println("9. Thong ke so luong de cuong theo tin chi");
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

                        if (giangVien.getDsDeCuong().size() >= 5) {
                            System.out.println("Giao vien " + giangVien.getTenGv() + " da duoc phan cong toi da so luong de cuong cho phep.");
                            giangVien = null;
                        }

                        if (giangVien == null) {
                            System.out.println("Khong tim thay Giang vien co ma " + maGiangVien + ". Vui long nhap lai.");
                        }
                    } while (giangVien == null);

                    List<LoaiDiem> dsDiem = new ArrayList<>();
                    boolean themLoaiDiem = true;

                    do {
                        System.out.println("Chon loai diem:");
                        System.out.println("1. Qua Trinh");
                        System.out.println("2. Diem Thi");
                        System.out.println("3. Bai Tap");
                        System.out.println("4. Hoan thanh");

                        int loaiDiemChoice;
                        System.out.print("Chon: ");
                        loaiDiemChoice = scanner.nextInt();
                        scanner.nextLine();

                        LoaiDiem loaiDiem = null;
                        switch (loaiDiemChoice) {
                            case 1:
                                loaiDiem = LoaiDiem.QUA_TRINH;
                                break;
                            case 2:
                                loaiDiem = LoaiDiem.DIEM_THI;
                                break;
                            case 3:
                                loaiDiem = LoaiDiem.BAI_TAP;
                                break;
                            case 4:
                                if (dsDiem.size() < 2) {
                                    System.out.println("Phai chon it nhat 2 loai diem. Vui long chon them.");
                                    continue;
                                }
                                themLoaiDiem = false;
                                break;
                            default:
                                System.out.println("Lua chon khong hop le. Vui long nhap lai");
                        }

                        if (themLoaiDiem && loaiDiem != null) {
                            if (!dsDiem.contains(loaiDiem)) {
                                dsDiem.add(loaiDiem);
                                System.out.println("Da them loai diem " + loaiDiem.toString() + " thanh cong!");
                            } else {
                                System.out.println("Da ton tai loai diem " + loaiDiem.toString() + " trong de cuong. Vui long chon loai diem khac.");
                            }
                        }
                    } while (themLoaiDiem);

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

                    var deCuong = heThongQuanLy.taoDeCuong(monHoc, heDaoTao, dsMucTieu, dsChuanDauRa, dsNoiDung, giangVien, dsHinhThucDanhGia, dsDiem);
                    if (deCuong != null) {
                        System.out.println("Da tao De cuong thanh cong!");
                        heThongQuanLy.xuatDeCuongHoanChinh(deCuong.getMaDeCuong());
                    } else {
                        System.out.println("Tao De cuong that bai!");
                    }
                    break;
                }

                case 2: {
                    int luaChonPhu;

                    do {
                        System.out.println("===== Cap nhat thong tin de cuong =====");
                        System.out.println("1. Sua noi dung");
                        System.out.println("2. Them mon hoc truoc");
                        System.out.println("3. Them mon hoc tien quyet");
                        System.out.println("4. Xoa mon hoc truoc");
                        System.out.println("5. Xoa mon tien quyet");
                        System.out.println("6. Them hinh thuc danh gia");
                        System.out.println("7. Xoa hinh thuc danh gia");
                        System.out.println("8. Quay lai");

                        System.out.print("Chon: ");
                        luaChonPhu = scanner.nextInt();
                        scanner.nextLine();

                        switch (luaChonPhu) {
                            case 2: {
                                System.out.println("===== Them mon hoc truoc =====");

                                System.out.println("Danh sach mon hoc trong he thong:");
                                for (MonHoc monHoc : heThongQuanLy.getDsMonHoc()) {
                                    System.out.println(monHoc.getMaMon() + ". " + monHoc.getTenMon());
                                }

                                System.out.print("Nhap ma de cuong: ");
                                int maDeCuong = scanner.nextInt();
                                scanner.nextLine();

                                DeCuong deCuong = heThongQuanLy.timKiemDeCuongBangMa(maDeCuong);
                                if (deCuong == null) {
                                    System.out.println("Khong tim thay de cuong co ma " + maDeCuong);
                                    break;
                                }

                                System.out.print("Nhap ma mon hoc truoc: ");
                                int maMonHocTruoc = scanner.nextInt();
                                scanner.nextLine();

                                MonHoc monHocTruoc = heThongQuanLy.timKiemMonHocBangMaMonHoc(maMonHocTruoc);
                                if (monHocTruoc == null) {
                                    System.out.println("Khong tim thay mon hoc co ma" + maMonHocTruoc);
                                    break;
                                }

                                boolean ketQua = heThongQuanLy.themMonHocTruoc(maDeCuong, monHocTruoc);

                                if (ketQua) {
                                    System.out.println("Them mon hoc truoc thanh cong.");
                                } else {
                                    System.out.println("Khong the them mon hoc truoc. Da dat den gioi han hoac mon hoc truoc da ton tai.");
                                }

                                break;
                            }
                            case 3: {
                                System.out.println("===== Them mon hoc tien quyet =====");

                                System.out.println("Danh sach mon hoc trong he thong:");
                                for (MonHoc monHoc : heThongQuanLy.getDsMonHoc()) {
                                    System.out.println(monHoc.getMaMon() + ". " + monHoc.getTenMon());
                                }

                                System.out.print("Nhap ma de cuong: ");
                                int maDeCuong = scanner.nextInt();
                                scanner.nextLine();

                                DeCuong deCuong = heThongQuanLy.timKiemDeCuongBangMa(maDeCuong);
                                if (deCuong == null) {
                                    System.out.println("Khong tim thay de cuong co ma " + maDeCuong);
                                    break;
                                }

                                System.out.print("Nhap ma mon hoc tien quyet: ");
                                int maMonHocTienQuyet = scanner.nextInt();
                                scanner.nextLine();

                                MonHoc monHocTienQuyet = heThongQuanLy.timKiemMonHocBangMaMonHoc(maMonHocTienQuyet);
                                if (monHocTienQuyet == null) {
                                    System.out.println("Khong tim thay mon hoc co ma " + maMonHocTienQuyet);
                                    break;
                                }

                                boolean ketQua = heThongQuanLy.themMonHocTienQuyet(maDeCuong, monHocTienQuyet);

                                if (ketQua) {
                                    System.out.println("Them mon hoc tien quyet thanh cong.");
                                } else {
                                    System.out.println("Khong the them mon hoc tien quyet. Da dat den gioi han hoac mon hoc tien quyet da ton tai.");
                                }

                                break;
                            }
                            case 4: {
                                System.out.println("===== Xoa mon hoc truoc =====");

                                System.out.print("Nhap ma de cuong: ");
                                int maDeCuong = scanner.nextInt();
                                scanner.nextLine();

                                DeCuong deCuong = heThongQuanLy.timKiemDeCuongBangMa(maDeCuong);
                                if (deCuong == null) {
                                    System.out.println("Khong tim thay de cuong co ma " + maDeCuong);
                                    break;
                                }

                                System.out.print("Nhap ma mon hoc truoc can xoa: ");
                                int maMonHocTruoc = scanner.nextInt();
                                scanner.nextLine();

                                boolean ketQua = heThongQuanLy.xoaMonHocTruoc(maDeCuong, maMonHocTruoc);

                                if (ketQua) {
                                    System.out.println("Xoa mon hoc truoc thanh cong.");
                                } else {
                                    System.out.println("Khong the tim thay mon hoc truoc. Mon hoc truoc khong ton tai.");
                                }

                                break;
                            }
                            case 5: {
                                System.out.println("===== Xoa mon hoc tien quyet =====");

                                System.out.print("Nhap ma de cuong: ");
                                int maDeCuong = scanner.nextInt();
                                scanner.nextLine();

                                DeCuong deCuong = heThongQuanLy.timKiemDeCuongBangMa(maDeCuong);
                                if (deCuong == null) {
                                    System.out.println("Khong tim thay de cuon co ma " + maDeCuong);
                                    break;
                                }

                                System.out.print("Nhap ma mon hoc tien quyet can xoa: ");
                                int maMonHocTienQuyet = scanner.nextInt();
                                scanner.nextLine();

                                boolean ketQua = heThongQuanLy.xoaMonHocTienQuyet(maDeCuong, maMonHocTienQuyet);

                                if (ketQua) {
                                    System.out.println("Xoa mon hoc tien quyet thanh cong.");
                                } else {
                                    System.out.println("Khong the xoa mon hoc tien quyet. Mon hoc tien quyet khong ton tai.");
                                }

                                break;
                            }

                            case 8:
                                System.out.println("Quay lai man hinh chinh.");
                                break;
                            default:
                                System.out.println("Lua chon khong hop le. Vui long nhap lai.");
                        }
                    } while (luaChonPhu != 8);

                    break;
                }
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
                case 9: {
                    heThongQuanLy.thongKeSoLuongDeCuongTheoSoTinChi();
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
