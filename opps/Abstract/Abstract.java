package Abstract;

/*
 * 
 * abstraction is a feature in oops where we can show the nesscary functionality and hide uncsessary implementions 
 * 
 * in java abstraction in not 100% abstract i can contain both concrete implemented and non-concrete unimplemented methods
 * 
 * Interface is 100% abstraction
 * 
 * we cannot create obj for abstraction
 * 
 * any class that is not 100% implemented we should not provide to the user so we should not allow onjects for abstract classes
 * 
 * 
 */


 abstract class A{
    public void show()
    {
        System.out.println("in class a");
    }

    public abstract void fuck();
 }

 class B extends A{

    public void show()
    {
        System.out.println("IN class B");
    }
    @Override
    public void fuck() {
        System.out.println("Fucking");
    }
    
 }
public class Abstract {
    public static void main(String[] args) {

        //A aa = new A(); //Cannot instantiate the type AJava(16777373)  Abstract.A
        A a = new B();
        a.fuck();
    }
}
