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
public class UserCustomer extends User{
    private String fName;
    private String lName;
    private String phone;

    public UserCustomer(String fName, String lName, String phone, String email, String pw) {
        super(email, pw);
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
    }

    @Override
    public void setID(double ID) {
        super.setID(ID); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
