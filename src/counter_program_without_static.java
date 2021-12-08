public class counter_program_without_static {
    int count=0;                   //without static
    counter_program_without_static()
    {
        count++;
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        counter_program_without_static c1=new counter_program_without_static();
        counter_program_without_static c2=new counter_program_without_static(),c3=new counter_program_without_static();
    }
}
