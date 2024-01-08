/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qldc;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class MonHoc {
    private String id;
    private String ten;
    private String moTa;
    private float soTC;
    
    public MonHoc(){}
    
    public boolean searchById(String id, ArrayList<MonHoc> mh){
        for(MonHoc m : mh){
            if(m.getId().equals(id)){
                return true;
            }
        }
        return false;
    }
    
    public boolean searchByTen(String ten, ArrayList<MonHoc> mh){
        for(MonHoc m : mh){
            if(m.getTen().equals(id)){
                return true;
            }
        }
        return false;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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

    /**
     * @return the moTa
     */
    public String getMoTa() {
        return moTa;
    }

    /**
     * @param moTa the moTa to set
     */
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    /**
     * @return the soTC
     */
    public float getSoTC() {
        return soTC;
    }

    /**
     * @param soTC the soTC to set
     */
    public void setSoTC(float soTC) {
        this.soTC = soTC;
    }
}
