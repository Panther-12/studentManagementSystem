/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class LoginSession {
    public boolean login = false;
    public String email;
    public String userID;
    
    public void setLoginCredentials(boolean state, String email){
        this.login = state;
        this.email = email;
        this.userID = generateUserID();
    }
    public String generateUserID(){
        Random random = new Random();
        return "'"+random.nextInt()+"'";
    }
    public String getLoginUserID(){
        return this.userID;
    }
    public boolean getLoginState(){
        return this.login;
    }
    public String getLoginEmail(){
        return this.email;
    }
    
}
