public class Square {
    private double edge;

    public Square() {

    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getSquarePerimeter() {
        return (edge * 4);
    }

    public double getArea() {
//        return edge * edge;
        return Math.pow(edge,2);
    }

    public static void main(String[] args) {
        Square square1 = new Square(3.4);
        System.out.println("Chu vi la: " + square1.getSquarePerimeter());
        System.out.println("Dien tich la: " + square1.getArea());
    }
}
