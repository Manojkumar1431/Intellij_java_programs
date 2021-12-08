import java.util.Scanner;
//use import java.lang.System package to use Integer.MIN_VALUE and Integer.MAX_VALUE
import java.lang.System;
public class sumoflargestandsmallest
{
    public static void main(String[] args)
    {
        int n, i, small;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(i=0;i<n;i++)
         arr[i] = s.nextInt();
         max=arr[0];
        for (i = 0; i < n; i++)
            {
                if (arr[i] >= max)
                {
                    max=arr[i];
                }
                System.out.println(max + "is largest");
            }
    }
}