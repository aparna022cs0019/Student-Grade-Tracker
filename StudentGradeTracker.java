import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Enter grade of " + name + ": ");
            int grade = sc.nextInt();
            sc.nextLine(); 
            students.add(new Student(name, grade));
        }

        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        String topStudent = "", lowStudent = "";

        for (Student s : students) {
            sum += s.grade;
            if (s.grade > highest) {
                highest = s.grade;
                topStudent = s.name;
            }
            if (s.grade < lowest) {
                lowest = s.grade;
                lowStudent = s.name;
            }
        }

        double average = (double) sum / n;


        System.out.println("\n===== Student Grades Report =====");
        for (Student s : students) {
            System.out.println(s.name + " : " + s.grade);
        }
        System.out.println("----------------------------------");
        System.out.println("Average Score : " + average);
        System.out.println("Highest Score : " + highest + " (" + topStudent + ")");
        System.out.println("Lowest Score  : " + lowest + " (" + lowStudent + ")");
        System.out.println("==================================");

        sc.close();
    }
}
