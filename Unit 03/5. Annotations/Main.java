class Parent{
    void displaymethodinchildclass()
    {
        System.out.println("Display in Parent class");
    }
}
class Child extends Parent{
    @Override
    void displaymethodinchildclass(){
        System.out.println("Display in Child class");
    }
}
public class Main {
    public static void main(String[] args) {
        Child C1 = new Child();
        C1.displaymethodinchildclass();;    }
}
