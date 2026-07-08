
class Shortpath {

    public static float findShortpath(String str) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            char dire = str.charAt(i);
            // NORTH;
            if (dire == 'N') {
                y++;
            } //SOUTH  
            else if (dire == 'S') {
                y--;
            } //WEST
            else if (dire == 'W') {
                x--;
            }// EAST 
            else {
                x++;
            }
        }

        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String args[]) {
        String path = "WNEENESENNN";
        float data= findShortpath(path);
        System.out.println(data);
    }
}
