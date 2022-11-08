//WA java program to find out wheather the entered number is positive or negative .
import java.util.Scanner;
public class Positive {
    public static void main(String args[])
    {
      System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
        if(num>=0)
        {
            System.out.println("The number is positive.");
        }
        else if(num<0)
        {
            System.out.println("The number is negative.");
        }
    }
}
