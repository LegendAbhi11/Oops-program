public class TestException1 {
    public static void main(String args[]) {
        int a = 50, b = 0, c = 10, d = 5, e = 25, f = 15, g = 100;

        // Addition
        try {
            int add = a + b + c + d + e + f + g;
            System.out.println("Addition is: " + add);
        } catch (Exception ex) {
            System.out.println("Error in addition");
        }

        // Subtraction
        try {
            int sub = a - b - c - d - e - f - g;
            System.out.println("Subtraction is: " + sub);
        } catch (Exception ex) {
            System.out.println("Error in subtraction");
        }

        // Multiplication
        try {
            int mul = a * c * d;  // 
            System.out.println("Multiplication is: " + mul);
        } catch (Exception ex) {
            System.out.println("Error in multiplication");
        }

        // Division
        try {
            int div = a / b;   // 
            System.out.println("Division is: " + div);
        } catch (Exception ex) {
            System.out.println("Its an arithmetic error in division");
        }

        // Modulus
        try {
            int mod = e % b;   //
            System.out.println("Modulus is: " + mod);
        } catch (Exception ex) {
            System.out.println("Its an arithmetic error in modulus");
        }

        }
}
