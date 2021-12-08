/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.
Notice that the solution set must not contain duplicate triplets.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
 */

import java.io.*;
import java.util.Scanner;
public class three_sum {
        public static int threeSum(int[] nums) {
            for(int i=0;i<nums.length;i++)
                for(int j=(i+1);j<nums.length;j++)
                    for(int k=(j+1);k<nums.length;k++)
                    {
                        if(nums[i]+nums[j]+nums[k]==0)
                            System.out.println("["+i+","+j+","+k+"]");
                    }
            return 0;

        }
        public static void main(String args[])
        {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=s.nextInt();
            }
            threeSum(arr);
        }
    }

