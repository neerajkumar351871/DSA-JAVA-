
public class Bubblesort {
        
    // Ascending order.
    public static void bubblesort(int array[]) {
        
        for (int i = 0; i < array.length - 1; i++) {
                //j<array.length-1-i this used to after swap the element not check not go lopp swaped elements.
            // int swap=0;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                   // swap++;// count total swapping.
            
                }
            }
// System.out.println("TOTAL SWAP:"+swap);
        }
     
    }
     // Descending order
      public static void bubble(int array[]) {
        
        for (int i = 0; i < array.length - 1; i++) {
                //j<array.length-1-i this used to after swap the element not check not go lopp swaped elements.
            // int swap=0;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] >array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                   // swap++;
            
                }
            }
// System.out.println("TOTAL SWAP:"+swap);
        }
     
    }
     public static void  printarray(int array[])
     {
        for(int i=0;i<array.length;i++)
        {
        System.out.println(array[i]+" ");
        }
     }
     
    public static void main(String args[]) {
        int array[] = {2,0,2,1,1,0};
        printarray(array);
       // bubblesort(array);
        System.out.println("AFTER SWAP");
        bubble(array);
        printarray(array);
    }
}
