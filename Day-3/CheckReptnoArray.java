public class CheckReptnoArray
{  public static  boolean duplicatearray(int array[])
{
    for(int i=0;i<array.length;i++)
    {
       for(int j=i+1;j<array.length;j++)
       {
         if(array[i]==array[j])
         {
            return true;
         }
       }
    }
     return false;
}
    public static void main(String arsg[])
    {
        int array[]={ 1, 1, 3, 3, 4, 3, 2, 4, 2};
         boolean decision= duplicatearray(array);
         if(decision)
         {
            System.out.println("DUPLICATE VALUE IS  GET");
         }
         else
         {
            System.out.println(" HAVE NO DUPLICATE VALUE");
         }
    }
}