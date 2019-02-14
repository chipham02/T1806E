import Animals.Dog;
import Animals.Cat;

import java.util.Scanner;

public class bt3{
    public static void main(String[] args){
        Dog dog1 = new Dog(1,"Chó Nhật","đen",10,1);


        Cat cat1 = new Cat(1,"Mèo đen","trắng",5,2);

        if(dog1.weight > cat1.weight){
            dog1.sua();
            cat1.chay();
        }
        else{
            cat1.cao();
            dog1.chay();
        }
    }
}
