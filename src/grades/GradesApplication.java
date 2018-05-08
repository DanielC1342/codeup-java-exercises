package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String,Student> students = new HashMap<>();

        Student tallesin = new Student("Tallesin");
        tallesin.addGrade(90);
        tallesin.addGrade(95);
        tallesin.addGrade(85);
        Student marisha = new Student("Marisha");
        marisha.addGrade(80);
        marisha.addGrade(85);
        marisha.addGrade(83);
        Student travis = new Student("Travis");
        travis.addGrade(90);
        travis.addGrade(91);
        travis.addGrade(88);
        Student sam = new Student("Sam");
        sam.addGrade(75);
        sam.addGrade(75);
        sam.addGrade(70);
        Student laura = new Student("Laura");
        laura.addGrade(90);
        laura.addGrade(85);
        laura.addGrade(88);
        Student liam = new Student("Liam");
        liam.addGrade(90);
        liam.addGrade(100);
        liam.addGrade(95);
        Student ashley = new Student("Ashley");
        ashley.addGrade(90);
        ashley.addGrade(92);
        ashley.addGrade(90);

        students.put("MollyMauk",tallesin);
        students.put("BleuBeau",marisha);
        students.put("Fjord-Tough",travis);
        students.put("Nott_Brave",sam);
        students.put("OskarXJester",laura);
        students.put("Dirt_Wizard",liam);
        students.put("TallDark&Ragey",ashley);

        execute(students);
    }

    public static void execute(HashMap<String,Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Here are the Students usernames: ");
        for(HashMap.Entry<String,Student> entry: students.entrySet()) {
            System.out.print(" |"+entry.getKey()+"| ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Which student do you want more info on? (Type \"viewall\" to see all students grades)");
        System.out.print(">");
        String response = sc.nextLine();
        if(response.equals("viewall")) {
            System.out.println();
            for(HashMap.Entry<String,Student> entry: students.entrySet()) {
                System.out.println(entry.getValue().getName()+" - "+entry.getValue().getGrades()+" | Avg: "+entry.getValue().getGradeAvg());
            }
        }
        else if(students.containsKey(response)) {
            System.out.println();
            System.out.println("Name: " + students.get(response).getName() + " - GitHub Username: " + response);
            System.out.println("Grades: " + students.get(response).getGrades());
            System.out.println("Current Average: " + students.get(response).getGradeAvg());
            System.out.println();
        }
        else {
            System.out.println("Not a valid username");
            System.out.println();
            execute(students);
        }
        System.out.println();
        System.out.println("Would you like to see another student? [y/n]");
        System.out.print(">");
        String repeat = sc.next();
        if(repeat.equals("y")||repeat.equals("Y")) {
            System.out.println();
            execute(students);
        }
        else {
            System.exit(0);
        }

    }
}
