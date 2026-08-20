import java.util.Scanner;

public class DigitalPasswordLock {

    private static final String CORRECT_PASSWORD = "1234";
    private static final int MAX_ATTEMPTS = 3;

    public static boolean verifyPassword(String password) {
        return CORRECT_PASSWORD.equals(password);
    }

    public static String checkAccess(String password, int attempt) {
        if (verifyPassword(password)) {
            return "ACCESS GRANTED";
        }

        if (attempt >= MAX_ATTEMPTS) {
            return "SYSTEM LOCKED";
        }

        return "ACCESS DENIED";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean accessGranted = false;

        System.out.println("================================");
        System.out.println("     DIGITAL PASSWORD LOCK");
        System.out.println("================================");

        while (attempts < MAX_ATTEMPTS && !accessGranted) {

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            attempts++;

            String result = checkAccess(password, attempts);
            System.out.println(result);

            if (result.equals("ACCESS GRANTED")) {
                accessGranted = true;
            } else if (result.equals("SYSTEM LOCKED")) {
                System.out.println("Maximum attempts exceeded.");
            } else {
                System.out.println("Attempts remaining: "
                        + (MAX_ATTEMPTS - attempts));
            }
        }

        System.out.println("================================");

        if (accessGranted) {
            System.out.println("Door Unlocked Successfully!");
        } else {
            System.out.println("Door Remains Locked.");
        }

        scanner.close();
    }
}
