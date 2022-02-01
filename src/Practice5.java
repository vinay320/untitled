import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        int n;
        int sum=0;
        int a=0;
        int b=0;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        b=n;
        while(n>0){
            a=n%10;
            n=n/10;
            sum=sum+a*a*a;
        }
        if (sum==b)
        {
            System.out.println(sum +" Armstrong no");
        }
        else
            System.out.println("Not Armstrong");
    }

}
