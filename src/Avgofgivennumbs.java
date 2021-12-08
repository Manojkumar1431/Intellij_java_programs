import java.util.Scanner;
public class Avgofgivennumbs
{
    public static void main(String[] args)
    {
        int i,n,sum=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i] = s.nextInt();
            sum=sum+a[i];
        }
        System.out.println("sum is "+ sum);
            System.out.println("avg is "+ sum/n);
    }
}

