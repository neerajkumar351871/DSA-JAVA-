public class Search2dmatrix
{   
    public  static  boolean Search(int matrix[][], int target)
{
 for(int i=0;i<matrix.length;i++)
 {
    for( int j=0;j<matrix[0].length;j++)
    {
       if(matrix[i][j]== target) 
       {
        System.out.println("("+i+","+j+")");
        return true;
       } 
       
    }
 }
 System.out.println("KEY NOT FOUND");
 return false;
}
public static void  largestelement(int matrix[][])
{
 int largest= Integer.MIN_VALUE;
 int smallest= Integer.MAX_VALUE;
 for(int i=0;i<matrix.length;i++)
 {
    for( int j=0;j<matrix[0].length;j++)
    {
    largest= Math.max(largest, matrix[i][j]);
    smallest= Math.min(smallest,matrix[i][j]);
  }
 }
System.out.println("LARGEST ELEMENT IN MATRIX:"+largest);
System.out.println("SMALLEST ELEMENT IN MATRIX:"+smallest);
}

    public static void main(String[] args)
    {
        int matrix[][]={{1,12,3},{4,5,6},{7,8,9}};
        int target=11;
        System.out.println(Search(matrix,target));
        largestelement(matrix);
    }
}