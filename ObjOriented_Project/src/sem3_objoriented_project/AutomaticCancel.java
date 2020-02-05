/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem3_objoriented_project;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Ferda
 */
public class AutomaticCancel  {
    
    public void autoCancel()throws Exception{
        while(true){
            TimeUnit.MINUTES.sleep(2);
             
            // if any order is not paid within some time after being approved, 
            // make its status OVERDUE
            
        }       
    }

}
