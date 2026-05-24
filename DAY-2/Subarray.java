
public class Subarray {

    public static void Subarray(int array[]) {
        int ts = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int start = 0; start < array.length; start++) {
            for (int end = start; end < array.length; end++) {
                sum = 0;

                for (int i = start; i <= end; i++) {
                    sum += array[i];
                    System.out.print(array[i] + " ");
                }

                ts++;
                System.out.println(" " + sum);
                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }

            }

            System.out.println();

        }
        System.out.println("[MAX:" + max + "," + "MIN:" + min + "]");
        int n = array.length;
        // System.out.println("Total subarray:" + ts);
        System.out.println("Totla subarray:" + n * (n + 1) / 2);

    }

    public static void main(String args[]) {
        int array[] = {2, 4, 6, 8, 10};
        Subarray(array);
    }
}
