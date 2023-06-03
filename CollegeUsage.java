package CollegeHW;
import java.util.Scanner;

public class CollegeUsage{
    //TODO: Create the attendance table
    //TODO: Create the grades table
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Please select an option:");
            System.out.println("1. Add Student");
            System.out.println("2. Update Address");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Selection: ");

            int selection = scanner.nextInt();
            scanner.nextLine(); // Clear the junk after the int (/n)

            switch (selection) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    updateAddress(scanner);
                    break;
                case 3:
                    deleteStudent(scanner);
                    break;
                case 4:
                    displayStudents();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }

            System.out.println("-------------------------");
        }

        scanner.close();
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter student number: ");
        int studentNumber = scanner.nextInt();
        scanner.nextLine(); // Clear the junk

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student address: ");
        String address = scanner.nextLine();

        CollegeManager.addStudent(studentNumber, name, address);
        System.out.println("Student added successfully.");
    }

    private static void updateAddress(Scanner scanner) {
        System.out.print("Enter student number: ");
        int studentNumber = scanner.nextInt();
        scanner.nextLine(); // Clear the junk

        System.out.print("Enter new address: ");
        String newAddress = scanner.nextLine();

        CollegeManager.updateAddress(studentNumber, newAddress);
        System.out.println("Address updated successfully.");
    }

    private static void deleteStudent(Scanner scanner) {
        System.out.print("Enter student number: ");
        int studentNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        CollegeManager.deleteStudent(studentNumber);
        System.out.println("Student deleted successfully.");
    }

    private static void displayStudents() {
        CollegeManager.displayStudents();
    }
}
