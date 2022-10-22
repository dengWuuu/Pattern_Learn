package org.wu.AbstractFactory;

import org.wu.FactoryPattern.Shape;

public class Square implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}