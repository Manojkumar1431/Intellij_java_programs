public class counter_program_with_static {
    static int count=0;                                       //static variable
    counter_program_with_static()
    {
     count++;
     System.out.println(count);
    }
    public static void main(String[] args)
    {
        counter_program_with_static c1=new counter_program_with_static(),c2=new counter_program_with_static(),c3=new counter_program_with_static();

    }
}

