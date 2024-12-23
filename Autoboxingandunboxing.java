/*
 * Auto boxing unboxing
 * 
 * Auto boxing means directly converting the primetive values to it's correponding wrapper calss like int -> Integer,string->StringBuilder
 * 
 * 
 * UNboxing means converting the object type tp it's primitive type like  Integer->int
 * 
 * 
 * Primitive Type	Wrapper Class
            boolean	Boolean
            byte	Byte
            char	Character
            float 	Float
            int 	Integer
            long	Long
            short 	Short
            double	Double
 */


public class Autoboxingandunboxing {
    public static void main(String[] args) {
        int a=10;
        Integer b= a;
        System.out.println(b);

        a=b; //unboxing done automatically by using i.intValue() by compiler
        System.out.println(a);
    }
}
