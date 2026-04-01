class Parent{
    void display(){
        System.out.println("Display in Parent class");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("Display in Child class");
    }
}
public class Inner {
    public static void main(String[] args) {
        Parent C1 = new Child();
        C1.display();
    }
}
