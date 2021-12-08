/*

input: size=6
      5
      55
      3
      59
      8
 output: 32 is even its a valid box
 explanation: the sum of last digits (5+5+3+9+8=32)is even thn valid igf odd then invalid.
*/

import java.util.Scanner;

public class Box_challenge_ACCenture {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("The box conatins");
        int num = s.nextInt();
        if (num < 0) {
            System.out.println(num + " is invalid num");
            return;
        } else {
            int arr[] = new int[num];
            int arr1[] = new int[num];
            int sum = 0, a;
            System.out.println("Enter the  numbers");
            for (int i = 0; i < num; i++) {
                arr[i] = s.nextInt();
                if (arr[i] < 0) {
                    System.out.println(arr[i] + " is invalid number");
                    return;
                } else {
                    a = arr[i] % 10;
                    sum = sum + a;

                }
            }
            if (sum % 2 == 0) {
                System.out.println(sum + "is even valid box");
            } else {
                System.out.println(sum + "invalid box");
            }
        }
    }
}
