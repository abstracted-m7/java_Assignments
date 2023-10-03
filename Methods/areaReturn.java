// package oopJava;

// public class areaReturn {

//     public static int area(int side) {
//         int result=side*side;
//         return result;
//     }
//     public static void main(String[] args) {
//         int side;
//         side = 5;

//         System.out.println(area(side));
//     }
// }

package oopJava;

import java.util.Scanner;

class calculate {
    public static void square(int side) {
        int result = side * side;
        System.out.println("area of a square : " + result);
    }

    public static void Ractangle(int side1, int side2) {
        int result = side1 * side2;
        System.out.println("Area of a ractangle : " + result);
    }

    public void circle(int side) {
        double result = Math.PI * side * side;
        System.out.println("Area of a circle : " + result);
    }

    public void Traiangle(int height, int base) {
        double result = (height * base)/ 2;
        System.out.println("Area of a triangle : " + result);
    }
}

public class areaReturn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculate obj = new calculate();
        System.out.print("Enter the value of side 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of side 2 : ");
        int b = sc.nextInt();
        obj.square(a);
        obj.Ractangle(a, b);
        obj.circle(a);
        obj.Traiangle(a, b);
    }
}