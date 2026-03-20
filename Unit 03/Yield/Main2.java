class Example implements Runnable{
    public void run()
    {
        System.out.println("Using Runnable Interafce");
    }
}
public class Main2 {
    public static void main(String[] args) {
        Example E1 = new Example();
        Thread T1 = new Thread(E1);
        T1.start();
    }
}
