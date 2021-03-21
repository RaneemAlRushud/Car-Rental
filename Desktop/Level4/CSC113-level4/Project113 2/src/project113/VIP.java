/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project113;

/**
 *
 * @author raneemalrashoud
 */
public class VIP extends Car{

/* Attributes */
private Driver d; 


                    /*Constructor */
public VIP(String plate, double price, String model, String color, Driver d){
      super(plate, price, model, color); 
      this.d=d; }
      
                  
                  /*print Bill Method*/
                  
       public String printBill(int days){ 
      double totalPrice;
       totalPrice= (pricePerDay*days)+ (100*days); /*for the driver*/
     return (toString()+"\t"+"Days: "+days+"/nTotal Price: /n"+totalPrice);    }
       
       
       
       
       
         public String toString() {

        return (super.toString()+"\t"+d);
    }
       
       }/* End of class VIP */
       
