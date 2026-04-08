class Sample1<T>{
    private T a;
    private T b;
    Sample1(T a, T b){
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println(a+" "+b);
    }
}
public class Main3 {
    public static void main(String[] args) {
        Sample1<Integer> S1 = new Sample1<>(10, 20);
        S1.display();
        Sample1<String> S2 = new Sample1<>("Hello", "Java");
        S2.display();
    }
}
