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
        String cont;
        String sumwant;
        System.out.println("Booting Dice Roller...");
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
