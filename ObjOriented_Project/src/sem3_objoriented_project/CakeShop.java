/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem3_objoriented_project;

import java.awt.image.BufferedImage;

/**
 *
 * @author Ferda
 */
public class CakeShop {
    private String name;
    private String phoneNo;
    private String address;
    private String postalCode;
    private BufferedImage [] imageList;

    public CakeShop(String name, String phoneNo, String address, String postalCode, BufferedImage[] imageList) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
        this.postalCode = postalCode;
        this.imageList = imageList;
    }

    public String getName() {
        return name;
    }

    public String getPostalCode() {
        return postalCode;
    }
    
    public CakeShop displayInfo(){
        return this;
    }
}
