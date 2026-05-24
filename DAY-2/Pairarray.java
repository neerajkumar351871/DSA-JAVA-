
public class Pairarray {

    public static void pariArray(int array[]) {
        int TotalPair=0;
         // formula based;
         int totalpair=0;
        for (int i = 0; i < array.length; i++) {
          for(int j=i+1;j<array.length;j++)
          {
           System.out.print("("+array[i]+","+array[j]+")");
           TotalPair++;
           int n=array.length;
           totalpair= n*(n-1)/2;
          }
          System.out.println();
        }
        System.out.println("Total Pair:"+TotalPair);
        System.out.println("Total Pair:"+totalpair);


    }

    public static void main(String args[]) {
        int array[] = {2, 4, 6, 8, 10};
        pariArray(array);
    }
}
