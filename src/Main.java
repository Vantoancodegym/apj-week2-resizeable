public class Main {
    public static void main(String[] args) {
        double x=Math.random()*100;
        Resizeable[] shapes=new Resizeable[3];
        Resizeable circle=new Circle(3);
        shapes[0]=new Circle(2);
        shapes[1]=new Rectangle(3,4);
        shapes[2]=new Square(5);
        for (Resizeable shape:shapes
             ) {shape.resize(x);
            System.out.println(x);
            System.out.println(shape);
        }
        Circle c =(Circle) circle;
        c.abc();
        shapes[0].abc();

    }
}
