import java.util.Scanner;
public class sum_of_first_and_last_digit
{
    public static void main(String args[]) {
        int n,n1,sum1;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for (int i = 0; i < n; i++)
        {
            n1=s.nextInt();
            int last=n1%10;
            int first=n1;
            while(n1>=10)
            {
                n1=n1/10;
            }
            first=n1;
            System.out.println(first+last);
        }
    }
}
