//Reverse the words in a sentence

import java.util.Scanner;
public class reverse_words
{
    static int reverse(String s)
    {
        String s1[]=s.split(" ");
        for(int i=s1.length-1;i>=0;i--)
        {
            System.out.print(s1[i]+" ");
        }
        return 0;
    }
    public static void main(String args[])
    {
            String s;
            Scanner s1=new Scanner(System.in);
            s=s1.nextLine();
            reverse(s);
    }
}
