package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String nam) {
        name = nam;
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAvg() {
        int total = 0;
        for (int grade:grades) {
            total += grade;
        }
        return total/grades.size();
    }

    public static void main(String[] args) {
        Student daniel = new Student("Daniel");
        daniel.addGrade(95);
        daniel.addGrade(85);
        daniel.addGrade(90);
        daniel.addGrade(95);
        System.out.println("Student Name: "+daniel.getName());
        System.out.println("Grades: "+daniel.grades.toString());
        System.out.println("Grade Avg: "+daniel.getGradeAvg());

    }
}
