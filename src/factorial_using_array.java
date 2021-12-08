import java.util.Scanner;
public class factorial_using_array
{
    public static void main(String args[])
    {
        int arr[],size;
        Scanner s=new Scanner(System.in);
        size=s.nextInt();
        arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
            int f=1;
            for(int j=1;j<=arr[i];j++)
            {
                f=f*j;
            }
            System.out.println(f);
        }
    }
}
