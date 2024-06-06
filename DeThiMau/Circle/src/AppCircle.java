public class AppCircle extends Circle {
    double height;
    public AppCircle(){
        this.height = height;
    }
    public AppCircle(double centerX, double centerY, double radius, double height){
        super (centerX,centerY,radius);
        this.height = height;
    }
    public AppCircle(double centerX, double centerY, double radius, String color, double height){
        super( centerX, centerY, radius , color);
        this.height= height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void render(){
        super.render();
        System.out.println();
    }
    public  double getVolumeCylinder(){
        return getArea()*height;
    }
}
