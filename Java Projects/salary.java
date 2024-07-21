


import java.util.*;

interface a{
    void calculate(int age,String sex,int days);
}
class Demo {
    public void calculate(int age, String sex, int days) {
        if (age >= 18 && age < 30) {
            if (sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("MALE")) {
                int salary = days * 750;
                System.out.println("Sex: male, so wages (750/day) is: " + salary);
            } else if (sex.equalsIgnoreCase("F") || sex.equalsIgnoreCase("FEMALE")) {
                int salary = days * 700;
                System.out.println("Sex: female, so wages (700/day) is: " + salary);
            }
        }
        if (age >= 30 && age < 50) {
            if (sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("MALE")) {
                int salary = days * 850;
                System.out.println("Sex: male, so wages (850/day) is: " + salary);
            } else if (sex.equalsIgnoreCase("F") || sex.equalsIgnoreCase("FEMALE")) {
                int salary = days * 800;
                System.out.println("Sex: female, so wages (800/day) is: " + salary);
            }
        }
    }
}

public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        System.out.print("Enter the gender: ");
        String sex = sc.next();
        System.out.print("Enter the working days: ");
        int days = sc.nextInt();

        // object creation
        Demo obj = new Demo();
        obj.calculate(age, sex, days);
    }
}
