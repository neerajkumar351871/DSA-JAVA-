public class Kadans_Algo
{
    public static void kadansAlog(int array[])
    {   int ms= Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum=sum+array[i];
            if(sum<0)
            {sum=0;}
            ms= Math.max(sum, ms);
        }
        System.out.println("MAX:"+ms);
    }
    public static void main(String args[])
    {
        int array[]={-2,-3,4,-1,-2,1,5,-3};
        kadansAlog(array);
    }
}