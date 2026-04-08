class Example2<T>{
    void display(T a,T b){
        System.out.println(a+" "+b);
    }
}
public class Main1 {
    public static void main(String[] args) {
        Example2<Integer> E1 = new Example2<>();
        E1.display(10,20);
        Example2<String> E2 = new Example2<>();
        E2.display("Java", "CSE18");
    }
}
