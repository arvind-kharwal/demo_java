class ClassA{
    void display(){
        System.out.println("Class A");
    }
}
class ClassB{
    void display(){
        System.out.println("Class B");
    }
}
class ClassC extends ClassA,ClassB{
    void show(){
        System.out.println("Class C");
    }
}
public class Multiple {
    public static void main(String[] args) {
        ClassC C1 = new ClassC();
        C1.show();
        C1.display();
    }
}
