import java.util.Scanner;
public class missingnumber_in_array {
    public static void main(String args[]) {
        int arr[] = {5,4,3,1};
        int n = arr.length;
        Scanner s = new Scanner(System.in);
        int total = (n + 1) * (n + 2) / 2;
        for (int i = 0;i<n;i++)
        {
            total=total-arr[i];
        }
        System.out.println(total);
    }
}
