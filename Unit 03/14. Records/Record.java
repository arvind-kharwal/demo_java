record Student(int roll,String name){
    Student(){
        this(10, "ABC");
    }
}

public class Record {
    public static void main(String[] args) {
        Student S1 = new Student(1, "Amit");
        System.out.println(S1);
        Student S2 = new Student();
        System.out.println(S2);

        // System.out.println(S1.roll());
        // System.out.println(S1.name());
    }
}
