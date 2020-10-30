import java.util.ArrayList;
public class Polymorphism {
    public static void main(String[] arg){
        ArrayList<Shape> shapes =  new ArrayList<Shape>();
        shapes.add(new Rectangle());
        shapes.add(new Triangle());
        for (Shape shape : shapes){
                drawShape(shape);
        }
        
    }
    private static void drawShape(Shape shape) {
        shape.draw();
    }
}
class Shape {
    public void draw(){
        System.out.println("Perform draw from base class");
    }

}
class Rectangle extends Shape {
    @Override
    public  void draw(){
        System.out.println("Draw Retangel");
        super.draw();
    }
}
class Triangle extends Shape{
    @Override
    public  void draw(){
        System.out.println("Drawer Triangle");
        super.draw();
    }
}