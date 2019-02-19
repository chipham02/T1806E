import Ass5.Aos;
import Ass5.Nhan;
import Ass5.Order;
import Ass5.Product;

import java.util.ArrayList;

public class bt5 {

    public static void main(String[] args) {
        ArrayList productArrayList = new ArrayList();
        Aos aos1 = new Aos(1,"Áo hàng hiệu", 10000,5,"áo",5,"xanh","may10");
        Nhan nhan1 = new Nhan(2,"Nhẫn kim cương", 100000,"nhẫn", 5,1, "nhẫn quý");

        Order order = new Order();
        aos1.buyItem(order,3);
        nhan1.buyItem(order,2);
        System.out.println("Danh sách sản phẩm trong đơn hàng:");

        for (int i=0;i<order.productArrayList.size();i++){
            if(order.productArrayList.get(i) instanceof Aos){
                Aos product = (Aos) order.productArrayList.get(i);
                System.out.println(product.productName);
            }else {
                Nhan product = (Nhan) order.productArrayList.get(i);
                System.out.println(product.productName);
            }
        }
        System.out.println("Tổng tiền: "+order.grandTotal);

    }
}
