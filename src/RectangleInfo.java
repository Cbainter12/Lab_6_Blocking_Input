import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.println("Input your width: ");

            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " that is not a valid number. Please input a valid number ");
            }
        }
        while(!done);
        done = false;

        do
        {
            System.out.println("Input your height: ");

            if (in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " that is not a valid number. Please input a valid number ");
            }
        }
        while(!done);

        System.out.println("The perimeter of you rectangle is " + (height + height + width + width));
        System.out.println("Your area is " + (height * width));
        System.out.println("The diagonal of the rectangle is " + (Math.sqrt(height * height + width * width)));
    }
}
