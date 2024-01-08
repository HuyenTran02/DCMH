/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qldc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {

    MonHoc monhoc;
    ArrayList<MonHoc> mh = new ArrayList<MonHoc>();
    ArrayList<DeCuong> dc = new ArrayList<DeCuong>();

    private Scanner sc = new Scanner(System.in);
    private int n = 0;

    private void menuLuuMH() {
        MonHoc m = new MonHoc();
        System.out.println("com.mycompany.qldc.Menu.menuLuuMH()");
    }

    private void menuLuuDCCSCQ() {
        DeCuong c = new DeCuong();
        String s;
        System.out.println("Nhap ten hoac ma mon hoc muon tao de cuong: ");
        s = sc.nextLine();
        if(monhoc.searchById(s, mh) == true || monhoc.searchByTen(s, mh) == true){
            int h = 0;System.out.println("-----------------------menu------------------------");
            System.out.println("1. He chinh quy");
            System.out.println("2. He tu xa");
            System.out.println("3. Quay lai");
            System.out.println("4. Thoat");
            System.out.println("-----------------------end------------------------");
            System.out.println("chon he dao tao: ");
            switch (h) {
                case 1:
                    HeDaoTao he = new HeDaoTao();
                    c.setHe(he);
                    break;
                case 2:
                    menuKhoiKienThucTX();
                    break;
                case 3:
                    menuMain();
                    break;
                case 4:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
            
            System.out.println("Nhap muc tieu mon hoc: ");
            c.setMucTieu(sc.nextLine());
            System.out.println("Nhap chuan dau ra mon hoc: ");
            c.setChuanDauRa(sc.nextLine());
        }else{
        System.out.println("Mon hoc khong ton tai!!!");
        }
    }

    private void menuMonHoc() {
        do {
            System.out.println("--------------------------------------------------------");
            System.out.println("1. Them mon hoc");
            System.out.println("2. Sua mon hoc");
            System.out.println("3. Xoa mon hoc");
            System.out.println("4. Tim kiem mon hoc");
            System.out.println("5. Hien thi danh sach mon hoc");
            System.out.println("6. Quay lai nemu chinh");
            System.out.println("7. Thong ke");
            System.out.println("8. Thoát");
            System.out.println("-------------------------KET THUC-----------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 2:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 3:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 4:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 5:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 6:
                    menuMain();
                    break;
                case 7:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 7);
    }

    private void menuDeCuongCSCQ() {
        do {
            System.out.println("-----------------------menu outline------------------------");
            System.out.println("1. Them de cuong mon hoc");
            System.out.println("2. Sua de cuong mon hoc");
            System.out.println("3. Xoa de cuong mon hoc");
            System.out.println("4. Tim kiem de cuong mon hoc");
            System.out.println("5. Hien thi danh sach de cuong");
            System.out.println("6. Quay lai Khoi kien thuc");
            System.out.println("7. Quay lai he dao tao");
            System.out.println("8. Quay lai nemu chinh");
            System.out.println("9. Thoat");
            System.out.println("-------------------------end-----------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 2:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 3:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 4:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 5:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 6:
                    menuKhoiKienThucCQ();
                    break;
                case 7:
                    menuHeDaoTao();
                    break;
                case 8:
                    menuMain();
                    break;
                case 9:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 9);
    }

    private void menuDeCuongCSNCQ() {
        do {
            System.out.println("-----------------------menu outline------------------------");
            System.out.println("1. Them de cuong mon hoc");
            System.out.println("2. Sua de cuong mon hoc");
            System.out.println("3. Xoa de cuong mon hoc");
            System.out.println("4. Tim kiem de cuong mon hoc");
            System.out.println("5. Hien thi danh sach de cuong");
            System.out.println("6. Quay lai Khoi kien thuc");
            System.out.println("7. Quay lai he dao tao");
            System.out.println("8. Quay lai nemu chinh");
            System.out.println("9. Thoat");
            System.out.println("-------------------------end-----------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 2:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 3:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 4:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 5:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 6:
                    menuKhoiKienThucCQ();
                    break;
                case 7:
                    menuHeDaoTao();
                    break;
                case 8:
                    menuMain();
                    break;
                case 9:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 9);
    }

    private void menuDeCuongCNCQ() {
        do {
            System.out.println("-----------------------menu outline------------------------");
            System.out.println("1. Them de cuong mon hoc");
            System.out.println("2. Sua de cuong mon hoc");
            System.out.println("3. Xoa de cuong mon hoc");
            System.out.println("4. Tim kiem de cuong mon hoc");
            System.out.println("5. Hien thi danh sach de cuong");
            System.out.println("6. Quay lai Khoi kien thuc");
            System.out.println("7. Quay lai he dao tao");
            System.out.println("8. Quay lai nemu chinh");
            System.out.println("9. Thoat");
            System.out.println("-------------------------end-----------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 2:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 3:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 4:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 5:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 6:
                    menuKhoiKienThucCQ();
                    break;
                case 7:
                    menuHeDaoTao();
                    break;
                case 8:
                    menuMain();
                    break;
                case 9:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 9);
    }

    private void menuDeCuongCSTX() {
        do {
            System.out.println("-----------------------menu outline------------------------");
            System.out.println("1. Them de cuong mon hoc");
            System.out.println("2. Sua de cuong mon hoc");
            System.out.println("3. Xoa de cuong mon hoc");
            System.out.println("4. Tim kiem de cuong mon hoc");
            System.out.println("5. Hien thi danh sach de cuong");
            System.out.println("6. Quay lai Khoi kien thuc");
            System.out.println("7. Quay lai he dao tao");
            System.out.println("8. Quay lai nemu chinh");
            System.out.println("9. Thoat");
            System.out.println("-------------------------end-----------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 2:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 3:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 4:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 5:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 6:
                    menuKhoiKienThucTX();
                    break;
                case 7:
                    menuHeDaoTao();
                    break;
                case 8:
                    menuMain();
                    break;
                case 9:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 9);
    }

    private void menuDeCuongCSNTX() {
        do {
            System.out.println("-----------------------menu outline------------------------");
            System.out.println("1. Them de cuong mon hoc");
            System.out.println("2. Sua de cuong mon hoc");
            System.out.println("3. Xoa de cuong mon hoc");
            System.out.println("4. Tim kiem de cuong mon hoc");
            System.out.println("5. Hien thi danh sach de cuong");
            System.out.println("6. Quay lai Khoi kien thuc");
            System.out.println("7. Quay lai he");
            System.out.println("8. Quay lai nemu chinh");
            System.out.println("9. Thoat");
            System.out.println("-------------------------end-----------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 2:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 3:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 4:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 5:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 6:
                    menuKhoiKienThucTX();
                    break;
                case 7:
                    menuHeDaoTao();
                    break;
                case 8:
                    menuMain();
                    break;
                case 9:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 9);
    }

    private void menuDeCuongCNTX() {
        do {
            System.out.println("-----------------------menu outline------------------------");
            System.out.println("1. Them de cuong mon hoc");
            System.out.println("2. Sua de cuong mon hoc");
            System.out.println("3. Xoa de cuong mon hoc");
            System.out.println("4. Tim kiem de cuong mon hoc");
            System.out.println("5. Hien thi danh sach de cuong");
            System.out.println("6. Quay lai Khoi kien thuc");
            System.out.println("7. Quay lai he");
            System.out.println("8. Quay lai nemu chinh");
            System.out.println("9. Thoat");
            System.out.println("-------------------------end-----------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 2:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 3:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 4:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 5:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 6:
                    menuKhoiKienThucTX();
                    break;
                case 7:
                    menuHeDaoTao();
                    break;
                case 8:
                    menuMain();
                    break;
                case 9:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 9);
    }

    private void menuKhoiKienThucCQ() {
        do {
            System.out.println("-----------------------menu------------------------");
            System.out.println("1. Co so");
            System.out.println("2. Co so nganh");
            System.out.println("3. Chuyen nganh");
            System.out.println("4. Chon lai He");
            System.out.println("5. Quay lai menu chinh");
            System.out.println("6. Thoat");
            System.out.println("-----------------------end------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    menuDeCuongCSTX();
                    break;
                case 2:
                    menuDeCuongCSNTX();
                    break;
                case 3:
                    menuDeCuongCNTX();
                    break;
                case 4:
                    menuHeDaoTao();
                    break;
                case 5:
                    menuMain();
                    break;
                case 6:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 6);
    }

    private void menuKhoiKienThucTX() {
        do {
            System.out.println("-----------------------menu------------------------");
            System.out.println("1. Co so");
            System.out.println("2. Co so nganh");
            System.out.println("3. Chuyen nganh");
            System.out.println("4. Chon lai He");
            System.out.println("5. Quay lai menu chinh");
            System.out.println("6. Thoat");
            System.out.println("-----------------------end------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    menuDeCuongCSTX();
                    break;
                case 2:
                    menuDeCuongCSNTX();
                    break;
                case 3:
                    menuDeCuongCNTX();
                    break;
                case 4:
                    menuHeDaoTao();
                    break;
                case 5:
                    menuMain();
                    break;
                case 6:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 6);
    }

    private void menuHeDaoTao() {
        do {
            System.out.println("-----------------------menu------------------------");
            System.out.println("1. He chinh quy");
            System.out.println("2. He tu xa");
            System.out.println("3. Quay lai menu");
            System.out.println("4. Thoat");
            System.out.println("-----------------------end------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    menuKhoiKienThucCQ();
                    break;
                case 2:
                    menuKhoiKienThucTX();
                    break;
                case 3:
                    menuMain();
                    break;
                case 4:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 4);
    }

    public void menuMain() {
        do {
            System.out.println("-----------------------menu------------------------");
            System.out.println("1. Quan ly mon hoc");
            System.out.println("2. Quan ly de cuong mon hoc");
            System.out.println("4. Tim kiem mon hoc");
            System.out.println("5. Tim kiem de cuong mon hoc theo ma giang vien");
            System.out.println("6. Thoat");
            System.out.println("-----------------------end------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    menuMonHoc();
                    break;
                case 2:
                    menuHeDaoTao();
                    break;
                case 3:
                    System.out.println("Cam on da su dung");
                    break;
                case 4:
                    System.out.println("Cam on da su dung");
                    break;
                case 5:
                    System.out.println("Cam on da su dung");
                    break;
                case 6:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 6);
    }
}
