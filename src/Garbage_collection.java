public class Garbage_collection {
    int a;
    int b;
    public void setData(int c,int d)
    {
        a = c;
        b = d;
    }
    public void Display()
    {
        System.out.println("value of a is "+a);
        System.out.println("Value of b is "+b);
    }
    public static void main(String[] args)
    {
        Garbage_collection s1 = new Garbage_collection();
        Garbage_collection s2 = new Garbage_collection();

        s1.setData(2,3);
        s2.setData(4,5);

        s1.Display();
        s2.Display();

        Garbage_collection s3;
        s3 = s2;
        s3.Display();

        s2 = null;

        s3.Display();

        s3 = null;

        s3.Display();

    }
}
