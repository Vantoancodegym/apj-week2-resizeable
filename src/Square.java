public class Square implements Resizeable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public String abc(){
        return "bbnna";
    }

    @Override
    public void resize(double percent) {
        this.setSide(this.side*percent);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
