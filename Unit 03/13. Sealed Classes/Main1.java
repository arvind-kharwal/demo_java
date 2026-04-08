sealed class Parents permits A{
    void amount(){
        System.out.println("10 Lakhs"); 
    }
}
non-sealed class A extends Parents{
    void bank1(){
        System.out.println("1 Lakh");
    }
}
class B extends A{
    void bank2(){
        System.out.println("50K");
    }
}

public class Main1 {
    public static void main(String[] args) {
        B B1=  new B();
        B1.amount();
        B1.bank1();
        B1.bank2();
    }
}
