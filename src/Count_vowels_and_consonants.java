import java.util.Scanner;
public class Count_vowels_and_consonants
{
    static int fun(String str)
    {
        int vowel = 0, cons = 0,space=0,digit=0;
        for (int i = 0; i < str.length(); i++)
        {
            if ( str.charAt(i)== 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i)== 'o' ||str.charAt(i)=='u'|| str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
            {
                vowel++;
            }
            else if(Character.isWhitespace(str.charAt(i)))
            {
                space++;
            }
            else if(Character.isDigit(str.charAt(i)))
            {
                digit++;
            }
            else
                {
                cons++;
            }
        }
        System.out.println("vowels "+vowel);
        System.out.println("cons "+cons);
        System.out.println("spaces "+space);
        System.out.println("digits "+digit);
        return 0;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        fun(str);
    }
}
