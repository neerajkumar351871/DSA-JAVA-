
class PalindroneString {

    public static boolean checkPalindrone(String str) {
          int length= str.length()-1;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(length)) {
                return false;
            }
            length--;
        }
        return true;
    }

    public static void main(String args[]) {
        String sc= "madam";
      boolean data = checkPalindrone(sc);
      System.out.println(data);

    }
}
