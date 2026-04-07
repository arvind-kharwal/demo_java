public class Main1 {
    public static void main(String[] args) {
        Integer I1 = 10;
        int a = I1.intValue();
        System.out.println("Unboxing: "+a);
        Integer I2 = 10;
        int b = I2;
        System.out.println("Auto-unboxing:"+b);
        Float f = 3.2f;
        float c = f;
        System.out.println(c);
    }
}
