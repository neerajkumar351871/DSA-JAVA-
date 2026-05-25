import java.util.Arrays;
import java.util.Collections;
public class Inbuildsort
{
    public static void main(String args[])
    {
        Integer array[]={3,6,5,7,1,2,4};
       // Ascending order.
      //  Arrays.sort(array);
      // Arrays.sort(array,0,4);
      // Descending order.
      Arrays.sort(array,Collections.reverseOrder());
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }

    }
}