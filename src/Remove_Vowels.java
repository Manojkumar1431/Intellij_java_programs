//program to remove the vowels from the input string.//

import java.util.Scanner;
public class Remove_Vowels
{
    public static int fun(String str)
    {
        String str1;
        str1=str.replaceAll("[aeiouAEIOU]","");
        System.out.println(str1);
        return 0;
    }
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
fun(str);
}
}
