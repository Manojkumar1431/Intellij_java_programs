import java.util.Scanner;

public class Bubble_sort
{
    public static void main(String args[])
    {
        int n,arr[];
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr.length-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}
