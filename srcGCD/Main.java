import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        while (num1 != num2)
        {
            if (num1 > num2)
            {
                num1 = num1 - num2;
            }
            else
            {
                num2 = num2 - num1;
            }
        }
        System.out.println("The GCD of the 2 numbers is: " + num2);
        sc.close();
    }
}