public class Practice4 {
    static {
        System.out.println("inside static block");
    }

    public static int num1 = 56;
}
class A1{
    public static void main(String[] args) {
        System.out.println(Practice4.num1);
    }
}
