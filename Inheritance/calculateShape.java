import java.util.*;

class shape{
    void area_circle(int l){
        double B = Math.PI*(l*l);
        System.out.printf("Area of a circle : %.2f\n",B);
    }
    void area_Rectangle(int w,int l){
        int A=(w*l);
        System.out.println("Area of rectangle is: "+A);
    }
    void Circle_perimeter(int l){
        double C =2*Math.PI*l;
        System.out.printf("Perimiter of the Circle : %.2f\n",C);
    }
    void Rectangle_perimeter(int w, int l){
        int P=2*(l+w);
        System.out.println("Perimiter of the Ractangle : "+P);
    }
}
class Rectangle extends shape{
    void diagonal(int w,int l){
        double d=((w*w)+(l*l));
        System.out.printf("Diagonal of the Ractangle : %.2f\n",Math.sqrt(d));
    }
}
class Circle extends shape{
    void circumference(int l){
        double C =2*Math.PI*l;
        System.out.printf("Circumference of the Circle : %.2f\n",C);
    }
}
/**
 * Shape
 */
public class calculateShape {

    public static void main(String[] args) {
        Circle obj1 = new Circle();
        Rectangle obj2 = new Rectangle();
        // for circle
        System.out.println("\n\nAll about Circle : ");
        obj1.area_circle(4);
        obj1.Circle_perimeter(8);
        obj1.circumference(5);
        
        // for rectangle
        System.out.println("\n\nAll about Rectangle : ");
        obj2.area_Rectangle(6, 5);
        obj2.Rectangle_perimeter(5, 6);
        obj2.diagonal(9, 7);
    }
}