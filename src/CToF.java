import java.util.Scanner;
public class CToF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double c = 0;
        double f = 0;
        double CToF = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("Enter the temperature in C: ");

            if (in.hasNextDouble()) {
                c = in.nextDouble();
                f = c * 9 / 5 + 32;
                in.nextLine();
                System.out.println("Your temperature " + c + " celsius is equal to " + f + " Fahrenheit.");
                done = true;

            } else {
                trash = in.nextLine();
                System.out.println("You said your temperature was " + trash);
                System.out.println("You have to enter a valid number!");
            }

        }
        while (!done);

    }
}

