interface Sample5{
    String display(String name);
}
public class Main5 {
    public static void main(String[] args) {
        String str = "Hello";
        Sample5 S = (String name)-> {
            return str+" "+name;
        }; 
        String res = S.display("Arvind");
        System.out.println(res);
    } 
}
