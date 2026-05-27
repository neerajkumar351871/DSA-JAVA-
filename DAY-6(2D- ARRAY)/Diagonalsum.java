
public class Diagonalsum {

    public static void sum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
              //  System.out.print(matrix[i][j]+" ");
              // Primary Diagonal.
                if (i == j) {
                    System.out.print(matrix[i][j]+" ");
                    sum += matrix[i][j];
                }
                // Seconday Diagonal.
                else if(i+j==matrix.length-1)
                {    System.out.print(matrix[i][j]+" ");
                    sum+=matrix[i][j];
                }
            }
            System.out.println();
        }
        System.out.print("DIAGONAL SUM " + sum);
    }

    public static void main(String[] arg) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};

        sum(matrix);
    }

}
