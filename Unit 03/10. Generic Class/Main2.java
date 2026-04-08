class Sample<T1,T2>{
    void display(T1 a,T2 b){
        System.out.println(a+" "+b);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Sample<Integer,String> S1 = new Sample<>();
        S1.display(10, "Java");
    }
}
