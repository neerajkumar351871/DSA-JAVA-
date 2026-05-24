
public class maxsubarray {

    public static void MaxSubarray(int array[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                sum = 0;

                for (int k = i; k <= j; k++) {
                  //  System.out.print(array[k] + " ");
                    sum += array[k];
                }
                if (min > sum) {
                    min = sum;
                }
                if (max < sum) {
                    max = sum;
                }
                System.out.println(" " + sum);

            }

            System.out.println();
        }

        System.out.println("MAX:" + max);
        System.out.println("min:" + min);

    }

    public static void main(String args[]) {
        int array[] = {1, -2, 6, -1, 3};
        MaxSubarray(array);
    }
}
