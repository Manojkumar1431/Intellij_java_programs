public class mainmethod_outside_class {
    int id;
    String name;
}
class Teststudent{
    public static void main(String args[])
    {
        mainmethod_outside_class obj=new mainmethod_outside_class();
        System.out.println(obj.id);
        System.out.println(obj.name);
    }
}
