class StaticMethod{
    static int add(int x,int y){
        return(x+y);
    }
    static int mul(int x,int y){
        return(x*y);
    }
}

public class Main3 {
    public static void main(String[] args) {
        int res1= StaticMethod.add(10,20);
        System.out.println(res1);
        int res2= StaticMethod.mul(10,20);
        System.out.println(res2);
    }
}
