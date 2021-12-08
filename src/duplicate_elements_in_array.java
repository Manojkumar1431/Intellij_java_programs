import java.util.Scanner;

public class duplicate_elements_in_array
{
    public static void main(String args[])
    {
        int arr[];
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]==arr[j])
                System.out.println(arr[i]);
        }
    }
}
