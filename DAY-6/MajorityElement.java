// leet code problem (169. Majority Element)

public class MajorityElement {

    public static int majorityelement(int array[]) {
        for (int i = 0; i < array.length ; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > array.length / 2) {
                return array[i];
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        // int nums[] = {2, 2, 1, 1, 1, 2, 2};
        int nums[] ={3,2,3};
        System.out.print(majorityelement(nums));
    }
}
