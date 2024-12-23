import Inheritance.A;
import Inheritance.B;

class A{
    public void show(){
        System.out.println("in show A");
    }
    }
    class B extends A{
    public void show(){
        System.out.println("in show B");
    }
    }
    
    class C extends A{
    public void show(){
        System.out.println("in show C");
    }
    }
    
    public class Demo{
        public static void main(String []args){
            A obj =new A();  
            obj.show();  //Output: in show A
    
            obj =new B(); //reference is A (we can use reference of parents) and create object of B  and assign to parents reference variable.
            obj.show();  //Output: in show B
    
            obj =new B();  //reference is A (we can use reference of parents) and create object of C and assign to parents reference variable.
            obj.show();  //Output: in show C

            A objj = new B();
            objj.show();
    
     
        }
    }
    
    // Note: during compile time we donot which show() method is called from which class.
    //     -- we can know during run time which show method is called this is known as run time polymorphism.
    //     -- all this concept is class dynamic method dispatch