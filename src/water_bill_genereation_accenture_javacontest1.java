import java.util.Scanner;

public class water_bill_genereation_accenture_javacontest1 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the consumer number");
        int num=s.nextInt();

        System.out.println("Enter the consumption");
        int consump=s.nextInt();
        if(consump<0 || consump>50000)
        {
            System.out.println("Invalid");
            return;
        }
        else
        {
            double total=0;
            if((consump >= 0) && (consump <= 10000))
            {
                total=consump*0+200;
            }
            else if((consump >= 10001) && (consump <= 20000))
            {
                consump=consump-10000;
                total=consump*0.01+200;
            }
            else if((consump >= 20001) && (consump <= 30000))
            {
                consump=consump-10000;
                total=consump*0.10+250;
            }
            else if((consump >= 30001) && (consump <= 50000))
            {
                consump=consump-10000;
                total=consump*0.25+300;
            }
            System.out.format("Total charges Rs.%.2f",total);
        }
    }
}
