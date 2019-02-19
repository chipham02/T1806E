package Ass5;

public class Jewelry extends Ass5.Product {
    public float weight;
    public String type;

    public Jewelry(int ID, String productName, int price, int qty, String productType, float weight, String type){
        super(ID,productName,price,qty,productType);
        this.weight = weight;
        this.type = type;
    }

    public void lamMoi(){
        System.out.println("Làm mới");
    }
}
