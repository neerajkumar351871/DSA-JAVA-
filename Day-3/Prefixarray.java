
public class Prefixarray {

    public static void MaxSubarray(int array[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int prefix[] = new int[array.length];
        prefix[0] = array[0];
        // Calculate  prefix.
        for (int i = 1; i < array.length; i++) {
            prefix[i] = prefix[i - 1] + array[i];
        }

        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (min > sum) {
                    min = sum;
                }
                if (max < sum) {
                    max = sum;
                }
               

            }

            System.out.println();
        }

        System.out.println("MAX:" + max);
        System.out.println("MIN:" + min);

    }

    public static void main(String args[]) {
        int array[] = {1, -2, 6, -1, 3};
        MaxSubarray(array);
    }
}
