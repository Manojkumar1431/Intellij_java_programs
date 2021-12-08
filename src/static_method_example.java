public class static_method_example {
    int rollno;
    String name;
    static String college = "Gni";                    //static variable
    static void change() {                                           //static method
        college = "VNR";
    }

    static_method_example(int n, String r) {
        rollno = n;
        name = r;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
    class Test{
    public static void main(String[] args)
    {
        static_method_example.change();
        static_method_example s1=new static_method_example(111 ," manoj");
        static_method_example s2=new static_method_example(121 ," mintu");
        s1.display();
        s2.display();

    }
}
