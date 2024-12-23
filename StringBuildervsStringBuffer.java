/*
 * 
 * String buffer and String builder
 * 
 * normally strings are array of characters right so we can make buffer of 16 and if we write append naveen to the string buffer then the capacity of the buffer is 6+16 = 22
 * 
 * string buffer always maintains a buffer space in the heap memory
 * 
 * 
 * main problem in string buffer and string builder is
 * 
 * String buffer is not thread safe multiple threads can acess same time
 * string builder is thread safe
 */


public class StringBuildervsStringBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer(); //default capacity is 16
        sb.append("naveen kumar "); //if size exceeds then it will increase the buffer
        String s = sb.toString();
        System.out.println(s);
        
    }
}
