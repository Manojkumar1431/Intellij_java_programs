import java.util.Scanner;
public class closest_num_sum {
    public static int threeSumClosest(int[] nums, int target)
    {
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++)
                for (int k = j + 1; k < nums.length; k++)
                    while (sum == nums[i] + nums[j] + nums[k])
                    {
                        if (target <= sum)
                        {
                            System.out.println(sum);
                        }
                        else
                            System.out.println("invalid");
                    }
        return 0;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
threeSumClosest(arr,t);
    }
}
