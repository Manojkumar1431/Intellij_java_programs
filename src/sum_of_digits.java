import java.util.Scanner;
public class sum_of_digits
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int n, num;
        n = s.nextInt();
        for (int i = 1; i <= n; i++)
        {
            num = s.nextInt();
            int sum = 0;
            while (num != 0)
            {
                int a = num % 10;
                sum = sum+ a;
                num = num / 10;
            }
            System.out.println(sum);
        }
    }
}
