public class Person {
    private String name;
    private int age;
    public Person(){ //phtuc ktao ko tham so

    }
    public Person(String name, int age){// phtuc khoi tao co tham so
        this.name = name;
        this.age =age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }
}
