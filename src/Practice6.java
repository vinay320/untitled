import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        int a;
        int b;
        int sum=0;
        Scanner s = new Scanner(System.in);
        a=s.nextInt();

        while(a>0)
        {
            b=a%10;
            a=a/10;
            sum=sum*10+b;
        }
        System.out.println(sum);
    }

}
