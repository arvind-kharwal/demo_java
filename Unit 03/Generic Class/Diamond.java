abstract class Test<T> {
    abstract T display(T a, T b);
}
public class Diamond {
    public static void main(String[] args) {
        Test<Integer> T1 = new Test<>() {
            Integer display(Integer a, Integer b){
                return a+b;
            }
        };
        Integer I1 = T1.display(10, 20);
        System.out.println(I1);
    }
}
