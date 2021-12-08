import java.io.*;
import java.util.Scanner;
class Two_sum {
    public static int twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            for (int j = (i + 1); j < nums.length; j++)
            {
                if(target==nums[i]+nums[j])
                    System.out.println("["+i+","+j+"]");
            }
        return 0;
        }
    public static void main(String args[])
    {
        int t,n;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        twoSum(arr,t);
}
}
