import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int ioNum;
//        System.out.print("Please input an int: ");
//        ioNum = sc.nextInt();
//        System.out.print("You input the number ");
//        System.out.println(ioNum);

//        String un;
//        String deux;
//        String troi;
//        System.out.print("Please input 3 words: ");
//        un = sc.next();
//        deux = sc.next();
//        troi = sc.next();
//        System.out.println(troi +" "+ deux +" "+ un);

//        String sentence;
//        System.out.print("Please input a sentence: ");
//        sentence = sc.nextLine();
//        System.out.println("You input the sentence: "+sentence);

        int length;
        int width;
        int height;
        System.out.print("Please input room length: ");
        length = sc.nextInt();
        System.out.print("Please input room width: ");
        width = sc.nextInt();
        System.out.print("Please input height: ");
        height = sc.nextInt();
        System.out.println("==================================");
        System.out.println("area: "+(length*width));
        System.out.println("perimeter: "+((2*length)+(2*width)));
        System.out.println("volume: "+(length*width*height));
    }
}
