import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        double number = sc.nextDouble();

        if (number <= 1)
        {
            System.out.println("The number " + number + " is not a prime number.");
        }
        else {
            boolean isPrime = true;
            int i = 2;

            while (i * i <= number)
            {
                if (number % i == 0)
                {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime)
            {
                System.out.println("The number " + number + " is a prime number.");
            }
            else
            {
                System.out.println("The number " + number + " is not a prime number.");
            }
        }
        sc.close();
    }
}