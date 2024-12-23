package Inheritance;


/*
 * 
 * INheritancce
 * 
 * inheritance basically means inheriting the properties from the base class 
 * 
 * Mainly used to extend the next version of the base feature
 * 
 * then why inheritance we can simply write code in the base file only then why to create a child class and extends 
 * 
 * becuase
 * 1.once written should not change
 * 2.i need to use both versio 0 code and version 1 code so i will extend from the base class
 * 
 * two type of inhertiance 
 * 1.is
 * 2.has
 * 
 * if computer is a parent class then mobile extends computer then this relation can give as mobile IS-A a computer;
 * 
 * if one class has object of another class then that relation ship is called as HAS-A relation ship
 */

import Interfaces.Computer;

class Ram{
    int ram = 4;
}
class Computer{

    Ram ram; //computer has a object of another class Ram so HAS-A 

}

class Mobile extends Computer{
    //IS-A relationship
}

public class Inheritence {
    public static void main(String[] args) {
        
    }
}
