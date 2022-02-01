import java.util.Scanner;

public class Result {
    public String name;
    public int phy;
    public int che;
    public int math;
    public int eng;
    public int comp;
    public double result;

    public void setvalue(){
        Scanner s =new Scanner(System.in);
        phy=s.nextInt();
        che=s.nextInt();
        math=s.nextInt();
        eng=s.nextInt();
        comp=s.nextInt();
    }

    public void display(){
        System.out.println("The result is:"+(phy+che+math+eng+comp)/5);
    }
}

class Percentage{
    public static void main(String[] args) {
        Result obj = new Result();
        obj.setvalue();
        obj.display();
    }
}