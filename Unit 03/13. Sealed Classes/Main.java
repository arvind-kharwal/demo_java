sealed class Parent permits Child1,Child2{
    void amount(){
        System.out.println("10 Lakhs"); 
    }
}
final class Child1 extends Parent{
    void bank(){
        System.out.println("1 Lakh");
    }
}
final class Child2 extends Parent{
    void bank1(){
        System.out.println("50K");
    }
}


public class Main {
    public static void main(String[] args) {
        Child1 C1 =  new Child1();
        System.out.println("============");
        C1.bank();
        C1.amount();
        System.out.println("==============");
        Child2 C2 = new Child2();
        C2.amount();
        C2.bank1();
    }
}
