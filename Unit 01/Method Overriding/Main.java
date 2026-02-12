class Scooter{
    void run(){ // overridden 
        System.out.println("Grrrrr");
    }
}
class Bike extends Scooter{
    void run(){  // Overriding 
        super.run();
        System.out.println("Furrrrr");
    }
}

public class Main {
    public static void main(String[] args) {
        // Scooter S =  new Scooter();
        // S.run();
        Bike B = new Bike();
        B.run();
    }
}
