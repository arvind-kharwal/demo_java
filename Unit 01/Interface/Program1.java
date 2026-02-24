interface I1{
    int r = 2;
    String name = "Arvind";
}
interface I2 extends I1{
    void display();
}

public class Program1 implements I2 {
    public void display(){
        System.out.println("Roll NO:"+r);
        System.out.println("Name: "+name);
    }
    public static void main(String[] args) {
        Program1 P = new Program1();
        P.display();
        System.out.println(Program1.r);
    }
}
