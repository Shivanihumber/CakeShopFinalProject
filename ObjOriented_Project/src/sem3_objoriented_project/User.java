/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem3_objoriented_project;

/**
 *
 * @author Ferda
 */
public class User {
    private double ID;
    private String email;
    private String pw;
    
    public User(String email, String pw) {
        this.ID = 0;
        this.email = email;
        this.pw = pw;
    }
    
    public void ForgotPassword(){
        // create a new password and email to user 
    }
    
    public void Login(){
        
    }

    public void setID(double ID) {
        this.ID = ID;
    }
    
    public double getID() {
        return ID;
    }
    
    public void RegisterAccount(){
        setID(Math.random());
        //create new account on database
    }
    
}
