interface Sample{
    void display(int a);
}
class Example{
    int a;
    Example(int a){
        this.a = a;
        System.out.println("The value of a: "+a);
    }
}
public class Method4 {
    public static void main(String[] args) {
        Sample S1 = Example::new;
        S1.display(10);

    }
}
