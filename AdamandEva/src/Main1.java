public class Main1 {
    public static void main(String[] args) {
        Human adam = new Human("Adam",true,100);
        Human eva = new Human("Eva",false,99);
        Apple apple1 = new Apple();

        adam.say("An tao khong em eiiiiiiiiiiii");
        eva.say("An anh eiiiiiiiiiiiiii");

        while (!apple1.isEmpty()){
            adam.eat(apple1);
            eva.eat(apple1);
            System.out.println("Khoi luong cua Adam la: " + adam.getWeight());
            System.out.println("Khoi luong cua Eva la: " + eva.getWeight());
            System.out.println("Qua tao con :" + apple1.getWeight());
        }
        System.out.println("Tao an het r");
    }
}
