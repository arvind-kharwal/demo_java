class Overload{
    // int add(int a,int b){
    //     return(a+b);
    // }
    int add(int a,int b,int c){
        return(a+b+c);
    }
    void add(int a,long b){
        System.out.println(a);
        System.out.println(b);
    }
}
public class Main {
    public static void main(String[] args) {
        Overload O1 = new Overload();
        O1.add(10,20 );
        // System.out.println(r);
    }
}
