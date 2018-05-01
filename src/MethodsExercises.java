import java.util.Scanner;
public class MethodsExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int a = 10;
        int b = 5;
        System.out.println(add(a,b));
        System.out.println(subtract(a,b));
        System.out.println(multiply(a,b));
        System.out.println(divide(a,b));
        System.out.println(modulus(a,b));
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Give a number: ");
        number = sc.nextInt();
        getInteger(number);
        dice();
    }
    public static int add(int x, int y) {
        return x+y;
    }
    public static int subtract(int x, int y) {
        return x-y;
    }
    public static int multiply(int x, int y) {
        return x*y;
    }
    public static int divide(int x, int y) {
        return x/y;
    }
    public static int modulus(int x, int y) {
        return x%y;
    }
    public static void getInteger(int num) {
        Scanner sc = new Scanner(System.in);
        if (num >= 1 && num <= 10) {
            System.out.println(num + " is in between 1 and 10");
            factorial(num);
        }else {
            System.out.println(num + " is not between 1 and 10");
            int newnum;
            System.out.print("Give me a number: ");
            newnum = sc.nextInt();
            getInteger(newnum);
        }
    }
    public static void factorial(int num) {
        int total = 1;
        System.out.print(num+"! = ");
        for(int i = 1;i<=num;i++) {
            if(i == num){
                total = total*i;
                System.out.println(num+" = "+total);
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                break;
            }
            total = total*i;
            System.out.print(i+" x ");
        }
    }
    public static void dice() {
        Scanner sc = new Scanner(System.in);
        int dietype;
        int dienum;
        int total = 0;
        String cont;
        String sumwant;
        System.out.println("What sided die do you want to throw?");
        dietype = sc.nextInt();
        System.out.println("how many d" + dietype + " do you want to throw?");
        dienum = sc.nextInt();
        System.out.println("Rolling " + dienum + "d" + dietype + "...");
        for(int d = 0;d<dienum;d++) {
            int rawroll = (int)(Math.random()*(dietype))+1;
            System.out.print(rawroll+" ");
            total += rawroll;
        }
        System.out.println();
        System.out.println("Do you want the total? [y/n]");
        sumwant = sc.next();
        if(sumwant.equals("y")) {
            System.out.println("Total: "+total);
        }
        System.out.println();
        System.out.println();
        System.out.println("Roll Again? [y/n]");
        cont = sc.next();
        if(cont.equals("y")) {
            dice();
        }
    }
}
