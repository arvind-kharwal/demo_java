interface Sample4{
    int sum(int a,int b);
}
public class Main4 {
    public static void main(String[] args) {
        Sample4 S = (int a,int b)-> {
            return a+b;
        };
        int res = S.sum(10,20);
        System.out.println(res);
    }
}
