
public class Selectionsort {

    public static void selectionsort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minpos] > array[j]) {
                    minpos = j;
                }
            }
            int temp = array[i];
            array[i] = array[minpos];
            array[minpos] = temp;
        }
    }

    public static void printarray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static void main(String args[]) {
        int array[] = {5, 4, 1, 3, 2};
        selectionsort(array);
        printarray(array);

    }
}
