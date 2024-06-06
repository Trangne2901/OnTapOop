public class Circle {
    private double cenxterX;
    private double cenxterY;
    private double radius;
    private String color;
    public  Circle(){
        cenxterX = 0;
        cenxterY = 0;
        radius = 1;
    }
    public Circle(double centerX, double centerY, double radius){
        this.cenxterX = centerX;
        this.cenxterY = centerY;
        this.radius = radius;
    }
    public Circle(double centerX, double centerY, double radius, String color){
        this.cenxterX = centerX;
        this.cenxterY = centerY;
        this.radius = radius;
        this.color = color;
    }

    public double getCenxterX() {
        return cenxterX;
    }

    public void setCenxterX(double cenxterX) {
        this.cenxterX = cenxterX;
    }

    public double getCenxterY() {
        return cenxterY;
    }

    public void setCenxterY(double cenxterY) {
        this.cenxterY = cenxterY;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void render(){
        System.out.println("Tọa độ x của tâm:"+cenxterX+" Tọa độ y của tâm:"+cenxterY+" Ban kinh:"+radius);
    }

    public void render1(){
        System.out.println("Tọa độ x của tâm:"+cenxterX+" Tọa độ y của tâm:"+cenxterY+" Ban kinh:"+radius+" Màu sắc:"+color);
    }
    public double getArea() {
       return (Math.pow(radius,2)*Math.PI);
    }

}
