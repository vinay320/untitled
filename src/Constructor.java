public class Constructor {
    int roll;
    String name;

    Constructor(int a, String b){
        roll= a;
        name=b;
    }
    public void display(){
        System.out.println(roll+"   "+name);
    }
}

class Student1{
    public static void main(String[] args) {
        Constructor obj = new Constructor(45,"Vinay");
        obj.display();
    }
}

