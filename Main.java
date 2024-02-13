import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Schedule schedule = new Schedule();

        while (true) {
            System.out.println("\n1. Add New Teacher and New Subject");
            System.out.println("2. Display Schedule");
            System.out.println("3. Schedule Session ");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add New Teacher logic
                    System.out.print("Enter teacher name: ");
                    String newTeacherName = scanner.next();

                    System.out.print("Enter teacher subject: ");
                    String newTeacherSubject = scanner.next();

                    System.out.print("Enter teacher availability: ");
                    String availabilityInput = scanner.next();
                    List<String> newTeacherAvailability = List.of(availabilityInput.split(","));

                    Teacher newTeacher = new Teacher(newTeacherName, newTeacherSubject, newTeacherAvailability);
                    schedule.addTeacher(newTeacher);
                    System.out.println("New teacher added successfully!");
                    break;
                case 2:
                    schedule.displaySchedule();
                    break;
                case 3:
                    System.out.print("Enter subject: ");
                    String subject = scanner.next();

                    System.out.print("Enter time slot: ");
                    String timeSlot = scanner.next();

                    System.out.print("Enter duration: ");
                    int duration = scanner.nextInt();

                    schedule.scheduleSession(subject, timeSlot, duration);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}