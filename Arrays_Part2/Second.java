package Arrays_Part2;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("How many Students do you want to Deal with? ");
        int numberOfStudents = data.nextInt();

       
        String[] names = new String[numberOfStudents];
        int[] ids = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the Name: ");
            names[i] = data.next(); 

            System.out.println("Please Enter your ID: ");
            ids[i] = data.nextInt();
        }

            System.out.println("Below is the Student's Details");
        for (int i = 0; i < numberOfStudents; i++) {
            Student student = new Student(names[i], ids[i]);
            student.information();
        }
    }
}

class Student {
    public int id_number;
    public String name;

    Student(String name, int id_number) {
        this.id_number = id_number;
        this.name = name;
    }

    public void information() {
        System.out.println(this.id_number + "\t" + this.name);
    }
}
