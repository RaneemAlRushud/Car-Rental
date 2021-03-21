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
public class Driver implements Serializable {

               /*Atributes */
   private int id;
   private String name;

           /*Methods */

   public Driver (int id , String name){
      this.id=id;
      this.name=name;}

   public String toString(){
      return "\nNmae of driver is: "+name+"\t"+"\nID is: "+id+"\n________________________";}

} /*End of class Dreiver*/