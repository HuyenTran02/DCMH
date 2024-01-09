/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.qldc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class QLDC {

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {
        QLGV qlgv = new QLGV();
        QLDCM qldc = new QLDCM();
        QLMH qlmh = new QLMH();
        Menu menu = new Menu();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            
            //Tao hệ đào tạo
            HeDaoTao hdt1 = new HeDaoTao(1, "Chinh quy");
            HeDaoTao hdt2 = new HeDaoTao(2, "Tu xa");

            //tạo khối kiến thức
            KhoiKienThuc kt1 = new KhoiKienThuc(1, "Co so");
            KhoiKienThuc kt2 = new KhoiKienThuc(1, "Nganh");
            KhoiKienThuc kt3 = new KhoiKienThuc(1, "Chuyen nganh");

            //Tạo môn học
            MonHoc mh1 = new MonHoc("CSLT", "Co so lap trinh",
                    "Nhung kien thuc co ban",
                    4, kt1);
            MonHoc mh2 = new MonHoc("KTLT", "Ky thuat lap trinh",
                    "Nhung kien thuc co ban",
                    4, kt1);
            MonHoc mh3 = new MonHoc("CTDLVGT", "Cau truc du lieu va giai thuat",
                    "Nhung kien thuc co ban",
                    4, kt2);
            MonHoc mh5 = new MonHoc("LTHDT", "Lap trinh huong doi tuong",
                    "Nhung kien thuc co ban",
                    4, kt2);
            MonHoc mh4 = new MonHoc("CNPM", "Cong nghe phan mem",
                    "Nhung kien thuc co ban",
                    4, kt3);
            qlmh.themMH(mh1, mh2, mh3, mh4, mh5);

            //Tao list GV
            Date ngay1 = dateFormat.parse("08/01/1990");
            GiangVien gv1 = new GiangVien("DHT", "Duong Huu Thanh",
                    ngay1, "Thac Si", "Giang Vien");
            Date ngay2 = dateFormat.parse("19/05/1990");
            GiangVien gv2 = new GiangVien("PCC", "Pham Chi Cong",
                    ngay2, "Thac Si", "Giang Vien");
            Date ngay3 = dateFormat.parse("30/10/1990");
            GiangVien gv3 = new GiangVien("NPT", "Nguyen Phuong Trang",
                    ngay3, "Nghien Cuu Sinh", "Giang Vien");
            qlgv.themGV(gv1, gv3, gv2);

            //Tạo đề cương
            DeCuong dc1 = new DeCuong("CSLTCQ",
                    "Biet cach xay dung thuat toan cho cac bai giai thong thuong",
                    "Van dung cac cau lenh dieu khien thich hop khi viet chuong trinh",
                    hdt1, gv1, mh1);
            DeCuong dc2 = new DeCuong("CSLTTX",
                    "Biet cach xay dung thuat toan cho cac bai giai thong thuong",
                    "Van dung cac cau lenh dieu khien thich hop khi viet chuong trinh",
                    hdt2, gv2, mh1);

            DeCuong dc3 = new DeCuong("CNPMCQ",
                    "Biet cach xay dung thuat toan cho cac bai giai",
                    "Van dung cac cau lenh dieu khien thich hop khi viet chuong trinh",
                    hdt1, gv1, mh4);
            DeCuong dc4 = new DeCuong("CNPMTX",
                    "Biet cach xay dung thuat toan cho cac bai giai",
                    "Van dung cac cau lenh dieu khien thich hop khi viet chuong trinh",
                    hdt2, gv1, mh4);

            DeCuong dc5 = new DeCuong("CTDLVGTCQ",
                    "Biet cach xay dung thuat toan cho cac bai giai thong thuong",
                    "Van dung cac cau lenh dieu khien thich hop khi viet chuong trinh",
                    hdt1, gv1, mh3);
            DeCuong dc6 = new DeCuong("CTDLVGTTX",
                    "Biet cach xay dung thuat toan cho cac bai giai thong thuong",
                    "Van dung cac cau lenh dieu khien thich hop khi viet chuong trinh",
                    hdt2, gv1, mh3);

            DeCuong dc7 = new DeCuong("LTHDTCQ",
                    "Biet cach xay dung thuat toan cho cac bai giai thong thuong",
                    "Van dung cac cau lenh dieu khien thich hop khi viet chuong trinh",
                    hdt1, gv1, mh5);
            DeCuong dc8 = new DeCuong("LTHDTTX",
                    "Biet cach xay dung thuat toan cho cac bai giai thong thuong",
                    "Van dung cac cau lenh dieu khien thich hop khi viet chuong trinh",
                    hdt2, gv3, mh5);
            qldc.themDC(dc8, dc7, dc6, dc5, dc4, dc3, dc2, dc1);

            menu.menuMain(qlmh, qldc, qlgv);
//            System.out.println(qlmh.timMHTheoTen("CSLT").getTen());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
