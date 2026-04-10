class Person{
    private int age;
    private String name;
    Person(int age, String name){
        this.age = age;
        this.name  =name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }
    
    
}
public class Main {
    public static void main(String[] args) {
        Person P1 = new Person(40, "Arvind");
        // System.out.println(P1.getAge());
        // System.out.println(P1.getName());
        System.out.println(P1);
    }
}
