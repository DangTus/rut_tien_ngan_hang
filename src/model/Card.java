/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Toàn
 */
public class Card {
    private int idCard;
    private int idUser;
    private String userName;
    private String pass;
    private int soDu;
    private int trangThai;

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public int getIdCard() {
        return idCard;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getUserName() {
        return userName;
    }

    public String getPass() {
        return pass;
    }

    public int getSoDu() {
        return soDu;
    }

    public int getTrangThai() {
        return trangThai;
    }
   
}
