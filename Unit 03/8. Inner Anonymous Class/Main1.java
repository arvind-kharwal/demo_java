class OuterClass1{
    void display(){
        System.out.println("Display method in outer class");
    }
    static class InnerClass1{
        void show(){
            System.out.println("Show in inner class");
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        OuterClass1 OC = new OuterClass1();
        OC.display();
        OuterClass1.InnerClass1 IC = new OuterClass1.InnerClass1();
        IC.show();
    }
}
