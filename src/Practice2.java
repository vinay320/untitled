public class Practice2 {
    public String name;
    public double per;

    Practice2(String a,double b) //parameterized constructor
    {
        name=a;
        per=b;
    }
    public void display()
    {
        System.out.println(name+"   "+per);
    }
}
class Topper{
    public static void main(String[] args) {
        Practice2 obj1 = new Practice2("Prince",90.5);
        Practice2 obj2 = new Practice2("Vinay",87.6);
        Practice2 obj3 = new Practice2("Aksh",95.65);
        if (obj1.per>obj2.per && obj1.per>obj3.per){
            obj1.display();
        }
        if (obj2.per>obj1.per && obj2.per>obj3.per){
            obj2.display();
        }
        if (obj3.per>obj1.per && obj3.per>obj2.per){
            obj3.display();
        }
    }
}
