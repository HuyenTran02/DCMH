/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qldc;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QLDCM {

    private List<DeCuong> dc = new ArrayList<>();

    public void themDC(DeCuong... d) {
        this.dc.addAll(Arrays.asList(d));
    }

    public void themDC(DeCuong d) throws ParseException {
        this.dc.add(d);
    }

    public boolean xoaDC(DeCuong d) {
        if (dc.remove(d) == true) {
            return true;
        }
        return false;
    }

    public void suaDC(MonHoc m) {

    }

    public DeCuong timDCTheoMa(String tuKhoa) {
        for (DeCuong d : dc) {
            if (d.getId().equals(tuKhoa) == true) {
                return d;
            }
        }
        return null;
    }

    public DeCuong timDCTheoMaMH(String tuKhoa) {
        for (DeCuong d : dc) {
            if (d.getMh().getId().equals(tuKhoa) == true) {
                return d;
            }
        }
        return null;
    }

    public DeCuong timDCTheoTenMH(String tuKhoa) {
        for (DeCuong d : dc) {
            if (d.getMh().getTen().equals(tuKhoa) == true) {
                return d;
            }
        }
        return null;
    }

    public DeCuong timDCTheoTenGV(String tuKhoa) {
        for (DeCuong d : dc) {
            if (d.getgV().getTen().equals(tuKhoa) == true) {
                return d;
            }
        }
        return null;
    }
    
    public DeCuong timDCTheoMaGV(String tuKhoa) {
        for (DeCuong d : dc) {
            if (d.getgV().getMaGV().equals(tuKhoa) == true) {
                return d;
            }
        }
        return null;
    }

    public int checkGv(GiangVien gv){
        int i = 0;
        for (DeCuong d : dc) {
            if (d.getgV().equals(gv) == true) {
                i++;
            }
        }
        return i;
    }
    
    public boolean checkMH(MonHoc m, HeDaoTao he){
        for (DeCuong d : dc) {
            if (d.getMh().equals(m) == true && d.getHe().equals(he)) {
               return false;
            }
        }
        return true;
    }
    
    /**
     * @return the dc
     */
    public List<DeCuong> getDc() {
        return dc;
    }

    /**
     * @param dc the dc to set
     */
    public void setDc(List<DeCuong> dc) {
        this.dc = dc;
    }
}
