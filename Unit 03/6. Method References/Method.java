@FunctionalInterface
interface Interface1{
    void show();
}
class A{
    void display(){
        System.out.println("Display in class A");
    }
}
public class Method {
    public static void main(String[] args) {
        A A1 = new A();
        Interface1 I1 = A1::display;
        I1.show();
    }
}
