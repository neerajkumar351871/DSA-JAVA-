
public class Rotateimage {

    public static void rotateimage(int matrix[][]) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = r+1; c < matrix[0].length; c++) {
                int temp =matrix[r][c];
                matrix[r][c]=matrix[c][r];
                matrix[c][r]= temp;
               
            }
           
        }
    }

    public static void printmatrix(int matrix[][]) {

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int matrix[][] = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 120, 130, 140}, {150, 160, 170, 180}};
       printmatrix(matrix);
       rotateimage(matrix);
       printmatrix(matrix);
    }
}
