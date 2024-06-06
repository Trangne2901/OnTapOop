public class Quadratic {
    private int a, b, c;

    public Quadratic() {
    }

    public Quadratic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDelta() {
        return (Math.pow(b, 2) - 4 * a * c);
    }

    public void printTwoRoot() {
        double root1 = (-b + Math.sqrt(getDelta()) / 2 * a);
        double root2 = (-b - Math.sqrt(getDelta()) / 2 * a);

        System.out.println(root1);
        System.out.println(root2);
    }

    public void printRoot() {
        double root = (double) (-b) / 2 * a;

        System.out.println(root);
    }
}
