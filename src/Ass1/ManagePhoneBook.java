package Ass1;

import java.util.Scanner;

public class ManagePhoneBook {
    public static void main(String [] args){
        PhoneBook phoneBook = new PhoneBook();
        String name;
        String phone;
        int flag=0;

        do {
            System.out.println("PHONEBOOK MANAGEMENT SYSTEM");
            System.out.println("1. Insert Phone");
            System.out.println("2. Remove Phone");
            System.out.println("3. Update Phone");
            System.out.println("4. Search Phone");
            System.out.println("5. Sort");

            Scanner scanner = new Scanner(System.in);
            int func = scanner.nextInt();
            while (func > 5 || func <1){
                System.out.println("Input again: ");
                func = scanner.nextInt();
            }
            switch (func){
                case 1:
                    ManagePhoneBook.inputName();
                    ManagePhoneBook.inputPhone();
                    phoneBook.insertPhone(name,phone);
                    break;
                case 2:
                    name = ManagePhoneBook.inputName(name);
                    phoneBook.removePhone(name);
                    break;
                case 3:
                    name = ManagePhoneBook.inputName(name);
                    phone = ManagePhoneBook.inputPhone(phone);
                    phoneBook.updatePhone(name,phone);
                    break;
                case 4:
                    name = ManagePhoneBook.inputName(name);
                    phoneBook.searchPhone(name);
                    break;
                case 5:
                    phoneBook.sort();
                    break;
                case 6: flag=1; break;
            }
        }while (flag==0);
    }

    public static void inputName(){
        System.out.println("Input name: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }

    public static void inputPhone(){
        System.out.println("Input phone: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }

}
