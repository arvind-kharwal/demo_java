package pack1;
class Sample1 {
    public static int r = 2;
    public static String name  = "Arvind";
    public static void display(){
        System.out.println("Display in Sample1 class");
        System.out.println(r+" "+name);
    }
}
public class Test1 extends Sample1{
    public static void main(String[] args) {
        Sample1.display();
    }
}
