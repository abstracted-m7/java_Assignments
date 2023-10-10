import java.util.*;
class A{
    int n1;
    int n2;
    int sumResult;
    int subResult;
    void input(int num1,int num2){
        this.n1=num1;
        this.n2=num2;
    }
    void sum(){
        int sum=n1+n2;
        this.sumResult=sum;
    }
    void Substraction(){
        if (n1>n2) {
            int sub=n1-n2;
            this.subResult=sub;
        }
        else if(n2>n1){
            int sub2=n2-n1;
            this.subResult=sub2;
        }
    }
}
class B extends A{
    void display(){
        System.out.println("Sum of two number : "+sumResult);
    }
}

public class singlyInheritanceDSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int number1=sc.nextInt();
        System.out.print("Enter the second number : ");
        int number2=sc.nextInt();
        B obj=new B();
        obj.input(number1,number2);
        obj.display();
    }
}
