
package com.learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        
  
    ApplicationContext context=new ClassPathXmlApplicationContext("SpringXMLConfig.xml");
    
    Animal animal=(Animal)context.getBean("sound");
    
    animal.howISound();
   
      }
}
