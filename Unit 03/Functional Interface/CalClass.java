interface Calc{
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
public class CalClass {
    public static void main(String[] args) {
        Calc C1 = (double n)->n*n;
        double r1 = C1.square(2.5);
        System.out.println("The square is: "+r1);
        double r2 = Calc.mul(10,2);
        System.out.println("The Multiplication: "+r2);
        double r3 = C1.sum(10,20);
        System.out.println("The sum is: "+r3);
        double r4 = C1.sub(10,20);
        System.out.println("The subtraction: "+r4);
        double r5 = Calc.div(100,2);
        System.out.println("The Division: "+r5);

    }
}
