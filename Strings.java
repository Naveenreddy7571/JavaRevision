/*
 * 
 * Strings
 * 
 * all strings are stored in a special memory location called string bool means it contains all unique strings
 * 
 * Strings are immutable meaning once defined cannot change
 * 
 */


public class Strings {
    public static void main(String[] args) {
        String name="naveen";
        String middle="naveen";
        System.out.println(System.identityHashCode(middle)+" "+System.identityHashCode(name)); //1263793464 1263793464  same memory locatins means java spring pool to save space

        middle = middle+"kumar"; 
        System.out.println(middle);
        System.out.println(System.identityHashCode(middle)); //new memory 270397815
    }
    
}
