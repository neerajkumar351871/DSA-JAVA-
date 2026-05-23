import java.util.*;
public class Secondlargest
{   public static void secondlargest(int array[])
{
     int Max= Integer.MIN_VALUE;
    int index=0; 
     for(int i=0;i<array.length;i++)
     {
        if(Max<array[i])
        {
            Max=array[i];
            index=i;
        }
     }
      array[index]=0;

      
      int secondmax = Integer.MIN_VALUE;
      for(int i=0;i<array.length;i++)
      {
        if(secondmax< array[i])
        {
            secondmax = array[i];
        }
      }
      System.out.println("Second max value is :"+secondmax);

    }
    public static void main(String args[])
    {
        int array[]={2,3,4,5,6,7,8,15};
       secondlargest(array); 
    }
}