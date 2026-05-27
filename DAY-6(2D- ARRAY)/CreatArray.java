
import java.util.*;

public class CreatArray {

    public static void CreateArray2d() {
        int n = 3, m = 3;
        int matrix[][] = new int[n][m];
        Scanner sc = new Scanner(System.in);
        // for (int i = 0; i <n; i++) {
        //     for (int j = 0; j <m; j++) {
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        // static value provide.
       int matrixes[][]={{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[0].length; j++) {
                System.out.print(matrixes[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String arsg[]) {
        CreateArray2d();

    }
}
