public class Demo {
    static {
        System.out.println("inside the static block");
    }
    int num1;
    Demo()
    {
        num1=500;
    }
}
class A{
    public static void main(String[] args) {
        Demo obj1 =new Demo();
        System.out.println(obj1.num1);
    }
}
