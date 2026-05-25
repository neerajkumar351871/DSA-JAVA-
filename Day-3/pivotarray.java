public class pivotarray
{    //  wrong but try.
    public static void  Pivotarray(int number[])
    {
      int mid =number.length/2;
      int start=0;
      for(int i=0;i<mid;i++)
      {
        int temp= number[start];
        number[start]= number[mid];
        number[mid]= temp;
       
      }
    
    }
  public static void  printarray(int number[],  int target)
  {
   for(int i=0;i<number.length;i++)
   {
    //System.out.println(number[i]);  
       if(i==target)
       {
        System.out.println("TARGET VALUE IS :"+number[target]);
       }
    

   }
  }



    public static void main(String args[])
    {
        int array[]={0,1,2,4,5,6,7};
        int target=3;
        Pivotarray(array);
        printarray(array, target);
    }
}
