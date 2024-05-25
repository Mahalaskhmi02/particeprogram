public class AsteriskPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Loop to iterate over each row
        for (int i = 1; i <= n; i++) {
            // Printing spaces before the asterisks
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Printing asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Moving to the next line
            System.out.println();
        }
    }
}
