abstract sealed class Shape permits Circle,Rectangle{
    abstract void area();
}
final class Circle extends Shape{
    private int r;
    Circle(int r){
        this.r = r;
    }
    void area(){
        double res =Math.PI*r*r;
        System.out.println("The area of circle: "+res); 
    }
}

final class Rectangle extends Shape{
    private int l,b;
    Rectangle(int l,int b){
        this.l = l;
        this.b = b;
    }
    void area(){
        int res = l*b;
        System.out.println("The area of Rectangle is: "+res);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Circle C1 = new Circle(3);
        C1.area();
        System.out.println("Area of Rectangle");
        Rectangle R1 = new Rectangle(10, 20);
        R1.area();
    }
}
