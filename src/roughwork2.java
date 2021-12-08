import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
public class roughwork2
{
    public static void main(String args[])
    {
        String test = "helloo";
        int count=0;
        char c[] = test.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int fstr = test.indexOf(c[i]);
            int lstr = test.lastIndexOf(c[i]);
            if(fstr==lstr)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
