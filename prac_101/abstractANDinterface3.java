// simple abstract question which came in the question paper

import java.util.*;

abstract class Area{
    
    public abstract double findArea(double side1, double side2);
}

class Ellipse extends Area{
    
    @Override
    public double findArea(double side1,double side2){
        return Math.PI*side1*side2;
    }
    
}

class Triangle extends Area{
    
    @Override
    public double findArea(double side1,double side2){
        return (0.5)*side1*side2;
    }
    
}

public class main{
    
    public static void main(String[] args){
        
        Ellipse el = new Ellipse();
        System.out.printf("%.3f\n",el.findArea(3.2,2.2));
        
        Triangle tri = new Triangle();
        System.out.printf("%.3f\n",tri.findArea(3.2,2.2));
    }
}

