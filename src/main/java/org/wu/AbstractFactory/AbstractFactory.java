package org.wu.AbstractFactory;

import org.wu.FactoryPattern.Shape;

public abstract class AbstractFactory {
   public abstract Color getColor(String color);
   public abstract Shape getShape(String shape);
}