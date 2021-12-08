import java.util.Scanner;
public class Countnumbersdivisible_by_given_num {
    public static int fun(int n, int num, int arr[]) {
        int temp = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % num == 0) {
                sum++;
            }
        }
        System.out.println(sum);
        return 0;
    }
    public static void main(String args[]) {
        int n, num;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        num = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        fun(n, num, arr);
    }
}
