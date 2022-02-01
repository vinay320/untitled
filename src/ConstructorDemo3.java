class Myclass{
    int rollno;               //instance variable
    //jvm provide default value to instance variable
    public void display()  // instance method
    {
        System.out.println(rollno);
    }
    //Myclass(){
        // used for constructor chaining
    //    super();   // used where there is a relationship
    //    this();     // used in overloading constuctor
    //}
}

public class ConstructorDemo3 {
    public static void main(String[] args) {
        Myclass obj=new Myclass();
        obj.display();
    }
}
