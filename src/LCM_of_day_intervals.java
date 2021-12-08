/*
input= 4
       6
       lcm 0f 4,6=12
       ouput=12
 */


import java.util.Scanner;

public class LCM_of_day_intervals
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the day interval of Sam:");
        int num1 = s.nextInt();
        System.out.println("Enter the day interval of ria:");
        int num2 = s.nextInt();

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Given Interval is not valid");
            return;
        }
        int lcm;
        lcm = (num1 > num2) ? num1 : num2;
        while (true)
        {
            if (lcm % num1 == 0 && lcm % num2 == 0)
            {
                System.out.println("they will have dinner together at day " + lcm);
                break;
            }
            ++lcm;
        }
    }
}
