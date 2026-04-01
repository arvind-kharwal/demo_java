@FunctionalInterface
interface Interface3 {
    double display(double a,double b );
}
class Class1{
    static double add(double a,double b){
        return a+b;
    }
    static double sub(double a,double b){
        return a-b;
    }
    static double mul(double a,double b){
        return a*b;
    }
    static double div(double a,double b){
        return a/b;
    }
}
public class Method2 {
    public static void main(String[] args) {
        Interface3 I3 = Class1::mul;
        double res= I3.display(3.4, 3.5);
        System.out.println("The result is: "+res);
    }
}
