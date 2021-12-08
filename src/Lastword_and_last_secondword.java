//program to print  last word and last second word from a sentence//

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Lastword_and_last_secondword {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        s = br.readLine();
        String s1[] = s.split(" ");
        //if we need word means we need to mention "space" in the split("_") ,if we need characters means we need not to mention space in the split("").
        for (int i = 0; i < s1.length; i++) {
            System.out.println("Individual character is " + s1[i]);
        }
        System.out.println("last word is " + s1[s1.length - 1]);
        System.out.println("last second word is " + s1[s1.length - 2]);
        System.out.println("First word is " + s1[0]);

    }
}
