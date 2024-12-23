package Inheritance;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/*
 * 

        if parent class multiple attribute then complusory the child class should pass that attributes in the constructor the basic fundamental is before using the parent class the parent class must be instanciated 

    If you pass any parameter in a super method, then it will call the parameterised constructor of a superclass.
To call the parameterised constructor of a parent class, we need to explicitly call the super method.

*******IMPORTANT*******************
Similarities in between this() and super() method:-
We can use both this and super method anywhere except the static area.
Both this and super method can be used any number of times in a code.
But both can be used only one time inside a constructor.
Both are non-static keywords.

 */

import A;
import B;
import C;

class A {
    A()
    {
        //class a also contains super method but calls the Object class
        //if class A donot explicitly extends the object class but it will implicitly extends the Object class
        System.out.println("i am in class A");
    }
}

class B extends A
{
    String name;
    B(String name)
    {
        this.name = name;
        System.out.println("In class B");
        System.out.println(this.name);
    }
}


class C extends B{
    C(String name)
    {
        super(name);
        System.out.println("In class C");
    }

    C(String name,int age)
    {
        this(name); //by using this we can call our own class constructor
        //super(name); //throws a compile time error super call must be the first statement in a constructor
        System.out.println(name+age);
    }
}



public class Thisandsuper {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        C ccc = new C("naveen");
        
    }
}