//program to convert uppercase to lower case and vice versa of a given string or sentence//

import java.util.Scanner;
public class Convert_uppercasetolower_and_viceversa
{
    public static int fun(String str)
    {
        char c;
        for(int i=0;i<str.length();i++)
        {
            c=str.charAt(i);
            if(Character.isUpperCase(c))
                System.out.print((Character.toLowerCase(c)));
            else
                System.out.print(Character.toUpperCase(c));
        }
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        fun(str);
    }
}
