interface Sample{
    void display();
}
public class Main implements Sample {
    public void display(){
        System.out.println("I am in display in Class Main");
    }
    public static void main(String[] args) {
        Main M = new Main();
        M.display();
    }
}
