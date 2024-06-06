public class Circle {
    private double radius;
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea (){
//        return (radius * radius * Math.PI);
        return (Math.pow(radius,2)*Math.PI);
    }
    public double getPerimeter(){
        return (2*radius*Math.PI);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(4);

        circle1.setRadius(2.5);
        System.out.println("Dien tich hinh tron 1 la: " + circle1.getArea());
        System.out.println("Chu vi hinh tron 1 la: " + circle1.getPerimeter());
        System.out.println("\n ");
        System.out.println("Dien tich hinh tron 2 la: " + circle2.getArea());
        System.out.println("Chu vi hinh tron 2 la: " + circle2.getPerimeter());

    }
}
