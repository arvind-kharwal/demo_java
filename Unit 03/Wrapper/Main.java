public class Main {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Primitive value"+a);
        Integer I = Integer.valueOf(a);
        System.out.println("Interger Wrapper"+I);
        boolean v = I instanceof Integer;
        System.out.println(v);
    }
}
