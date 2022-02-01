import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        double bill;
        double total;
        double tax=0;
        Scanner s = new Scanner(System.in);
        bill=s.nextInt();
        total=bill;
        if (bill>1000 && bill<2000)
        {
            tax=(bill*5)/100;
            total=bill+tax;

        }
        if (bill>=2000 && bill<3000)
        {
            tax=(bill*10)/100;
            total=bill+tax;
        }
        if (bill>=3000)
        {
            tax=(bill*27)/100;
            total=bill+tax;
        }
        System.out.println("Tax is "+tax);
        System.out.println("Total Bill is "+total);
    }
}
