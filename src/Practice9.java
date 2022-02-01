import java.util.Scanner;
// Searching element in an array.
public class Practice9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[10];
        for (int i=0;i<a;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter Element To Search:");
        int n=s.nextInt();
        int m=0;
        for (int i=0;i<a;i++) {
            if (arr[i] == n) {
                m = i;
            }
        }

        if (m>0){
            System.out.println(m);
        }
        else
            System.out.println(-1);
    }
}
