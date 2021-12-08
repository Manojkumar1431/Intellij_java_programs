import java.util.Scanner;
public class sumofsmallestandlargest
{
        static int fun(int n, int arr[])
        {
        int i, small, large,result;
        for (i = 0; i < n; i++)
        {
            small = arr[0];
            large = arr[0];
            for (i = 0; i < n; i++)
            {
                if (arr[i] < small)
                    small = arr[i];
                if (arr[i] > large)
                    large = arr[i];
            }
            System.out.println(large - small);
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int size,i,result;
        Scanner s=new Scanner(System.in);
        size=s.nextInt();
        int arr1[]=new int[size];
        for(i=0;i<size;i++)
        {
         arr1[i]=s.nextInt();
        }
        fun(size,arr1);
    }
}
