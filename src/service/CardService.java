/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.CardDao;
import java.sql.SQLException;


/**
 *
 * @author Toàn
 */
public class CardService {
    private CardDao cardDao;
    
    public CardService() {
        cardDao= new CardDao();
    }
    public int loGinCard(String userName,String pass) throws SQLException{
      
      return cardDao.loginCard(userName,pass);
   } 
}
