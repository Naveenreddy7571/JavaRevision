/*
 * 
 * jagged array concept come in java 8 
-- Jagged array is a multidimensional array where member arrays are of different size. For example, we can 
create a 2D array where first array is of 3 elements, and is of 4 elements. Following is the example demonstrating
 the concept of jagged array.

 syntax to create --

 int nums[][]=new int[3][];
 nums[0] =new int[3];
 nums[1] =new int[5];
 nums[2] =new int[6];

initalize value in array using random()method present in Math class
  for(int i=0;i nums.length;i++){
            for(int j=0;j nums[i].length;j++){
                nums[i][j]=(int)(Math.random()*10);
            }
        }
#5
Traverse using for loop :
   for(int i=0;i nums.length;i++){
            for(int j=0;j nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
        }

Traverse using enhanced for loop:
  for(int x[]:nums){
            for(int y:x){
                System.out.println(y);
            }
        }    

Note: Just like 2-d jagged array we can create 3-d , 4-d jagged array
for cursoity:
 int num[][][]=new int[3][][];
        num[0]=new int[2][];
        num[1]=new int[3][];    
        num[2]=new int[4][];
        num[0][0]=new int[2];
        num[0][1]=new int[3];
        num[1][0]=new int[4];
        num[1][1]=new int[5];
        num[1][2]=new int[6];
        num[2][0]=new int[7];
        num[2][1]=new int[8];
        num[2][2]=new int[9];
        num[2][3]=new int[10];

Intialize the array:
for(int i=0;i num.length;i++){
    for(int j=0;j num[i].length;j++){
        for(int k=0;k num[i][j].length;k++){
            num[i][j][k]=(int)(Math.random()*10);
        }
    }
}

Traverse the element of array:
for(int i=0;i num.length;i++){
    for(int j=0;j num[i].length;j++){
        for(int k=0;k num[i][j].length;k++){
            System.out.print(num[i][j][k]+" ");
        }
    }
}
 */

public class Jagged{
    public static void main(String[] args) {
        int[][] nums = new int[2][];

        // insilising the array with diffrent sizes

       
        nums[0] = new int[3];
        nums[1]=new int[4];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                nums[i][j]=j+1;
            }
        }

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                System.out.println( nums[i][j]);
            }
        }



    }
}