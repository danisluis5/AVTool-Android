/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author lanch
 */
public class Coc {
    private int id;
    private String tenCoc;
    private String loaiCoc;
    private String loaiTietDien;
    private double a1;
    private double doSauDauCoc;
    private double doSauMuiCoc;
    private String capBeTong;
    private String macThep;
    private double soThanhThep;
    private double duongKinhThep;

    public Coc() {
    }

    public Coc(int id, String tenCoc, String loaiCoc, String loaiTietDien, double a1, double doSauDauCoc, double doSauMuiCoc, String capBeTong, String macThep, double soThanhThep, double duongKinhThep) {
        this.id = id;
        this.tenCoc = tenCoc;
        this.loaiCoc = loaiCoc;
        this.loaiTietDien = loaiTietDien;
        this.a1 = a1;
        this.doSauDauCoc = doSauDauCoc;
        this.doSauMuiCoc = doSauMuiCoc;
        this.capBeTong = capBeTong;
        this.macThep = macThep;
        this.soThanhThep = soThanhThep;
        this.duongKinhThep = duongKinhThep;
    }

    public Coc(String tenCoc, String loaiCoc, String loaiTietDien, double a1, double doSauDauCoc, double doSauMuiCoc, String capBeTong, String macThep, double soThanhThep, double duongKinhThep) {
        this.tenCoc = tenCoc;
        this.loaiCoc = loaiCoc;
        this.loaiTietDien = loaiTietDien;
        this.a1 = a1;
        this.doSauDauCoc = doSauDauCoc;
        this.doSauMuiCoc = doSauMuiCoc;
        this.capBeTong = capBeTong;
        this.macThep = macThep;
        this.soThanhThep = soThanhThep;
        this.duongKinhThep = duongKinhThep;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenCoc() {
        return tenCoc;
    }

    public void setTenCoc(String tenCoc) {
        this.tenCoc = tenCoc;
    }

    public String getLoaiCoc() {
        return loaiCoc;
    }

    public void setLoaiCoc(String loaiCoc) {
        this.loaiCoc = loaiCoc;
    }

    public String getLoaiTietDien() {
        return loaiTietDien;
    }

    public void setLoaiTietDien(String loaiTietDien) {
        this.loaiTietDien = loaiTietDien;
    }

    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public double getDoSauDauCoc() {
        return doSauDauCoc;
    }

    public void setDoSauDauCoc(double doSauDauCoc) {
        this.doSauDauCoc = doSauDauCoc;
    }

    public double getDoSauMuiCoc() {
        return doSauMuiCoc;
    }

    public void setDoSauMuiCoc(double doSauMuiCoc) {
        this.doSauMuiCoc = doSauMuiCoc;
    }

    public String getCapBeTong() {
        return capBeTong;
    }

    public void setCapBeTong(String capBeTong) {
        this.capBeTong = capBeTong;
    }

    public String getMacThep() {
        return macThep;
    }

    public void setMacThep(String macThep) {
        this.macThep = macThep;
    }

    public double getSoThanhThep() {
        return soThanhThep;
    }

    public void setSoThanhThep(double soThanhThep) {
        this.soThanhThep = soThanhThep;
    }

    public double getDuongKinhThep() {
        return duongKinhThep;
    }

    public void setDuongKinhThep(double duongKinhThep) {
        this.duongKinhThep = duongKinhThep;
    }

    
    
}
