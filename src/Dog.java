package Animals;

public class Dog {
    public int ID;
    public String type;
    public String color;
    public int weight;
    public int age;

    public Dog(int ID, String type, String color, int weight, int age) {
        this.ID = ID;
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public void sua(){
        System.out.println("Sủa...");
    }

    public void an(){
        System.out.println("Ăn...");
    }

    public void chay(){
        System.out.println("Chạy...");
    }
}