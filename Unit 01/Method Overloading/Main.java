class Overload{
    int add(int a,int b){
        return(a+b);
    }
    int add(int a,int b,int c){
        return(a+b+c);
    }
    double add(int a,double b){
        return(a+b);
    }
}
public class Main {
    public static void main(String[] args) {
        Overload O1 = new Overload();
        int r= O1.add(10,20);
        System.out.println(r);
    }
}
