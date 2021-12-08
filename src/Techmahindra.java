import java.util.Scanner;
public class Techmahindra {
    static int Tax(int input1,int[] input2)
    {
        int sum,sum1,tax1=0;
        for(int i=0;i<input1;i++)
        {
           sum=input2[i]-1000;
           sum1=sum*10/100;
           tax1=tax1+sum1;
        }
        return tax1;
    }
    public static void main(String[] args)
    {
        int n,i;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int result=Tax(n,arr);
        System.out.println((result));

    }
}
