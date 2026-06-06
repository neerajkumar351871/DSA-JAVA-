import java.util.*;
public class STRINGS
{
    public static void main(String args[])
    {
     // ARRAY WITH CHARACTER.
      char st[]={'a','b','c','d'};
      
      //String
     
     String name="neerajkumar";

     // WITH CLASS AND OBJECT BASED
     String student= new String("Neerajkumar");
     // STRING ARE IMMUTABLE



     // TAKE INPUT
     Scanner sc= new Scanner(System.in);
     //String data= sc.next();// next () TAKE ONLY ONE WORD IN STARTING SENETENCES.
     String data= sc.nextLine();// nextLine()  TAKE SENTENCE  WITH SPACE
    // System.out.println("USER NAME IS :"+data);

     //  COUNT THE LENGTH.
     String  count = new String(data);
     System.out.println("USER NAME IS:"+count +" TOTAL LENGTH :"+count.length());

     
    }
}