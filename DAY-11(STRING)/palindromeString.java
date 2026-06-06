public class palindromeString
{   
    public static  boolean palindrome(String str)
    {    int n= str.length();
        for(int i=0;i<str.length()/2;i++)
        {
           if(str.charAt(i) != str.charAt(n-1-i))
           {
             return false;
           }
        }
        return true;
    }
    public static void main(String arga[])
    {
      String data= new String("noson");
      if(palindrome(data))
      {
        System.out.print("PALINDROME");
      }
    else
    {
    System.out.print("NOT  PALINDROME");
  
    }
      
    }
}