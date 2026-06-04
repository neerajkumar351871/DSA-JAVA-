
public class Question2 {

    public static void printarray(int matrix[][]) {
        for (int ro = 0; ro < matrix.length; ro++) {
            for (int co = 0; co < matrix[0].length; co++) {
                System.out.print(matrix[ro][co]+" ");
            }
            System.out.println();
        }
        System.out.println("BEFORE TRANSPOSE");
    }

    public static void Transposematrix(int matrix[][]) {
          System.out.println("AFTER TRANSPOSE");
        for (int ro = 0; ro < matrix.length; ro++) {
            for (int co = 0; co < matrix[0].length-1; co++) {
                System.out.print(matrix[co][ro]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int[][] matrix = {{2, 3, 7}, {5, 6, 7}};
        printarray(matrix);
        Transposematrix(matrix);
       

    }
}
