import java.util.Scanner;
public class Fibonacci_series
{
    static int fib(int n) {
        int Count = 2, a = 0, b = 1, c;
        while (Count < n) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
            Count++;
        }
        return 0;
    }
public static void main (String[]args)
        {
            int n;
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
           fib(n);
        }
}


