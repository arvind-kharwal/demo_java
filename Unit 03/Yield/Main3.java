class Thread2 extends Thread{
    public void run(){
        System.out.println("Thread started");
    }
}
class Example1 implements Runnable{
    public void run()
    {
        System.out.println("Using Runnable Interafce");
    }
}
public class Main3 {
    public static void main(String[] args) {
        Thread2 T1 = new Thread2();
    T1.start();
    Example1 E1 = new Example1();
    Thread T2 = new Thread(E1,"Second Thread");
    T1.setPriority(10);
    T2.setPriority(2);
    T1.start();
    T2.start();
    }
    
}
