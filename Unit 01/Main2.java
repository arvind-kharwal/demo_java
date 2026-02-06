class Student{
    int r;
    String name;
    static String college = "ABES";
    static int count  = 0;
    void getdata(int r,String name){
        this.r = r;
        this.name = name;
        count++;
    }
    void display(){
        System.out.println(r);
        System.out.println(name);
        System.out.println(college);
        System.out.println(count);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Student S = new Student();
        S.getdata(1, "Arvind");
        System.out.println(Student.count);
        S.display();
        System.out.println(Student.college);
        System.out.println("Object 2");
        Student S1 = new Student();
        S1.getdata(10,"Amit");
        System.out.println(Student.count);
        S1.display();

}
}