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
import java.io.Serializable;
public abstract class Car implements Payabel, Serializable {

                /*Attributes*/
   protected String plateNo;
   protected double pricePerDay;
   protected String model;
   protected String color;
   protected boolean available;
   protected Customer cr;

                        /*Methods */

   public Car(String plateNo, double pricePerDay, String model, String color){
      this.plateNo=plateNo;
      this.pricePerDay=pricePerDay;
      this.model=model;
      this.color=color;
      available=true;
      //since it's by default
      cr=null;
   
   
   }

  // public  void setCustomer(Customer c){}

   public  String toString(){ 
      return  (getClass().getSimpleName()+"\t"+"\nPlate No.: "+plateNo+"\t"+"\nPrice Per Day: "+pricePerDay+"\t"+"\nModel: "+model+"\t"+"\nColor: "+color+"\n________________________");}

/* setters and getters*/
public String getPlateNo(){ return plateNo;}

public boolean getAvailable(){ return available;}



  

    public void setAvailable(boolean availablity) {
        this.available = availablity;
    }

 public void setCustomer(Customer c) {
        cr = c;
    }


}

