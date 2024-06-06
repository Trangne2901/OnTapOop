
public class Main {
    public static void main(String[] args) {
        Quadratic quadratic = new Quadratic(2, 4, -6);
        if (quadratic.getDelta() > 0) {
            System.out.println("Ptrinh co 2 nghiem pbiet la: ");
            quadratic.printTwoRoot();
        } else if (quadratic.getDelta() == 0) {
            System.out.println("Ptrinh co nghiem kep la: ");
            quadratic.printRoot();
        } else {
            System.out.println("Ptrinh vo nghiem");
        }
    }
}