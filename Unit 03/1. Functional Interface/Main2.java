interface Sample2{
    void display();
}
public class Main2 {
    public static void main(String[] args) {
        Sample2 S = ()-> System.out.println("I am in display");
        S.display();
    }
}
