import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int e;
        double result;

        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();
        e=s.nextInt();

        result=(a+b+c+d+e)/5;

    System.out.println("Result:"+result+"%");

    }
}
