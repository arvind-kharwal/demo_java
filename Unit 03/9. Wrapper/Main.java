public class Main {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Primitive value"+a);
        Integer I = Integer.valueOf(a);
        System.out.println("Interger Wrapper"+I);
        boolean v = I instanceof Integer;
        System.out.println(v);
        System.out.println("============");
        int b =20;
        Integer I1 = b;
        System.out.println("Autoboxing: "+I1);
        boolean v1 = I1 instanceof Integer;
        System.out.println(v1);

    }
}
