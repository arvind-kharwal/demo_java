class Parent{
    void display(){
        privatemethod();
        System.out.println("I am in display() of Parent Class");
    }
    private void privatemethod(){
        System.out.println("I am in private method of parent class");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("I am in show() of Child class");
    }
}
public class Main {
    public static void main(String[] args) {
        Child C = new Child();
        C.show();
        C.display();
    }
    
}
