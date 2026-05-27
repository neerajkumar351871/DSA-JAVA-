
public class Pivotarray {

    public static void pivot(int array[], int target) {
        int mid = array.length / 2;
        int con[] = new int[array.length];
        int k = 0;
        // Second half//
        for (int i = array.length / 2; i < array.length; i++) {
            con[k] = array[i];
            k++;
        }
        // First half
        for (int j = 0; j < array.length / 2; j++) {
            con[k] = array[j];
            k++;
        }
        // Print array
        printarray(con);
//    Search  Target.
        int result = SearchTarget(con, target);
        System.out.println("TARGET VALUE IS :" + result);

    }

    public static int SearchTarget(int array[], int target) {
        for (int i = 0; i < array.length; i++) {
            if (i == target) {
                return i;

            }

        }

        return -1;
    }

    public static void printarray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String args[]) {
        int array[] = {0, 1, 2, 4, 5, 6, 7};
        pivot(array, 3);

    }
}
