class A {
    int a = 10;

    public void show() {
        System.out.println("A showing");
    }

    class B {
        public void show() {
            System.out.println("B showing");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();  // Create an instance of outer class A
        A.B obj1 = obj.new B();  // Create an instance of the inner class B
        obj1.show();  // This will call show() of class B, and it will print "B showing"
    }
}
