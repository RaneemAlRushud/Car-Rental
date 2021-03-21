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
import java.io.*;
public class CarRental{

       /*Attributes*/
   private Car carlist[];
   private int numOfCars;

                                  /*Methods*/

/*1.Constrcter*/
   public CarRental(int size){
      carlist=new Car[size];
      numOfCars=0; }

/*2. Add */
   public boolean addCar/*we changed the return type*/(Car c){
   
      //boolean notFound=true;
      if(numOfCars>=carlist.length)
          return false;
    
      if(numOfCars<carlist.length && numOfCars!=carlist.length){
         for(int i=0; i<numOfCars;i++){
            if((c.getPlateNo().toLowerCase()).equals(carlist[i].getPlateNo().toLowerCase())){
              return false;   
// System.out.println("Done!");
            } /*inner if*/
         /*loop*/
        }}/*outer if*/ 
       
        carlist[numOfCars++] = c;
        return true;
          
         //System.out.println("Sorry! we couldn't add");
   }

/*3.save file*/
 public void saveToFile() throws FileNotFoundException, IOException {
    FileOutputStream fos=new FileOutputStream(new File("cars.dat"));
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.write(numOfCars);
    oos.writeObject(carlist);
    oos.close();
}

/*4.Load File*/
public void loadFromFile()throws FileNotFoundException, IOException,ClassNotFoundException{
    FileInputStream fis=new FileInputStream(new File("cars.dat"));
    ObjectInputStream ois=new ObjectInputStream(fis);
    
numOfCars=ois.readInt();
carlist=(Car[])ois.readObject();
ois.close();



}

/*5.rent Car*/
 public String rentCar(String plateNo, Customer c , int numOfDay){
          for (int i = 0; i < numOfCars; i++) {

            if (carlist[i].getPlateNo().equalsIgnoreCase(plateNo)) {
                if (carlist[i].getAvailable()) {
                    carlist[i].setCustomer(c);
                    carlist[i].setAvailable(false);
                    return carlist[i].printBill(numOfDay);
                }
            }

        }
        return null; 
    }
     
     
     
/*6.return car */
 
 public boolean returnCar(String plateNo)/*we changed the return type*/{
    for (int i = 0; i < numOfCars; i++) {

            if (carlist[i].getPlateNo().equalsIgnoreCase(plateNo)) {
                if (!carlist[i].getAvailable()) {
                    carlist[i].setCustomer(null);
                    carlist[i].setAvailable(true); 
                
                return true;}}}
 
 
 

    
    
    return false;}

/*7.search VIP*/
   public VIP [] searchAvailableVIP(){
   
   /* To determine the size of VIP list */
      int size=0;
      int j=0;
      
      for(int i =0 ; i<numOfCars ; i++){
         if(carlist[i] instanceof VIP){
            if(carlist[i].getAvailable()){
               size++;
            }/* inner if*/
         }/*oter if*/
      }/* loop*/
      
       if (size == 0) 
            return null;
   
      VIP vipList [] = new VIP[size];
      for(int i =0 ; i<numOfCars ; i++){//need checking
         if(carlist[i] instanceof VIP){
            if(carlist[i].getAvailable()){
               vipList[j++]=(VIP)carlist[i];
            }/*inner if*/
         }/*outer if*/
      }/*loop*/
      return vipList;
   }

/*8.search Economy*/
   public Economy [] searchAvailableEconomy(){
   
   /* To determine the size of Economy list */
      int size=0;
      int j=0;
      for (int i =0 ; i<numOfCars ; i++){
         if(carlist[i] instanceof Economy){
            if(carlist[i].getAvailable()){
               size++;
            }/* inner if*/
         }/*oter if*/
      }/* loop*/
   
      Economy economyList [] = new Economy[size];
      for (int i =0 ; i<numOfCars ; i++){//need checking
         if(carlist[i] instanceof Economy){
            if(carlist[i].getAvailable()){
               economyList[j++]=(Economy)carlist[i];
            }/*inner if*/
         }/*outer if*/
      }/*loop*/
      return economyList;
   }
   
   
  /*9.get Car*/
 public Car getCar(String PN){
 
     for (int i = 0; i < numOfCars; i++) {

            if (carlist[i].getPlateNo().equalsIgnoreCase(PN)) {
                return carlist[i];
            }
        }
        return null;
 
 }
   public Car[] getCarlist() {
        return carlist;
    }

    public int getNumOfCars() {
        return numOfCars;
    }
  
}/*End of class */


