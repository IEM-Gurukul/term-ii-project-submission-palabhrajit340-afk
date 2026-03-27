package main;

import model.Student;
import repository.StudentRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentRepository repo = new StudentRepository();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    repo.addStudent(new Student(id, name));
                    System.out.println("Student Added!");
                    break;

                case 2:
                    for (Student s : repo.getAllStudents()) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }
}
