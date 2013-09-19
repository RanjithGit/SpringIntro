
package com.learning.spring;

/**
 *
 * @author RANJITH
 */
public class Sound implements Animal{
   private Animal animal;
   Sound(Animal animal){
       this.animal=animal;
   }

  
    public String howISound() {
       animal.howISound();
       return "Yes I Sound like me";
    }
   
  
}
