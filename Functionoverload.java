public class OverloadDemo {
    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }
    public int add(int a, int b, int c) { return a + b + c; }

    public static void main(String[] args) {
        OverloadDemo d = new OverloadDemo();
        System.out.println(d.add(2,3));         // calls add(int,int)
        System.out.println(d.add(2.5,3.5));     // calls add(double,double)
        System.out.println(d.add(1,2,3));       // calls add(int,int,int)
    }
}
