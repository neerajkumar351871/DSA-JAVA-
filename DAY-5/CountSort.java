
public class CountSort {

public static void countsort(int array[])
{
      int largest= Integer.MIN_VALUE;
      for(int i=0;i<array.length;i++)
      {
        largest = Math.max(array[i], largest);
      } 
    //   System.out.println(largest);

       int count[]= new int[largest+1];
       // Count frequnci
       for(int i=0;i<array.length;i++)
       {
        count[array[i]]++;
       }
       // Sorting part.
         int j=0;
         for(int i=0;j<array.length;i++)
         {
            while(count[i]>0)
            {
               array[j]=i;
               j++;
               count[i]--;
            }
         }
     
}
    public static void printarray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static void main(String args[]) {
     
      int array[]={1,4,1,3,2,4,3,7};
      countsort(array);
      printarray(array);
    }
}
