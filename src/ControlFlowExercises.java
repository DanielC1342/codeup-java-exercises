public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i<=15) {
            System.out.println(i++ + " ");
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
//        int x = 0;
//        do {
//            System.out.println(x++);
//            x++;
//        } while (x<=100);

//        int x = 100;
//        do {
//            System.out.println(x);
//            x-=5;
//        } while (x>=-10);

        long x = 2;
        do {
            System.out.println(x);
            x*=x;
        } while (x<=1000000);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    }
}
