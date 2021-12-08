/*
example : 18=(1+8)=9 then 18/9==0 then it is Arshad Number.
           123=(1+2+3)=6 then 123/6==0 not Arshad number.
           14=(1+4)=5 then 14/5 not Arshad number.
*/

import java.util.*;

public class Arshad_number
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Entre the size");
        int size=s.nextInt();

        int num[]=new int[size];
        System.out.println("Enter the numbers");
        for(int i=0;i<size;i++)
        {
            num[i]=s.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            int c=num[i];
            int sum=0,a;
            while(num[i]!=0)
            {
                a=num[i]%10;
                sum=sum+a;
                num[i]=num[i]/10;
            }
            if(c%sum==0)
            {
                System.out.print(c+" ");
            }

        }
    }
}
