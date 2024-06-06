public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.render();
        System.out.println("Dien tich hinh tron :"+ circle1.getArea()+"\n");

        Circle circle2 = new Circle(2.5, 3.5, 5);
        circle2.render();

        circle2.setColor("Red");
        circle2.render1();
        System.out.println("Dien tich hinh tron :"+ circle2.getArea()+"\n");


        Circle circle3 = new Circle(2.0, 3.0, 5, "Blue");
        circle3.render1();
        System.out.println("Dien tich hinh tron :"+ circle3.getArea()+"\n");

        AppCircle appCircle1 = new AppCircle(2.5,3.5,4,"While",3);
        appCircle1.render1();
        System.out.println("dien tich hinh tru: "+appCircle1.getVolumeCylinder());

    }
}