

/*
 * Method overloding in java 
 * 
 * method overloading is a type of polymorphism in java where we can acheive diffrent behaviour in diffrent situations  same like our behaviour depends on the situation
 * 
 * we can acheive method overloading by same method signature means
 * public void add(int a,int b) //public void add is method signature
 * 
 * by diffrent number of parameters like int a,int b,int c
 * else diffrent datatypes of parameters
 * 
 * 
 * we cannot acheive method overloading by changing the return type beacuse the return type is not known to the compiler and it is a part of method signature
 */


class Computer{
    int ram;
    String processor;

    public int add(int a,int b)
    {
        return a+b;
    }

    public int add(int a,int b,int c)
    {
        return a+b+c;
    }

    public double add(double a,double b)
    {
        return a+b;
    }

    // public void add(int a,int b)
    // {
    //     System.out.println(a+b);  //Duplicate method add(int, int) in type Computer 
    // }
}
public class Methods {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i=0;i<5;i++)
        {
            arr[i]=i+1;
        }

        for(int i:arr)
        {
            System.out.println(i);
        }

        String[] nums = {"Naveen","kaveen"};
        System.out.println(System.identityHashCode(arr[0]));
        System.out.println(System.identityHashCode(arr[1]));
        System.out.println(arr[2]); //equivalent to pointer arthemic

        for(String i:nums)
        {
            System.out.println(i);
        }

    }
}
