public class Human {
    private String name;
    private  boolean gender;
    private int weight;
    public Human(){}
    public Human(String name, boolean gender, int weight){
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    public void say(String work){
        System.out.println(work);
    }
    public void eat(Apple apple){
        if(!apple.isEmpty()){
            System.out.println(name + " Da an 1 mieng  tao");
            apple.decrease();
            weight++;
        }else{
            System.out.println("Tao da het r");
        }
    }

}
