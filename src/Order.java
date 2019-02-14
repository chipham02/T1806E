package Ass4;

import java.util.ArrayList;

public class Order {
    public int ID;
    public int grandTotal;
    public ArrayList<Ass4.Product> productArrayList;

    public void addItem(Ass4.Product product){
        if(product.getQty() > 0){
            //this.productArrayList = new ArrayList<>();
            this.productArrayList.add(product);
            this.grandTotal +=product.price;
            product.setQty(product.getQty()-1);
        }
        else {
            System.out.println(product.productName + "hết hạn");
        }
    }

    public void addItem(Ass4.Product product,int discount){
        if(product.getQty() > 0){
            this.productArrayList.add(product);
            this.grandTotal +=product.price * (100-discount)/100;
            product.setQty(product.getQty()-1);
        }
        else {
            System.out.println(product.productName + "hết hạn");
        }
    }
}