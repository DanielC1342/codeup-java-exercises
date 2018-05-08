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

    public ArrayList<Integer> getGrades() {
        return grades;
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
}
