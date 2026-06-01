
public class Findrandomindex {

    public static boolean randomindex(int matrix[][], int target) {
        int r = matrix.length - 1;
        int c = 0;
        // System.out.println("TOTAL ROW : "+r  +    "TOTAL COL: "+c);
        while (r >=0 && c < matrix[0].length) {
            if (matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c] < target) {
                c++;
            } else {
                r--;
            }
        }
        return false;
        //System.out.println(matrix[r][c]);
    }

    public static void main(String args[]) {
        int matrix[][] = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 8;
       boolean dec=   randomindex(matrix, target);
       if(dec)
       {
        System.out.println("FOUND");
       }
       else
       {
        System.out.println("NOT FOUND ");
       }
    }
}
