
public class Seachmatrix {

    public static boolean searchMatrix(int matrix[][], int target) {
        int r = 0;
        int c = matrix.length - 1;
        while (c >=0 && r < matrix.length) {
            if (matrix[r][c] == target) {
                return  true;
            } else if (matrix[r][c] < target) {
                r++;

            } else {
                c--;
            }
        }

        return false;
    }
   
    public static void main(String[] args) {
        int matrix[][] = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 18;

          boolean decision = searchMatrix(matrix, target);
        if (decision) {
                      System.out.println("TARGET IS FOUND:" + target);
  
        } else {
            System.out.println("TARGET IS NOT FOUND:" + target);
        }
    }
}
