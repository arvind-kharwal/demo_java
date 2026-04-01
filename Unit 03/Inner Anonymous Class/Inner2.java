abstract class Example{
    abstract void display();
}
public interface Inner2 {
    public static void main(String[] args) {
        Example E1 = new Example() {
            void display(){
                System.out.println("Display");
            }
        };
        E1.display();
    }
}
