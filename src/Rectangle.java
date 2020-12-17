public class Rectangle implements Resizeable{
    private double width;
    private double height;

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double percent) {
        setWidth(this.width*percent);
        setHeight(this.height*percent);

    }
    public String abc(){
        return "bbnna";
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
