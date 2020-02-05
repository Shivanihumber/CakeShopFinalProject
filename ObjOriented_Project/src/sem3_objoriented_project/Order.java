/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem3_objoriented_project;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ferda
 */
public class Order {
    private double order_ID;
    private UserCustomer customer;
    private Cake cake;
    private Delivery delivery;
    private OrderStatus status;
    private Date orderDateTime;
    private Date approvalDateTime;
    private Date cancelDateTime;
    private Date paymentDateTime;
    private Date readyDateTime;
    private Date deliveryDateTime;
    private String ownerMessage;
    private double cost;
            
    public static enum OrderStatus{CREATED,APPROVED,REJECTED,CANCELLED,PAID,READY,DELIVERED,OVERDUE};

    public Order(UserCustomer customer, Cake cake, Delivery delivery) {
        this.order_ID = Math.random();
        this.customer = customer;
        this.cake = cake;
        this.delivery = delivery;
        this.status = OrderStatus.CREATED;
        this.orderDateTime = now();
        this.approvalDateTime = null;
        this.cancelDateTime = null;
        this.paymentDateTime = null;
        this.readyDateTime = null;
        this.deliveryDateTime = null;
        this.ownerMessage = "";
        this.cost = 0;
    }

    public Delivery getDelivery() {
        return delivery;
    }
    
    private Date now(){
        Calendar now = Calendar.getInstance();
        return now.getTime();
    }
    
    public Order[] listOrder(){
        Order[] tmpList = null;
        //read all orders for this customer and return as list
        return tmpList;
    }
    
    public void Approve(){
        this.status = OrderStatus.APPROVED;
        this.approvalDateTime = now();
    }
   
    public void Reject(){
        this.status = OrderStatus.REJECTED;
        this.approvalDateTime = now();
    }
    
    public void Cancel(){
        this.status = OrderStatus.CANCELLED;
        this.cancelDateTime = now();
    }
    public void Pay(Payment payment){
        payment.ValidateCardDetails();
        payment.DoPayment(cost);
    }
    
    public void Ready(){
        this.status = OrderStatus.READY;
        this.readyDateTime = now();
    }
    
    public void Deliver(){
        this.status = OrderStatus.DELIVERED;
        this.deliveryDateTime = now();
    }
    
    public void CalculateCost(){
        if (this.cake.getSize() == Cake.CakeSize.SMALL)
            this.cost = PriceList.price_Small;
        else if(this.cake.getSize() == Cake.CakeSize.MEDIUM)
            this.cost = PriceList.price_Medium;
        else
            this.cost = PriceList.price_Large;
        
        if (this.cake.getImage() != null)
            this.cost += PriceList.price_Photo;
        
        this.cost += PriceList.price_PerTopping * this.cake.getToppings().length;

        if (this.delivery.getDeliveryType() == Delivery.DeliveryType.ADDRESS){
            this.cost += PriceList.price_DeliveryFix;
            this.cost += PriceList.price_DeliveryPerKM * this.delivery.getDistance();
        }
    }
    
    public boolean CheckTiming(){
        //if current time is out of working hours, return false
        return true; 
    }
}
