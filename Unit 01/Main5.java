class StaticExample{
    void normal(){
        display();
        System.out.println("I am in normal method");
    }
    static void display(){
        show();
        System.out.println("I am in static display");
    }
    static void show(){
        System.out.println("I am in static show");
    }
}

public class Main5 {
    public static void main(String[] args) {
        StaticExample SE = new StaticExample();
        // SE.normal();
        StaticExample.display();
        StaticExample.show();
    }        
}
