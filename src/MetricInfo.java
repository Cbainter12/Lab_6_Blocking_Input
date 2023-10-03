import java.util.Scanner;
public class MetricInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double meters = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println("Input the distance in meters: ");

            if (in.hasNextDouble())
            {
                meters = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You put " + trash + ". Please input a valid number.");
            }
        }
        while(!done);

        System.out.println("Your input " + meters + " meters is equal to:");
        System.out.println((meters * 0.000621371) + " miles");
        System.out.println((meters * 3.28084) + " feet");
        System.out.println((meters * 39.3701) + " inches");
    }
}
