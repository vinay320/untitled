import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int arr[] = new int[a];
        for (int i=0;i<a;i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("Values in ascii:");
        for(int i=0;i<a;i++)
        {
            System.out.print((char)arr[i]+" ");
        }
    }

}
