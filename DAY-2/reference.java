public class reference
{
    public static void update(int array[])
    {   
          for(int i=0;i<array.length;i++)
          {
            array[i]= array[i]*2;
          }
    }
    public  static  void main(String args[])
    {
        int array[]={1,2,3,4,5,6};
        // array work with pass by reference.
        update(array);
    

    // print new array.
    for(int i=0;i<array.length;i++)
    {
        System.out.println(array[i]+" ");
    }

    }
}