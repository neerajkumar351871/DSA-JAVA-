public class Reversearray
{
    public static  void reverse(int array[])
    {
        int start=0;
        int end=array.length-1;

        for(int i=0;i<array.length/2;i++)
        {
              int temp=array[start];
               array[start]= array[end];
               array[end]=temp;
                start++;
                end --;
        }
        
    }
     public static  void printarray(int array[])
     {
        
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
     }
    public static  void main(String args[])
    {
        int array[]={2,4,6,10};
        reverse(array);
        printarray(array);
       
    }
}