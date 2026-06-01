// sort color leet code 75/
public class SortColor
{  public static void sortcolor(int nums[])
{
 for(int i=0;i<nums.length-1;i++)
 {
    for(int j=0;j<nums.length-1-i;j++)
    {
        if(nums[j]>nums[j+1])
        {
            int temp= nums[j];
             nums[j]= nums[j+1];
             nums[j+1]=temp;
        }
    }
 }
}
   public static void printarray(int array[])
   {
    for(int i=0;i<array.length;i++)
    {
        System.out.print(array[i]+" ");
    }
   }
    public static void main(String args[])
    {
      int array[]={2,0,1};
      sortcolor(array);
      printarray(array);

    }
}