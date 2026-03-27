interface Calc1{
    double square(double n);
    default double sum(int a,int b){
        return a+b;
    }
    default double sub(int a,int b){
        return a-b;
    }
    static double mul(int a,int b){
        return a*b;
    }
    static double div(int a,int b){
        return a/b;
    }
}

public class CalClass1 implements Calc1{
    public double square(double n){
        return n*n;
    }
    public static void main(String[] args) {
        CalClass1 C1 = new CalClass1();
        double r1 = C1.sub(2,5);
        System.out.println(r1);
        double r2 =  Calc1.mul(2,3);
        System.out.println(r2);
        double r3 = C1.square(3.8);
        System.out.println(r3);

    }
}