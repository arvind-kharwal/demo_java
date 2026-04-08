class Class1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++)
            System.out.print(i);
        try
        {
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        
        
    }
}
class Class2 implements Runnable{
    public void run()
    {
        for(char i='A';i<='E';i++)
            System.out.print(i);
    }
}
public class Main3 {
    public static void main(String[] args) {
        Class1 T1 = new Class1();
        Class2 C1 = new Class2();
        Thread T2 = new Thread(C1,"Thread Two");
        // Priorities 
        // T1.setPriority(1);
        // T2.setPriority(10);
        T1.setPriority(Thread.MIN_PRIORITY);
        T2.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(T2.getName());
        T1.start();
        T2.start();
        try{
            T1.join();  
            T2.join();
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
    }
    
}
