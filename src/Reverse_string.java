//program to reverse the string//

import java.util.Scanner;
public class Reverse_string
{
     static int fun(String str)
    {
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
        return 0;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        fun(str);
    }
}
