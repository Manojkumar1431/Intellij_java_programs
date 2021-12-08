import java.util.Scanner;

public class largest_digit_innum {
    static long fun(long num)
    {
        long large=0;
        while(num!=0)
        {
            long a=num%10;
            if(large<a)
                large=a;
            num=num/10;
        }
        return large;
    }
    public static void main(String args[])
    {
        Scanner s= new Scanner (System.in);
        long num=s.nextLong();

        System.out.println(fun(num));

    }


}
