import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String question = "Sure.";
        String yelling = "Whoa, chill out!";
        String nothing = "Fine, be that way!";
        String whatever = "Whatever.";
        String response;
        System.out.print("Talk to Bob: ");
        response = sc.nextLine();

        if (response.endsWith("?")) {
            System.out.println(question);
        }else if (response.endsWith("!")) {
            System.out.println(yelling);
        }else if (response.length() == 0) {
            System.out.println(nothing);
        }else {
            System.out.println(whatever);
        }
    }
}
