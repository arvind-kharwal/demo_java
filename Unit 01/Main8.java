class Student{
    int r;
    String name;
    Student(){
        r = 0;
        name = null;
    }
    Student(int r,String name){
        this.r = r;
        this.name = name;
    }
    void display(){
        System.out.println(r);
        System.out.println(name);
    }
}

public class Main8 {
    public static void main(String[] args) {
        Student S = new Student();
        S.display();
        Student S1 = new Student(2,"Arvind");
        S1.display();

    }
}
