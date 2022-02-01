import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        String name;

        Scanner s = new Scanner(System.in);
        name=s.nextLine();

        if (name.length()>0)
            System.out.println(name);
        else
            System.out.println("Unknown");
    }

}
