package Ass5;

public class Product {

    public int ID;
    public String productName;
    public int price;
    public int qty;
    public String productType; //áo,nhẫn,fashion,jewelry

    public Product(int ID, String productName, int price, int qty, String productType){
        this.ID = ID;
        this.productName = productName;
        this.price = price;
        this.qty = qty;
        this.productType = productType;
    }

    public void buyItem(Ass5.Order order, int qty){
        order.grandTotal+ = this.price;
        this.qty- = qty;
        order.productArrayList.add(this);
    }
}