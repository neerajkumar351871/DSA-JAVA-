 import java.util.*;
 public class Array
{
    public static void arrayCreation()
    {
     // first type.
    //  int array[]= new  int[5];
    //  // intilazation.
    //  array[0]=1;
    //  array[1]=2;
    //  for(int i=0;i<array.length;i++)
    //  {
    //     System.out.print(array[i]+" ");
    //  }

    // Second creation.

    // int array[]={1,2,3,4,5,6};
    // for(int i=0;i<array.length;i++)
    // {
    //     System.out.print(array[i]+" ");
    // }

    }
    // take inputs.

    public static void Takeinput()
    {
        int array[]= new int[20];
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER MARKS");
        array[0]= sc.nextInt();
        array[1]= sc.nextInt();
        array[2]= sc.nextInt();
        System.out.println("Englis marks : "+array[0]);
        System.out.println("Math marks : "+array[1]);
        System.out.println("Computer marks : "+array[2]);
        // update marks.(update array).
        array[2]= sc.nextInt();
        System.out.println("Computer marks : "+array[2]);



    }
    public static void main(String args[])
    {
        // arrayCreation();
        // System.out.println("Hello");
        // String fruits[]={"Apple","Mango"};
        // System.out.println(Arrays.toString(fruits));
        Takeinput();
    }
}