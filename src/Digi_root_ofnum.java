import java.util.*;

public class Digi_root_ofnum
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int sum=0;
        while(num!=0)
        {
            int a=num%10;
            sum=sum+a;
            num=num/10;
        }
        System.out.println(sum);
        if(sum<=9)
        {
            System.out.println(sum);
        }
        else
        {
            int count=0;
            while(sum!=0)
            {
                int b=sum%10;
                count=count+b;
                sum=sum/10;
            }
            if(count<=9)
            {
                System.out.println(count);
            }
        }
    }
}
