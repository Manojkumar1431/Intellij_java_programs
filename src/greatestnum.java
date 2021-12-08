import java.util.Scanner;
public class greatestnum {
    public static void main(String[] args) {
        int n,a,b,c,i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a ,b & c numbers");
        a= s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a>b && a>c)
            System.out.println(a+" is greatest");
        else if(b>a && b>c)
            System.out.println(b+" is greatest");
        else
            System.out.println(c+" is greatest");


}}