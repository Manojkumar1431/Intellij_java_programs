import java.util.Scanner;

public class Battery_capacity_ACC
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the battery capacity");
        double bat=s.nextDouble();
        if(bat<1000&&bat>10000)
        {
            System.out.println("invalid");
            return;
        }
        System.out.println("enter the charging value:");
        double value=s.nextDouble();
        if(value<300&&value>2100)
        {
            System.out.println("invalid");
            return;
        }
        double t;
        t=(bat/value)*1.2;
        System.out.printf("%.2f Hours",t);
    }
}
