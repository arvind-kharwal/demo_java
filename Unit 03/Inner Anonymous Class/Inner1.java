class Parent1{
    void display(){
        System.out.println("Display in Parent class");
    }
}
public class Inner1 {
    public static void main(String[] args) {
        Parent1 C1 = new Parent1(){
            void display(){
                System.out.println("Display method in inner anonymous class");
            }
        };
        C1.display();
    }
}
