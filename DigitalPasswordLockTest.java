public class DigitalPasswordLockTest {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println(" DIGITAL PASSWORD LOCK TESTBENCH");
        System.out.println("================================");

        // Test 1: Correct password
        String result1 =
                DigitalPasswordLock.checkAccess("1234", 1);

        System.out.println("Test 1 - Correct Password");
        System.out.println("Expected: ACCESS GRANTED");
        System.out.println("Actual:   " + result1);
        System.out.println();

        // Test 2: Wrong password on first attempt
        String result2 =
                DigitalPasswordLock.checkAccess("1111", 1);

        System.out.println("Test 2 - Wrong Password");
        System.out.println("Expected: ACCESS DENIED");
        System.out.println("Actual:   " + result2);
        System.out.println();

        // Test 3: Wrong password on second attempt
        String result3 =
                DigitalPasswordLock.checkAccess("5678", 2);

        System.out.println("Test 3 - Wrong Password");
        System.out.println("Expected: ACCESS DENIED");
        System.out.println("Actual:   " + result3);
        System.out.println();

        // Test 4: Third incorrect attempt
        String result4 =
                DigitalPasswordLock.checkAccess("9999", 3);

        System.out.println("Test 4 - Three Wrong Attempts");
        System.out.println("Expected: SYSTEM LOCKED");
        System.out.println("Actual:   " + result4);
        System.out.println();

        System.out.println("================================");
        System.out.println("       TESTBENCH COMPLETED");
        System.out.println("================================");
    }
}
