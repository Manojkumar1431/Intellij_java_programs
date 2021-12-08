import java.util.Scanner;
public class factorial {
    public static void main(String[] args)
    {
        int f=1,i,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
            {
                f=f*i;
            }
        System.out.println(f);
    }
}
