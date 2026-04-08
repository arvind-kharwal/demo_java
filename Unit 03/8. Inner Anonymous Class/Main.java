class OuterClass{
    void display(){
        System.out.println("Display method in outer class");
    }
    class InnerClass{
        void show(){
            System.out.println("Show in inner class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass OC = new OuterClass();
        OC.display();
        OuterClass.InnerClass IC = OC.new InnerClass();
        IC.show();
    }
}
