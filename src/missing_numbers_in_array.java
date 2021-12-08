import java.util.Scanner;
public class missing_numbers_in_array
{
    static int sum(int arr[],int n)
    {
        int sum1=0;
        for(int i=0;i<n;i++)
        {
            sum1+=arr[i];
        }
        return sum1;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,5,7};
        int n=arr.length;
        int sum=(n*(n+1))/2-sum(arr,n);
        int avg=sum/2;
        int sumofnumsbelowavg=0;
        int sumofnumsaboveavg=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=avg)
                sumofnumsbelowavg+=arr[i];
            else
                sumofnumsaboveavg+=arr[i];
        }
        int sumavg=(avg*(avg+1))/2;
        int firstmissnum=sumavg-sumofnumsbelowavg;
        int secondmissnum=(n*(n+1))/2-sumavg-sumofnumsaboveavg;
        System.out.println(firstmissnum);
        System.out.println(secondmissnum);
    }
}
