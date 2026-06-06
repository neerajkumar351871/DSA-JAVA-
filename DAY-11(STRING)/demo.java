
import java.util.*;

public class demo {

    public static void testfunction() {
        String data = new String();
        Scanner sc = new Scanner(System.in);
        data = sc.nextLine();
        System.out.println("USER NAME:" + data);
        // GO TO EACH WORD WITH THE HELP OF chatAt(). function.
        System.out.println(data.charAt(4));

    }
x
    public static void printeachletter(String name) {
        for (int i = 0; i < name.length(); i++) {
       System.out.print(name.charAt(i)+" ");
        }
    }

    public static void main(String args[]) {
        String name = new String("NEERAJ KUMAR SINGH");
        //testfunction();
        printeachletter(name);
    }
}
