import java.util.*;

public class Main {


        public static void main(String[] args) {

            // Ask the user for the desired length of the password
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the desired length of the password: ");
            int length = scanner.nextInt();

            // Define the characters that can be used in the password
            String availableChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*(){}[]=<>";

            // Create a random object
            Random random = new Random();

            // Generate the password
            StringBuilder password = new StringBuilder();
            for (int i = 0; i < length; i++) {
                int index = random.nextInt(availableChars.length());        // Generates number between 0 - length
                password.append(availableChars.charAt(index));              // Assign to password the character randomly obtained

            }

            // Print the password
            System.out.println("Your randomly generated password is: " + password.toString());
        }
    }
