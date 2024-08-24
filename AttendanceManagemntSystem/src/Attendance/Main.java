package Attendance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AttendanceManager manager = new AttendanceManager();

        while (true) {
            System.out.println("1. Mark Attendance");
            System.out.println("2. Display Attendance");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Enter Date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    System.out.print("Is Present? (true/false): ");
                    boolean present = scanner.nextBoolean();
                    manager.markAttendance(studentId, date, present);
                    break;

                case 2:
                    manager.displayAttendance();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

