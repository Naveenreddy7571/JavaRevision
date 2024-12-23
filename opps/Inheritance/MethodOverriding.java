package Inheritance;

/*
 * 
 * It is way to override the parent class method in child class .
 *  -- method overriding is run time polymorphism
 -- it is use to increase the reusability of code



 *********************IMPORTANT************************

 for a method to be overridden, the following conditions must be met:

 -- The method in the subclass must have the same signature (name, number and type of parameters) as the method in the superclass.
 
 -- The method in the subclass must have the same return type (or a subtype) as the method in the superclass.

 -- The method in the subclass must have the same access level (public, protected, or private) as the method in the superclass.

 -- The method in the subclass must not be static, while the method in the superclass must be marked as non-final.

 -- The overridden method must be visible from the subclass it means you can change access modifiers but there is condition for 
-- you need to increase visibility but you cannot reduced it , you can do it using access modifiers.
    -- you can change access modifiers in this manner 
       private -default -protected -public (in upcoming lecture access modifiers has been discussed)


--How do you stop inheritance   by suing the final keyword for class
 */


class Humans{
    private void speak()
    {
        System.out.println("speaking in english");
    }
}

final class Telugu extends Humans{

    public void speak() // should have same signature and same return type same acees modifier but can increase the visibilty
    {
        System.out.println("speaking in telugu");
    }
}

//The type sanskrit cannot subclass the final class Telugu

//Inhertitance stooped

// class sanskrit extends Telugu{

// }


public class MethodOverriding {
    public static void main(String[] args) {
        Telugu telugu = new Telugu();
        telugu.speak();
    }
}
