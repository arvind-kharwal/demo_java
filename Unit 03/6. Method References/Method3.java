@FunctionalInterface
interface Interface0{
    void display();
}
class Class2{
    Class2(){
        System.out.println("Default Constructor");
    }
}
public class Method3 {
    public static void main(String[] args) {
        Interface0 I0 = Class2::new;
        I0.display();
    }
}   
