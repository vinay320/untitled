import java.util.Scanner;

public class ConstructerDemo {
    int num1;  //instance variable
    int num2;

  //  public void setvalue()
   // {
     //   num1=23;
       // num2=36;
   // }
    //to initilize the object who use the constructor
    ConstructerDemo(){
        Scanner s = new Scanner(System.in);
        num1=s.nextInt();
        num2=s.nextInt();

    }
    ConstructerDemo(int a ,int b)
    {
        num1=a;
        num2=b;
    }
    public void show()
    {
        System.out.println(num1);
        System.out.println(num2);
    }
}

class ConstructerDemoMain{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ConstructerDemo obj = new ConstructerDemo();
        obj.show();
        ConstructerDemo obj1 = new ConstructerDemo(12,46);
        obj1.show();
        s.close();
    }
}