import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {

        double sum=0;
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=s.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Average");
        System.out.println(sum/n);
    }
}
