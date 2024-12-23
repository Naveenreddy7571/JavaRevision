package Interfaces;
interface Computer {
    void poweron();  // Interface method (abstract by default)
}

class Laptop implements Computer {
    public String name;

    @Override
    public void poweron() {
        System.out.println("Powering on the laptop.");
    }
}

class Desktop implements Computer{
    @Override
    public void poweron()
    {
        System.out.println("Desktop running");
    }
}
class Employee {
    // Laptop laptop; //tightly copuled to laptop
    Computer Machine; //losse copuling by using interface
    String name;

    public Employee(Computer Machine, String name) {
        this.Machine = Machine;
        this.name = name;
        this.Machine.poweron();
    }
}

public class Interfaces {
    public static void main(String[] args) {
        // Laptop laptop = new Laptop(); //now i dont have laptop i have only Desktop the i need to change the code of the entire Employee which means the Employee class is tightly copuled with laptop class which leads to tight compuling
        
        /*
        A good class should contain high cohirence and loose copuling
        to make code loose copuling we use Interfaces
        
        */
        
        Desktop desktop = new Desktop();
        Laptop laptop = new Laptop();
        Employee emp = new Employee(laptop, "Naveen");
        // laptop.poweron();  // Example usage of poweron method
    }
}
