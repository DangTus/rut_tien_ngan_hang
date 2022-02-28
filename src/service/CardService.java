/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.CardDao;
import java.sql.SQLException;
import model.Card;
import model.User;


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
    public Card getCardByUserName(String userName) throws SQLException{
        
        return cardDao.getCardByUserName(userName);
    }
    public User getUserByUserName(int idUser) throws SQLException{
        return cardDao.getUserByUserName(idUser);
    }
    public int checkPass(String userName,String pass){
 
        return cardDao.checkPass(userName,pass);
    }
     public int editPass(String userName,String pass){
         
        return cardDao.editPass(userName, pass);
    }
}
