interface Example3{
    void display();
}
public class Main8 {
    static int a = 10;
    void show(){
        Example3 E3 = ()->System.out.println(a);
        E3.display();
    }
    public static void main(String[] args) {
        Main8 M1 = new Main8();
        M1.show();
        System.out.println(Main8.a);
    }
}
