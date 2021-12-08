/*
find mid characters
ex: input:manoj
    output: n

    input:klmjhfnk
    output:lmjhfn

    input : iam
    output: a
*/


import java.util.*;
public class Mid_characters {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the String:");
        String str=s.nextLine();
        int len=str.length();

        if(len<3)
        {
            System.out.println("The String is "+str+" too short");
        }
        if(len>=3)
        {
            for(int i=0;i<len;i++)
            {
                char ch = str.charAt(i);
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                {
                    continue;
                }
                else
                    {
                    System.out.println("The string should not have " + str);
                    return;
                     }
                         }
                    System.out.println("Middle characters:");
                    if(len%2==0)
                    {
                      for(int i=1;i<len-1;i++)
                      {
                        char ch1 = str.charAt(i);
                        System.out.print(ch1);
                        }
                    }
                    else if(len==3)
                    {
                        System.out.println(str.charAt(1));
                    }
            else if(len%2!=0)
            {
                System.out.print(str.charAt((len)/2));
            }
        }

    }
}
