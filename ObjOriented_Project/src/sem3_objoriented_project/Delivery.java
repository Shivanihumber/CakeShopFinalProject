package sem3_objoriented_project;


import java.text.DateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ferda
 */
public class Delivery {
    private DeliveryType deliveryType;
    private String address;
    private String postalCode;
    private String city;
    private Date requestedDateTime;
    private double distance;

    public static enum DeliveryType{SHOP,ADDRESS};
    
    public Delivery(DeliveryType deliveryType, String address, String postalCode, String city, Date requestedDateTime) {
        this.deliveryType = deliveryType;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.requestedDateTime = requestedDateTime;
        this.distance = 0;
        
    }

    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public Date getRequestedDateTime() {
        return requestedDateTime;
    }

    public double getDistance() {
        return distance;
    }
    
    public void calculateDistance(String pc){
        this.distance = GoogleMaps.CallAPI(this.postalCode, pc);
    }
    
}
