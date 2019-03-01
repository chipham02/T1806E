package Exam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input item details: ");
        System.out.println("ItemID: ");
        int itemId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Producer: ");
        String producer = scanner.nextLine();
        System.out.println("Price: ");
        double price = scanner.nextDouble();

        Item item = new Item(itemId,name,producer,price);

        System.out.println("Item details: " +item.toString());
    }
}
