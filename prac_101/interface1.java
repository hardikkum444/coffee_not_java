// practicing the usage of interfaces
// basic usage of interface
import java.util.*;

interface Shape{
    
    public double calculateArea();
    public void display();
}

class Circle implements Shape {
    
    private double radius;
    private double area;
    
    public Circle(double r){
        this.radius = r;
    }
    
    @Override
    public double calculateArea(){
        this.area = Math.PI*this.radius*this.radius;
        return this.area;
    }
    
    @Override
    public void display(){
        System.out.printf("The area of this circle is --> %.2f\n",this.area);
    }
}

class Rectangle implements Shape {
    
    private double length;
    private double width;
    private double area;
    
    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }
    
    @Override
    public double calculateArea(){
        this.area = this.length*this.width;
        return this.area;
    }
    
    @Override
    public void display(){
        System.out.printf("The area of this circle is --> %.2f\n",this.area);
    }
}

public class main{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius --> ");
        double rad = scan.nextDouble();
        
        Circle mycy = new Circle(rad);
        mycy.calculateArea();
        mycy.display();
        
        System.out.print("Enter Length --> ");
        double l = scan.nextDouble();
        System.out.print("Enter Width --> ");
        double w = scan.nextDouble();
        Rectangle myre = new Rectangle(l,w);
        myre.calculateArea();
        myre.display();
    }
}
