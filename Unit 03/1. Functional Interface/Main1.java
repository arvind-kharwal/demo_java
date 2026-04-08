interface Sample1{
    void display(String name);
}
public class Main1 implements Sample1 {
    public void display(String name){
        System.out.println("Thed name is "+name);
    }
    public static void main(String[] args) {
        Main1 M = new Main1();
        M.display("Java Programming");
    }
}
