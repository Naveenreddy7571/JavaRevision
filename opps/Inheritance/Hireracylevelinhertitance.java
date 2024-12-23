package Inheritance;

class A{
    void show()
    {
        System.out.println("In class A");
    }
}

class B extends A{

}


class C extends A{

}
public class Hireracylevelinhertitance {
    public static void main(String[] args) {
        B c = new B();

        c.show();
    }
}
