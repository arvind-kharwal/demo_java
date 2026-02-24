interface Example{
    int n =10;
    void display();
}
class Sample implements Example{
    public void display(){
        System.out.println("Hello World");
    }
}

public class Main {
    public static void main(String[] args) {
        Sample S = new Sample();
        S.display();
        // 
        System.out.println(Sample.n);
        System.out.println(Example.n);
    }
}
