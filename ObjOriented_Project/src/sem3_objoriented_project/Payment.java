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
public class Payment {
    private String cardType;
    private String name;
    private String cardNo;
    private String expiryDate;
    private String CVV;

    public Payment(String cardType, String name, String cardNo, String expiryDate, String CVV) {
        this.cardType = cardType;
        this.name = name;
        this.cardNo = cardNo;
        this.expiryDate = expiryDate;
        this.CVV = CVV;
    }
    public void ValidateCardDetails(){
        //validate inputted values
    }
    public void DoPayment(double amount){
        Bank.MakePayment(this, amount);
    }
}
