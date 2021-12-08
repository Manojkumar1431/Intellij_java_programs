import java.util.Scanner;
public class Averageofnumbers
{
    public static void main(String[] args)
    {
        int i,n,avg=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
             avg=avg+i;
        }
        System.out.println(avg/n);
    }
}
