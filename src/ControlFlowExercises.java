import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int i = 5;
//        while (i<=15) {
//            System.out.println(i++ + " ");
//        }

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

//        long x = 2;
//        do {
//            System.out.println(x);
//            x*=x;
//        } while (x<=1000000);

        for (int i = 5;i<=15;i++) {
            System.out.println(i);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
//        for (int e = 0;e<=100;e+=2) {
//            System.out.println(e);
//        }
//
//        for (int e = 100;e>=-10;e-=5) {
//            System.out.println(e);
//        }

        for (long e = 2;e<1000000;e*=e) {
            System.out.println(e);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        for (int f = 1;f<=100;f++) {
            int trimult = f % 3;
            int pentmult = f % 5;
            if (trimult == 0 && pentmult == 0) {
                System.out.println("fizzbuzz ");
            }else if (trimult == 0) {
                System.out.println("fizz ");
            }else if (pentmult == 0) {
                System.out.println("buzz ");
            }else {
                System.out.println(f + " ");
            }
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        int num;
        System.out.print("what number would you like to go up to?: ");
        num = sc.nextInt();
        System.out.println("Here is your Table!");
        System.out.println();
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 0;i<=num;i++) {
            int iter = i;
            int isq = iter * iter;
            int icu = isq * i;
            if (iter >= 10) {
                System.out.print(iter + "     | ");
            }else {
                System.out.print(iter + "      | ");
            }
            if (isq>=100) {
                System.out.print(isq+"     | ");
            }else if(isq>=10) {
                System.out.print(isq+"      | ");
            }else {
                System.out.print(isq+"       | ");
            }
            System.out.println(icu);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Input a grade from 0 to 100: ");
        int grade = sc.nextInt();
        if (grade<60) {
            System.out.println("You got an F");
        }else if (grade<67) {
            System.out.println("You got a D");
        }else if (grade<80) {
            System.out.println("You got a C");
        }else if (grade<88) {
            System.out.println("You got a B");
        }else {
            System.out.println("You got an A");
        }

    }
}
