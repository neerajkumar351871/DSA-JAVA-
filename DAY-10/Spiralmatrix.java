public class Spiralmatrix
{   
    public static void Sprial(int matrix[][])
    {
       int startrow=0;
       int endrow=matrix[0].length-1;
       int startcol=0;
       int endcol=matrix.length-1;
       while(startrow<=endrow && startcol<=endcol)
       {
         // top.
         for(int i=startrow;i<=endrow;i++)
         {
            System.out.print(matrix[startrow][i]+" ");
         }
         // Right.
         for(int k=startrow+1;k<=endrow;k++)
         {
            System.out.print(matrix[k][endrow]+" ");
         }
         // bottom.
         for(int n=endcol-1;n>=startrow;n--)
         {
            System.out.print(matrix[endrow][n]+" ");
         }
         // left.
        for(int m=endcol-1;m>=startrow+1;m--)
        {
            System.out.print(matrix[m][startrow]+" ");
        }
         startrow++;
         startcol++;
         endrow--;
         endcol--;
       }
        System.out.println();
    }
    public static  void main(String args[])
    {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Sprial(matrix);
    }
}