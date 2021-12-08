public class initialize_object_byconstructor {
    int id;
    String name;
    float salary;
    int insert(int i,String n,float s)
    {
        id=i;salary=s;name=n;
        return 0;
    }
    void display(){System.out.println(id+""+name+""+salary);}
}
class Student1{
    public static void main(String[] args)
    {
        initialize_object_byconstructor s1=new initialize_object_byconstructor(),s2=new initialize_object_byconstructor(),s3=new initialize_object_byconstructor();
        s1.insert(101," \tmanoj\t ",52938);
        s2.insert(102," \tmintu\t",76897);
        s3.insert(103," \tabhi \t",98090980);
        s1.display();
        s2.display();
        s3.display();
    }
}