import java.util.Scanner;
public class Secondgreatestnum {
    public static void main(String[] args)
    {
      int a,b,c;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      c=s.nextInt();
      if((a>b &&a>c) && (b>a&&b>c))
          System.out.println("");
    }
}
