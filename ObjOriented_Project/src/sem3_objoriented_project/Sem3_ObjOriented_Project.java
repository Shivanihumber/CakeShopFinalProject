/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem3_objoriented_project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ferda
 */
public class Sem3_ObjOriented_Project {

    public static void main(String[] args) throws Exception{
        //shop information
        CakeShop shop = new CakeShop("Special Cakes","437-123456","Downtown, Toronto, ON", "M9M 123",null);
        
        //Customer login
        UserCustomer user = new UserCustomer("Name","LastName","436-112233","user@gmail.com","pw123");
        //if a new user, register user
        user.RegisterAccount();
        //Log in
        user.Login();

        //Create order
        Cake.Topping[] selectedToppinngs = null;
        selectedToppinngs[0] = Cake.Topping.CHOCOLATECHIPS ;
        selectedToppinngs[1] = Cake.Topping.BANANA ;
        Order order = new Order(user,new Cake(Cake.CakeSize.MEDIUM,Cake.CakeCovering.MILKY,selectedToppinngs,"Happy Birthday"),new Delivery(Delivery.DeliveryType.SHOP,null,null,null,new SimpleDateFormat("dd/MM/yyyy").parse("29/11/2018")));
    
        order.getDelivery().calculateDistance(shop.getPostalCode()); //If too away, give error
        
        order.CalculateCost();
        
        //Pay order
        order.Pay(new Payment("Visa","CName CLastname","1234123412341234","1223","123"));
        
        //Deliver
        order.Deliver();
        
        
    }
    
}
