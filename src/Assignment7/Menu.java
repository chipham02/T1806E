package Assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int press = 0;
        ArrayList<Assignment7.News> ListNews = new ArrayList<>();
        do {
            System.out.println("Menu: ");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");

            Scanner scanner = new Scanner(System.in);
            press = scanner.nextInt();
            switch (press) {
                case 1:
                    ListNews.add(new Assignment7.News());
                    break;
                case 2:
                    for (Assignment7.News n : ListNews) {
                        n.Display();
                    }
                    break;
                case 3:
                    for (Assignment7.News n : ListNews) {
                        n.Calculate();
                    }
                    break;
                case 4:
                    return;
            }
        } while (press != 4);
    }
}
