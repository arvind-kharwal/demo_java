class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}

public class Main6 {
    static void display() throws MyException{
        System.out.println("Inside display");
        throw new MyException("This is an exception");
    }

    public static void main(String[] args) {
        try{
            display();
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
    
}
