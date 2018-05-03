import java.util.Scanner;
public class DiceRoller {
    public static void main(String[] args) {
        dice();
    }
    public static void dice() {
        Scanner sc = new Scanner(System.in);
        int dietype;
        int dienum;
        int total = 0;
        String sumwant;
        System.out.println();
        System.out.println("What sided die do you want to throw?");
        dietype = sc.nextInt();
        System.out.println("how many d" + dietype + " do you want to throw?");
        dienum = sc.nextInt();
        System.out.println("Rolling " + dienum + "d" + dietype + "...");
        for(int d = 0;d<dienum;d++) {
            int rawroll = (int)(Math.random()*(dietype))+1;
            System.out.print(rawroll+" ");
            total += rawroll;
            if(dienum==1&&dietype==20&&rawroll==1) {
                System.out.println("Yikes...");
            }
            if(dienum==1&&dietype==20&&rawroll==20) {
                System.out.println("Nice!");
            }
        }
        System.out.println();
        if (dienum>1) {
            System.out.println("Do you want the total? [y/n]");
            sumwant = sc.next();
            if (sumwant.equals("y")) {
                System.out.println("Total: " + total);
            }
        }
        System.out.println();
        dice();
    }
}
