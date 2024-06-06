//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Tâm dep trai", 19);
        Person person2 = new Person("Huyen Trang", 19);

        person1.setName("Tâm khong dep trai");
        System.out.println("To ten la: " + person1.getName() +" va to " +person1.getAge() + " tuoi");

        System.out.println("To ten la: " + person2.getName());
    }
}