class Example{
    static int a = 10;
    static String name ="Arvind";
    int b;
    Example(int b){
        this.b = b;
    }
    static void display(){
        System.out.println(b);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(Example.a);
        System.out.println(Example.name);
        Example E1 = new Example(20);
        // E1.display();
    }
}
