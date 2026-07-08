
class printSubstring {

    public static String printstring(String str, int si, int ei) {
        String submit = "";
        for (int i = si; i < ei; i++) {
            submit += str.charAt(i);
        }
        return submit;
    }

    public static void main(String args[]) {
        String str = "HELLO WORLD";
        System.out.println(printstring(str, 0, 5));
        // USE PREDEFINDE FUNCTION.
       System.out.println(str.substring(0,5));
    }
}
