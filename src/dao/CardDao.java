/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Card;
import model.User;

/**
 *
 * @author Toàn
 */
public class CardDao {

    public int loginCard(String userName, String pass) throws SQLException {
        Connection con = Connect.getJDBCConection();
        String sql = "SELECT * FROM card WHERE userName=?";
        PreparedStatement prepareStatement = con.prepareStatement(sql);
        prepareStatement.setString(1, userName);
        ResultSet rs = prepareStatement.executeQuery();

        if (rs.next()) {
            if (rs.getString("passWord").equals(pass)) {
                if (rs.getInt("trangThai") == 1) {
                    return 3;
                } else {
                    return 2;
                }
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public Card getCardByUserName(String userName) throws SQLException {
        Card card = new Card();
        Connection connect = Connect.getJDBCConection();
        String sql = "SELECT * FROM card WHERE userName=?";

        PreparedStatement preparedStatement = connect.prepareStatement(sql);
        preparedStatement.setString(1, userName);
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {

            card.setIdCard(rs.getInt("idCard"));
            card.setIdUser(rs.getInt("idUser"));
            card.setPass(rs.getString("passWord"));
            card.setUserName(rs.getString("userName"));
            card.setSoDu(rs.getInt("soDu"));
            card.setTrangThai(rs.getInt("trangThai"));

        }
        connect.close();
        return card;
    }

    public User getUserByUserName(int idUser) throws SQLException {
        User user = new User();
        Connection connect = Connect.getJDBCConection();

        String sql = " SELECT * FROM user WHERE idUser=?";

        PreparedStatement preparedStatement = connect.prepareStatement(sql);
        preparedStatement.setInt(1, idUser);
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {

            user.setIdUser(rs.getInt("idUser"));
            user.setCmnd(rs.getString("cmnd"));
            user.setTenUser(rs.getString("tenUser"));
            user.setDiaChi(rs.getString("diaChi"));
            user.setSdt(rs.getString("sdt"));

        }

        connect.close();
        return user;
    }

    public int checkPass(String userName, String pass) {
        Card card = new Card();
        Connection connect = Connect.getJDBCConection();
        String sql = "SELECT * FROM card WHERE userName=?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                if (rs.getString("passWord").equals(pass)) {
                    connect.close();
                    return 1;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CardDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }

    public int editPass(String userName, String pass) {
        Connection connect = Connect.getJDBCConection();
        String sql = "UPDATE card set passWord=? WHERE userName=?";
        PreparedStatement preparedStatement;

        try {
            preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setString(1, pass);
            preparedStatement.setString(2, userName);
            int rs =preparedStatement.executeUpdate();
            System.out.println(rs);
            connect.close();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(CardDao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return 0;
    }
}
