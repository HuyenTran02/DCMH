package com.mycompany.qldc;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class HeDaoTao {
    private int id;
    private String ten;

    public HeDaoTao(){}
    
    public HeDaoTao(int id, String ten){
        this.id = id;
        this.ten = ten;
    }
    
//    public HeDaoTao searchById(int id, ArrayList<HeDaoTao> he){
//        HeDaoTao h = new HeDaoTao();
//        for(HeDaoTao d:he){
//            if(d.getId() == id){
//                h = d;
//            }
//        }
//        return h;
//    }
    
//    public HeDaoTao(String ten){
//        this.id = 
//    }
//    
//    public int dem()
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
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
    
    
}
