import java.util.Scanner;

public class PassStrength {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        // Ask the user for a password
        System.out.println("Enter a password: ");
        String password = newScan.nextLine();

        // Check variables
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;
        boolean hasSymbol = false;

        // Iterate through the entered password
        for (int i = 0; i < password.length(); i++){
            char currentChar = password.charAt(i);
            // Checks if at least one of the password Chars are uppercase
            if (Character.isUpperCase(currentChar)){
                hasUpper = true;
            }
            // Checks if at least one of the password Chars are lowercase
            else if(Character.isLowerCase(currentChar)){
                hasLower = true;
            }
            // Checks if the password has at least one number
            else if (Character.isDigit(currentChar)){
                hasNumber = true;
            }
            // Automatically assumes the password Char is a symbol if non of the above are
            //  triggered
            else {
                hasSymbol = true;
            }
        }
        // Count that judges the password strength based off of how many true booleans
            //  1 and 2 mean weak password
            //  3 is moderately strong
            //  4 is strong
            //  5 is very strong
        int strength = 0;

        // If statements to help check with password strength

        if (hasUpper){
            strength++;
        }
        if (hasLower){
            strength++;
        }
        if (hasNumber){
            strength++;
        }
        if (hasSymbol){
            strength++;
        }
        if (password.length() > 8){
            strength++;
        } else {
            strength = 3;
        }

        switch(strength){
            case 1:
                System.out.print("Very weak password!");
                break;
            case 2:
                System.out.print("Weak password!");
                break;
            case 3:
                System.out.print("Moderately strong password!");
                break;
            case 4:
                System.out.print("Strong password!");
                break;
            case 5:
                System.out.print("Very strong password!");
                break;
            default:
                System.out.print("Error somewhere");
        }


        
    }
}
