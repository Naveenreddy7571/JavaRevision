/* 
 * Java casting
 * Type casting is when you assign a value of one primitive data type to another type.
 * 
 * two types 
 * 1.impicit casting(smaller datatypes converting to larger datatypes like int->double,float->double)
 * 2.explict casting(larger datatypes to smaller ones like double to int , byte to int)
 * 
*/

// maximum size of byte is 127

public class Casting
{
    public static void main(String[] args) {
        byte b = 127;
        int a = b; //implicit casting
        a=200;
        b=(byte)a; //explict casting internally large value is converted to small value by "%" operator 200%127 = 56
        
        System.out.println(b);
    }
}