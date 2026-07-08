
import java.util.*;

class CreateString {
    public static void printletter(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String args[]) {
        // create String

        String str = "Welcome";
        String ds = new String("Welcome");
        //System.out.println("Print String"+(str)+" "+(ds));
        //String are immutable.
        // means not change string.

        // take input.
        Scanner sc = new Scanner(System.in);
        // String  name= sc.next();
        // System.out.println("USER NAME : "+name);

        // String  name= sc.nextLine();// Take total sentences.
        // System.out.println("USER NAME :"+name);
        // count length;
        //String name="Tony stark";
        //System.out.println("LENGTH OF STRING:"+name.length());
        // concatenation of string.
        String name = "neeraj";
        String surname = "kumar";
        String fullname = name + " " + surname;
        // System.out.println("USER NAME : " + fullname);
        printletter(fullname);

    }
}
