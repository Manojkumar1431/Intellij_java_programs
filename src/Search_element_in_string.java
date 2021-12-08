// program to print the desired character from a string or search a char in a string.//


import java.util.Scanner;
public class Search_element_in_string
{
    static int fun(String str,char ele)
    {
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            if(ele==str.charAt(i))
                System.out.println(i);
        }
        return 0;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char s1=s.next().charAt(0);
        fun(str,s1);
    }
}
