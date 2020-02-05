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
public class Cake {
    private CakeSize size;      
    private CakeCovering covering; 
    private BufferedImage image;
    private Topping[] toppings;
    private String text;

    public static enum CakeSize{SMALL,MEDIUM,LARGE};
    public static enum CakeCovering{WHITE,DARK,MILKY};
    public static enum Topping{STRAWBERRY,BANANA,ORANGE,KIWI,CHOCOLATECHIPS,PEANUT};
    
    public Cake(CakeSize size, CakeCovering covering, Topping[] toppings, String text) {
        this.size = size;
        this.covering = covering;
        this.image = null;
        this.toppings = toppings;
        this.text = text;
    }

    public CakeSize getSize() {
        return size;
    }

    public CakeCovering getCovering() {
        return covering;
    }

    public BufferedImage getImage() {
        return image;
    }

    public Topping[] getToppings() {
        return toppings;
    }

    public String getText() {
        return text;
    }
    
    
    public void UploadPhoto(){
        BufferedImage tmpImage = null;
        //upload tmpImage
        this.image = tmpImage;
    }
    public void ValidateSelections(){
        //any validation on selections
    }
}
