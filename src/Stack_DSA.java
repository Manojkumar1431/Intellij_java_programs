import java.util.Scanner;
public class Stack_DSA
{
    final static int size=5;
    public static int push(int data)
    {
        int top=-1;
        int stack[]=new int[size];
        while(top!=0)
            top=top+1;
            stack[top]=data;
            System.out.println(data);
        return 0;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        push(3);
push(65);
    }
}
