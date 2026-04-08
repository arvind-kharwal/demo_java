@FunctionalInterface
interface Interface2{
    void show();
}
class A1{
    static void display(){
        System.out.println("Display in class A");
    }
}
public class Method1 {
    public static void main(String[] args) {
        Interface2 I2 = A1::display;
        I2.show();
    }
}
