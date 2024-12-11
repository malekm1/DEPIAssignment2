import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num);

        int counter = 0;

        if (num == 0)
        {
            counter = 1;
        }

        while (num > 0)
        {
            num = num / 10;
            counter++;
        }


        System.out.println("The number of digits is: " +counter);
        sc.close();
    }
}