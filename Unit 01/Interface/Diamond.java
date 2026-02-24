interface AA{
    default void display(){
        System.out.println("Display in Interface AA");
    }
}
interface BB extends AA{
    default void display(){
        System.out.println("Display in Interface BB");
    }
}
interface CC extends AA{
    default void display(){
        System.out.println("Display in Interface CC");
    }
}
class Program2 implements BB,CC{
    public void display(){
        CC.super.display();
        BB.super.display();
        System.out.println("Display in Class Program2");
    }
}

public class Diamond {
    public static void main(String[] args) {
        Program2 P2 = new Program2();
        P2.display();
    }
}
