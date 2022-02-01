import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b=0;
        int arr[] = new int[a];
        for (int i=0;i<a;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter 1st element");

        int n1=6;
        int m1=0;
        for (int i=0;i<a;i++)
        {
            if (arr[i] == n1)
            {
                m1 = i;
            }
        }
        System.out.println("Enter 2nd element");
        int n2=7;
        int m2=0;
        for (int i=0;i<a;i++)
        {
            if (arr[i] == n2)
            {
                m2 = i;
            }
        }
        int sum=0;
        if (m2<m1) {
            for (int i = 0; i < a; i++)
                sum = sum + arr[i];
            System.out.println(sum);
                  }
        else
            System.out.println("dont no the code");

    }
}
