package org.wu.AbstractFactory;

import org.wu.FactoryPattern.Shape;

public class Circle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}