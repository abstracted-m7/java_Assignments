package oopJava;

import java.util.Scanner;

class word {
    String b;

    public void line(String a) {
        this.b = a;
        // System.out.println(b);
    }

    public void Delete(String a, String m) {
        String c = b.replace(a, m);
        System.out.println("\nThe final is : " + c);
    }
}

public class replaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        word obj = new word();
        System.out.println("Enter the whole line : ");
        obj.line(sc.nextLine());
        System.out.print("\nEnter the deleted word : ");
        String value = sc.next();
        System.out.print("\nEnter the replace value : ");
        String value2 = sc.next();
        obj.Delete(value, value2);

    }
}
