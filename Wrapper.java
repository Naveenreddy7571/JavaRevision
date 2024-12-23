/*
 * 
 * Why to convert from premetive to it's wrapper class we need to convert because Collections only works with objects so it needs to convert to wrapper class object class
 */

public class Wrapper
{
    public static void main(String[] args) {
        //Auto boxing and unboxing

        // Auto boxing means converting int to it's wrapper class
        //unboxing means converting wrapper class to it's premetive type

        Integer a = 5; //auto-boxing

        int b = a;  //auto-unboxing

        String s = "17"; //string -> integer
        int c = Integer.parseInt(s);
        System.out.println(c);

    }
}