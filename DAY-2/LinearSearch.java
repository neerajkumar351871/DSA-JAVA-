public  class LinearSearch
{   
    public static  boolean linearSearch(int array[], int key)
{ 
    for(int i=0;i<array.length;i++)
    {
       if( array[i]== key)
       {
        return true;
       }
    }
     
  return false;
}
    public static void main(String args[])
    {
        int  marks[]={2,4,6,8,10,12,16};
        int key=11;
         boolean decision= linearSearch(marks, key);
         if(decision)
         {
            System.out.println("value is get in array : "+key);
         }
         else

         {
            System.out.println("NOT GET : "+ key);
         }
    }
}