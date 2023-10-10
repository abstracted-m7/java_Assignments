class Vehicle{
    void vehicle(){
        System.out.println("\n\nAll vehicle is here.\n\n");
    }
}
class Car extends Vehicle{
    void car(){
        System.out.println("Cars is a part of Vehical.");
        System.out.println("All Cars Extends from Vehicle class.\n\n");
    }
}
class Bike extends Vehicle{
    void bike(){
        System.out.println("Bikes is a part of Vehical.");
        System.out.println("All bikes Extends from Vehicle class.\n\n");
    }
}
class ElectricCar extends Car{
    void electricCar(){
        System.out.println("Electric Cars is a part of Car.");
        System.out.println("All Electric Cars Extends from Car.");
    }
}
/**
 * hierarchyInheritent
 */
public class hierarchyInheritent {

    public static void main(String[] args) {
        ElectricCar obj = new ElectricCar();
        Bike obj2 = new Bike();
        obj.vehicle();
        obj2.bike();
        obj.car();
        obj.electricCar();
        
    }
}