import java.util.Stack;
public class stack_with_Stack_package
{
    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<Integer>();
        s.push(3);
        s.push(34);
        s.push(34);
        s.push(23);
        s.push(45);
        s.pop();
        s.peek();

        System.out.println(s);

        System.out.println("popped element is "+s.pop());

        System.out.println(s.peek());

        System.out.println(s.search(3));

        System.out.println(s.firstElement());

        System.out.println(s.empty());

        System.out.println(s.size());

        System.out.println(s.isEmpty());

        System.out.println(s.lastElement());

    }
}
