import java.util.*;

public class TCS
{
    static int fun(int size,int arr[])
    {
        for(int i=0;i<size;i++)
        for(int j=0;j<size-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        int len=arr.length;
        System.out.print(arr[len-1]+" "+arr[len-2]+" "+arr[len-3]);
        return 0;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        fun(size,arr);
    }
}
