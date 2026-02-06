class Student{
    int r=10;
    static String name = "Arvind";
    void display(){
        System.out.println(r);
        System.out.println(name);
    }
    static void show(){
        // System.out.println(r);
        System.out.println(name);
    }
}
public class Main4 {
    public static void main(String[] args) {
        Student S = new Student();
        S.display();
        Student.show();
        S.show();
    }
    
}
