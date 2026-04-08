sealed class Parent permits Child1{
    void amount(){
        System.out.println("10 Lakhs"); 
    }
}
final class Child1 extends Parent{
    void bank(){
        System.out.println("1 Lakh");
    }
}
public class Main {
    public static void main(String[] args) {
        Child1 C1 =  new Child1();
        C1.bank();
        C1.amount();
    }
}
