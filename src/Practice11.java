import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b=0;
        int arr[] = new int[a];
        for (int i=0;i<a;i++)
        {
            arr[i]=s.nextInt();
        }
        b=arr.length;
        for (int i=0;i<a;i++)
        {
            if (arr[i]==1 || arr[i]==4)
                b=b+0;
            else
                b=b-1;
        }
        if(arr.length==b)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
