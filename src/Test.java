class Parent1{
    private int i;
    Parent1(){
        i=56;
    }
    public int getI(){
        return i;
    }
}
class Child1 extends Parent1{
        String name;
    Child1(){
        name= "vinay";
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(getI());

    }
}
public class Test {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.display();
    }
}
