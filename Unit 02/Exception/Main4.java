public class Main4 {
    static void display() throws Throwable{
        System.out.println("inside Display");
        throw new Throwable("Array size is not proper");
    }
    public static void main(String[] args) {
        try{
            display();
        }
        catch(Throwable e){
            System.out.println(e.getMessage());
        }
        
    }
}
