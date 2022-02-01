public class Box {
        double h;
        double l;
        double w;
    Box(double a,double b, double c)
    {
        h=a;
        l=b;
        w=c;
    }
    void display()
    {
        System.out.println(l*h*w);
    }
}

class Volume{
    public static void main(String[] args) {
        Box ob =new Box(12,2,1);
        ob.display();
    }
}
