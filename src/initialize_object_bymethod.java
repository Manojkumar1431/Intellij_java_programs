public class initialize_object_bymethod {
    int id;
    String name;
    void insert(int r,String n){
        id=r;
        name=n;
    }
    void display(){
        System.out.println(id+""+name);
    }
}
class Student{
    public static void main(String args[])
    {
        initialize_object_bymethod s1=new initialize_object_bymethod(),s2=new initialize_object_bymethod();
        s1.insert(23456, " manoj");
        s2.insert(67, " mintu");
        s1.display();
        s2.display();

        s1.insert(538,"abhi");
        s1.display();
        s1.insert(531,"hrishikesh sharma");
        s1.display();
    }
}
