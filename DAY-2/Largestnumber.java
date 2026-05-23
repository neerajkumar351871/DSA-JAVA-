public class Largestnumber
{ 
    public static  int largestarray(int array[])
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(max< array[i])
            {
                max=array[i];
            }
        }
        return max;
    }
    public static int smallest(int array[])
    {

       int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(min> array[i])
            {
                min=array[i];
            }
        }
        return min; 
    }
    public static void main(String args[])
    {
        int array[]={1,2,6,3,5,11};
        System.out.println("MAX VALUE IS :"+largestarray(array));
        System.out.println("MIN VALUE IS :"+smallest(array));

    }
}