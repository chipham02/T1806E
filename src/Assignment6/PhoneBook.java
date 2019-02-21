package Assignment6;

import java.util.ArrayList;
import java.util.Collections;

public class PhoneBook extends Phone {
    public ArrayList<PhoneNumber> PhoneList;

    public PhoneBook(){
        this.PhoneList = new ArrayList<PhoneNumber>();
    }

    @Override
    public void insertPhone(String name, String phone){
        for (int i=0;i<this.PhoneList.size();i++){
            if (this.PhoneList.get(i).name.equals(name)){
                if (!this.PhoneList.get(i).phone.equals(phone)){
                    this.PhoneList.get(i).phone += ":" +phone;
                    return;
                }
                return;
            }
        }
        this.PhoneList.add(new PhoneNumber(name,phone));
    }

    @Override
    public void removePhone(String name){
        for (int i=0;i<this.PhoneList.size();i++){
            if (this.PhoneList.get(i).name.equals(name)){
                this.PhoneList.remove(i);
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone){
        for (int i=0;i<this.PhoneList.size();i++){
            if (this.PhoneList.get(i).name.equals(name)){
                this.PhoneList.get(i) = newphone;
            }
        }
    }

    @Override
    public void searchPhone(String name){
        for (int i=0;i<this.PhoneList.size();i++){
            if (this.PhoneList.get(i).name.equals(name)){
                System.out.println(this.PhoneList.get(i).name +" SĐT: "+this.PhoneList.get(i).phone);
                break;
            }
        }
    }

    @Override
    public void sort(){
        Collections.sort(this.PhoneList);
        for (PhoneNumber phoneNumber:this.PhoneList){
            System.out.println(phoneNumber.name +" SĐT: "+phoneNumber.phone);
        }
    }
}