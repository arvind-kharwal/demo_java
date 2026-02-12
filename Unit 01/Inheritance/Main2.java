class A{
    void methodA(){
        System.out.println("I am in Grand Parent Class");
    }
}
class B extends A{
    void methodB(){
        System.out.println("I am in Parent class");
    }
}
class C extends B{
    void methodC(){
        System.out.println("I am in child class");
    }
}

public class Main2 {
    public static void main(String[] args) {
        C C1 = new C();
        C1.methodC();
        C1.methodB();
        C1.methodA();
    }
    
}
