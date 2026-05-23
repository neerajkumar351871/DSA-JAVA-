
public class BinarySearch {

    public static boolean binarySearch(int array[], int key) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid =(start+end) / 2;
            if (array[mid] == key) {
                return true;
            } else if (array[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return false;
    }

    public static void main(String args[]) {
        int array[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int key = 18;
        boolean decision=  binarySearch(array, key);
        if(decision)
        {
            System.out.println("Key is found "+ key);
        }
        else

        {
        System.out.println("key is not found: "+key);
        }
    }
}
