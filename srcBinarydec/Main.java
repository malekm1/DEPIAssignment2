import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();

        boolean isValid = binary.matches("[01]+");
        if (!isValid)
        {
            System.out.println("Not a valid binary number");
            return;
        }
        int decimal = 0;
        int base = 1;
        int index = binary.length()-1;

        while (index >= 0)
        {
            int digit = binary.charAt(index) - '0';
            decimal += digit*base;
            base = base * 2;
            index--;
        }

        System.out.println("The decimal number is: " +decimal);
        sc.close();
    }
}