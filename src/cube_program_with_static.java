import java.util.Scanner;
public class cube_program_with_static {
    static int cube(int x){
        return x*x*x;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println(cube_program_with_static.cube(a));

    }
}
