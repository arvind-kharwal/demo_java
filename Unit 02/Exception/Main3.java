public class Main3 {
    public static void main(String[] args) {
        int a = args.length;
        try{
            int b = 10/a;
            System.out.println(b);
            int c[] ={1,2};
            c[2] = 100;
            System.out.println(c[0]+" "+c[1]);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("End of code");
        }
    }
    
}
