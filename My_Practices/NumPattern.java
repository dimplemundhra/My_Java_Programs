package My_Practices;
public class NumPattern {
    public static void main(String[] args) {
        int rows = 4; // You can change this value to adjust the number of rows
        
        for (int i = 1; i <= rows; i++) {
            
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            
            // Print decreasing numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            
            // Print increasing numbers excluding the first one
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }
            
            System.out.println(); // Move to the next line after completing each row
        }
    }
}
