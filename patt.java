
public class patt {
    public static void main(String[] args) {
        int n=3;
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 0; k < (2 * n - 1) - 2 * i; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
    
}
