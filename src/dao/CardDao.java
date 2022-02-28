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

/**
 *
 * @author Toàn
 */
public class CardDao {
    public int loginCard(String userName,String pass) throws SQLException{
        Connection con = Connect.getJDBCConection();
        String sql = "SELECT * FROM card WHERE userName=?";
        PreparedStatement prepareStatement=con.prepareStatement(sql);
        prepareStatement.setString(1, userName);
        ResultSet rs = prepareStatement.executeQuery();     
     
        if(rs.next()){
            if(rs.getString("passWord").equals(pass)){
                if(rs.getInt("trangThai") == 1){
                    return 3;
                }else{
                    return 2;
                }
            } else {
                    return 1;
            }
        }else {
            return 0;
        }
    }
}
