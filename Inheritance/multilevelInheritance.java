
import java.util.*;
class manager{
    String dpt_name;
    void depertment(String name){
        this.dpt_name = name;
    }
    
}
class Employee extends manager{
    int sal;
    void salary(int a){
        this.sal = a;
    }
}
class Person extends Employee{
    String e_name;
    void Emp_name(String name){
        this.e_name =name;
    }
}
/**
 * multilevelInheritance
 */
public class multilevelInheritance {

    public static void main(String[] args) {
        Person obj = new Person();
        obj.salary(52008);
        obj.Emp_name("Manish");
        obj.depertment("BCA");
        System.out.println(obj.e_name+"'s Salary is : "+obj.sal+" And depertment is : "+obj.dpt_name);
    }
}