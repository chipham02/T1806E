package Assignment9;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KhachhangVN(1,"Nguyen Van A", LocalDate.parse("2019-12-12"),97,"Ca nhan"));
        arrayList.add(new KhachhangVN(2,"Nguyen Van B", LocalDate.parse("2019-01-10"),197,"Ca nhan"));
        arrayList.add(new KhachhangNN(3,"ABC", LocalDate.parse("2019-02-02"),100,"Iran"));
        arrayList.add(new KhachhangNN(4,"XYZ", LocalDate.parse("2019-01-01"),200,"Iraq"));

        int soluong_khVN = 0;
        int soluong_khNN = 0;
        float tongtienNN = 0;

        ArrayList<String> hd = new ArrayList<>();
        for (int i=0;i<arrayList.size();i++){
            if (arrayList.get(i) instanceof KhachhangVN){
                KhachhangVN x = (KhachhangVN)arrayList.get(i);
                System.out.println(x.MKH + "Tên: " + x.name + "Số tiền: " + x.tinhtien());
                soluong_khVN++;
                if (x.ex_date.getMonth().getValue() == 2 && x.ex_date.getYear() == 2019){
                    hd.add(x.MKH + "Tên: " + x.name + "Số tiền: " + x.tinhtien());
                }
            }
            else {
                KhachhangNN y = (KhachhangNN)arrayList.get(i);
                System.out.println(y.MKH + "Tên: " + y.name + "Số tiền: " + y.tinhtien());
                soluong_khNN++;
                if (y.ex_date.getMonth().getValue() == 2 && y.ex_date.getYear() == 2019){
                    hd.add(y.MKH + "Tên: " + y.name + "Số tiền: " + y.tinhtien());
                }
            }
        }
        System.out.println("KH VN: " + soluong_khVN + "KH NN: " + soluong_khNN);
        System.out.println("Trung bình KHNN: " + tongtienNN/soluong_khNN);
        for (String i:hd){
            System.out.println(i);
        }
    }
}
