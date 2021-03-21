/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project113;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author raneemalrashoud
 */ import java.io.*;
public class Testing {
   



    public static void main(String[] args) throws Exception {

        CarRental test = new CarRental(100);

        test.addCar(new Economy("MMM-1234", 150, "Mazda", "Black"));
        test.addCar(new Economy("XYZ-5678", 90, "Jeep", "Red"));
        test.addCar(new VIP("PPP-5544", 320, "BMW", "Black", new Driver(1, "Ahmad")));
        test.addCar(new VIP("EEAA9966", 370, "Mercedes benz", "Black", new Driver(2, "Reem")));

        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cars.dat"));

        oos.writeInt(test.getNumOfCars());
        oos.writeObject(test.getCarlist());

        oos.close();

       
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cars.dat"));

        int numOfCars = ois.readInt();
        System.out.println("Total Cars: " + numOfCars);
        Car[] cars = (Car[]) ois.readObject();

        for (int i = 0; i < numOfCars; i++) {
            Car car = cars[i];
            System.out.println(car);

        }ois.close();
    }

}
    

