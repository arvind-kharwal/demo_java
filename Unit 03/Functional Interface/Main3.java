interface Sample3{
    void display(String name);
}
public class Main3 {
    public static void main(String[] args) {
        Sample3 S = (String name)->System.out.println("The name is: "+name);
        S.display("Arvind");
    }
}
