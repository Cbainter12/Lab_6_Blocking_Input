import java.util.Scanner;
public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double  gallonsInTank = 0;
        double fuelEfficiency = 0;
        double gallonPrice= 0;
        double costPer100 = 0;
        double totalDistance = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("Input how many gallons your gas tank holds: ");

            if (in.hasNextDouble())
            {
                gallonsInTank = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". That not a valid value please try again.");
            }
        }
        while (!done);
        done = false;

        do {
            System.out.println("Input your cars fuel efficiency: ");

            if (in.hasNextDouble())
            {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". That not a valid value please try again.");
            }
        }
        while(!done);
        done = false;

        do {
            System.out.println("Input the cost of gas per gallon: ");

            if (in.hasNextDouble())
            {
                gallonPrice = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". That not a valid value please try again.");
            }
        }
        while(!done);

        costPer100 = (100 / fuelEfficiency) * gallonPrice;
        System.out.println("It will cost $" + costPer100 + "per 100 miles." );

        totalDistance = gallonsInTank * fuelEfficiency;
        System.out.println("With a full tank you could travel " + totalDistance + "miles.");
    }
}
