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
public class Economy extends Car{

                           /*Constructor*/
   public Economy(String plate, double price, String model, String color){
      super(plate, price, model, color);  }
                             /*          */


                                 /* print Bill method*/
                                 
   public String printBill(int days){ 
      double totalPrice;
      double discount = 20/100; /* there will be a discount 20% if the number of days more than 7D*/
   
      if (days > 7){
      
         totalPrice= (pricePerDay*days)-(pricePerDay*days*discount); 
      }
      
      else
         totalPrice= pricePerDay*days;
   
 return toString()+"\t"+("\nDays: "+days+"\nTotal Price is: "+totalPrice);  }

} /*End of class Economy*/