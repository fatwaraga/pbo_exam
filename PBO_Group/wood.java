// Contoh kelas turunan dengan inheritance
public class wood extends Shape {
    private double length;
    private double width;
    
    public wood(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    public double getLength() {
        return length;
    }
    
    public void setRadius(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    
    public void setRadius(double width) {
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return length * width;
    }
}
