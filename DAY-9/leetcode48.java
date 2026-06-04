
public class leetcode48 {

    public static void transpose(int[][] matrix) {
        for (int co = 0; co < matrix.length; co++) {
            for (int ro = co+1; ro < matrix[0].length; ro++) {
                int temp=matrix[co][ro];
                matrix[co][ro]=matrix[ro][co];
                matrix[ro][co]=temp;
            }

        }
    }
    public static void  rotate(int matrix[][])
    {   
       for(int ro=0;ro<matrix.length;ro++)
        {
         int start=0;
        int end=matrix[0].length-1;
        while(start<end)
        {
            int temp=matrix[ro][start];
            matrix[ro][start]=matrix[ro][end];
            matrix[ro][end]=temp;
            start++;
            end--;
        }

        }
    }

    public static void printmatrix(int matrix[][]) {
        for (int co = 0; co < matrix.length; co++) {
            for (int ro = 0; ro < matrix[0].length; ro++) {
                System.out.print(matrix[co][ro]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int matrix[][]= {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        transpose(matrix);
        rotate(matrix);
        printmatrix(matrix);
    }
}
