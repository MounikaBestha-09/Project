import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Project Launcher ===");
        System.out.println("1. SmartCalculator");
        System.out.println("2. FileDBExecutor");
        System.out.println("3. DatabaseMenuApp");
        System.out.print("Choose an option (1-3): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Calculator3.main(new String[]{});
                break;
            case 2:
                crud2.main(new String[]{});
                break;
            case 3:
                MainApp.main(new String[]{});
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
