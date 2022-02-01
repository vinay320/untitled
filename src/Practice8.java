import java.util.Scanner;
//Palindorme
public class Practice8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int temp;
        int n;
        int sum=0;
        temp=a;
        while(a>0)
        {
            n=a%10;
            a=a/10;
            sum=sum*10 +n;
        }

        if(sum==temp)
            System.out.print("Palindrome");
        else
            System.out.print("No");

    }
}