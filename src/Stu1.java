//constructer
public class Stu1{
    int roll;
    int marks;
    String name;
    String cname;
    String coursname;
}
class Test45
{
    int num=23;
    Stu1 obj;
    Test45(){
        num =90;
        obj = new Stu1();
        obj.roll=100;
    }
}
class Test45Main{
    public static void main(String[] args) {
        Test45 abcd =new Test45();
        System.out.println(abcd.num);
        System.out.println(abcd.obj.roll);
        
    }
}