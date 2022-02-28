/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Toàn
 */
public class User {
    private int idUser;
    private String tenUser;
    private String ngaySinh;
    private String cmnd;
    private String sdt;
    private String diaChi;

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setTenUser(String tenUser) {
        this.tenUser = tenUser;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getTenUser() {
        return tenUser;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }
}
