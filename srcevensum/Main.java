import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        double number = sc.nextDouble();

        if (number < 1)
        {
            System.out.println("Invalid number!! Please enter a positive number!");
        }
        else
        {
            int sum = 0;
            int i = 2;

            while (i <= number)
            {
                sum += i;
                i += 2;
            }
            System.out.println("The sum of all even numbers is: " +sum);
        }
        sc.close();
    }
}