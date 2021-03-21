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
public class Customer{
      /*Attributes*/
   private int id;
   private String name;
   private long phone;
 


                     /* Methods */

   public Customer (int id, String name , long phone ){
      this.id=id;
      this.name=name;
      this.phone=phone;}

   public String toString(){ 
      return "Name of customer: "+name+"\t"+"ID of customer: "+id+"\t"+"Phone number of customer: "+phone;}

/* setters and getters */

}/* end of class Customer*/
