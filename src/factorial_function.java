import java.util.Scanner;
public class factorial_function
{
    static int fun(int n)
    {
        int i;
        int fact=1;
        for(i=1;i<=n;i++)
            fact = fact * i;
        return fact;
    }
    public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int result=fun(n);
        System.out.println(result);
    }
}
