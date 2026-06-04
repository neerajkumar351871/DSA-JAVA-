public class Question1
{
     public  static void addsecond(int  matrix[][])
     {
        // int co= matrix.length-1;
        // int ro=matrix[0].length-1;
        //  int newro=1;
        //  int newco=0;
        //  int sum=0;
        // while( newro<co && newco<=ro)
        // {
        //    sum+=matrix[newro][newco];
        //    newco++;
           
        // }
        // System.out.println(sum);
        int sum=0;
         for(int co=0;co<matrix[0].length;co++)
         {
            sum+=matrix[1][co];
         }
         System.out.println(sum);

     }
    public static  void main(String args[])
    {
    int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
    addsecond(nums);
    }
}