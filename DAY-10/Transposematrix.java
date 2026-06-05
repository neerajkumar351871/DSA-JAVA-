public class Transposematrix
{   
    public static void transpose(int [][]matrix)
    {
        int row=matrix.length;
        int co=matrix[0].length;
        // Before transpose
         printmatrix(matrix);

         int [][] trans = new int[co][row];
         for(int i=0;i<row; i++)
         {
            for(int j=0;j<co;j++)
            {
                trans[j][i]=matrix[i][j];
            }
         }
      // After transpose.
      System.out.println("AFTER TRANSPOSE");
      printmatrix(trans);
        
    }
    public static void  printmatrix(int[][] matrix)
    {
        for(int co=0;co<matrix.length;co++)
        {
            for(int ro=0;ro<matrix[0].length;ro++)
            {
                System.out.print(matrix[co][ro]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int[][] matrix= {{1,2,3},{4,5,6}};
        transpose(matrix);
    }
}