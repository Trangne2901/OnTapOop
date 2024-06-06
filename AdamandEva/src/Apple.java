public class Apple {
    private int weight = 10;
    public Apple(){}

    public Apple(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void decrease(){
        weight--;
    }
    public boolean isEmpty() {
        if (getWeight() == 0) {
            return true;
        }
        return false;
    }
}
