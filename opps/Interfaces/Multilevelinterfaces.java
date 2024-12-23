package Interfaces;

/*
 * 
 * class - class => extends
 * class - interface => implements
 * interface - interface => extends
 * 
 */
interface A {
    
    void eat();
}

interface c extends A{

}
interface B {
    void sleep();
}


class Naveen implements A,B{

    public void eat()
    {
        System.out.println("Naveen eating");
    }
    public void sleep()
    {
        System.out.println("Naveen sleeping");
    }
}

class Dummy implements c{

    @Override
    public void eat() {
        System.out.println("Eating");
    }
    
}


public class Multilevelinterfaces {
    public static void main(String[] args) {
        Naveen nav = new Naveen();
        nav.sleep();
    }
}
