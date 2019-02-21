package Assignment7;

import java.util.Scanner;

public class News implements INews {
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;
    int[] Ratelist;
    Scanner scanner = new Scanner(System.in);


    public News(){
        System.out.println("Nhập ID: ");
        this.ID = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Title: ");
        this.Title = scanner.nextLine();
        System.out.println("Nhập PublishDate: ");
        this.PublishDate = scanner.nextLine();
        System.out.println("Nhập Content: ");
        this.Content = scanner.nextLine();

        this.Ratelist = new int[3];
        System.out.println("Nhập đánh giá 1: ");
        this.Ratelist[0] = scanner.nextInt();
        System.out.println("Nhập đánh giá 2: ");
        this.Ratelist[1] = scanner.nextInt();
        System.out.println("Nhập đánh giá 3: ");
        this.Ratelist[2] = scanner.nextInt();
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public void setTitle(String Title){
        this.Title = Title;
    }

    public void setPublishDate(String PublishDate){
        this.PublishDate = PublishDate;
    }

    public void setAuthor(String Author){
        this.Author = Author;
    }

    public void setContent(String Content){
        this.Content = Content;
    }

    public int getID(int ID){
        return this.ID;
    }

    public String getTitle(String Title){
        return this.Title;
    }

    public String getPublishDate(String PublishDate){
        return this.PublishDate;
    }

    public String getAuthor(String Author){
        return this.Author;
    }

    public String getContent(String Content){
        return this.Content;
    }

    public float getAverageRate(float AverageRate){
        return this.AverageRate;
    }


    public void Display(){
        System.out.println("Title: " +Title+ "PublishDate: " +PublishDate+ "Author: " +Author+ "Content: " +Content);
    }

    public void Calculate(){
        float a = this.Ratelist[0];
        float b = this.Ratelist[1];
        float c = this.Ratelist[2];
        this.AverageRate = (a+b+c)/3;
    }
}


