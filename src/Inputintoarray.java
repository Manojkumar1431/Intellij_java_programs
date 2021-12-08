import java.util.Scanner;
public class Inputintoarray {
    public static void main(String[] args)
    {
        int i,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();

        }
        for(i=0;i<n;i++)
            System.out.println(arr[i]);
    }

}
