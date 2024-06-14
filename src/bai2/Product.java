package bai2;

import java.util.Scanner;

public abstract class Product {
    private String id;
    private String name;
    private String producer;
    private int yearMaking;

    public Product() {
    }

    public Product(String id, String name, String producer, int yearMaking) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.yearMaking = yearMaking;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma san pham: ");
        id = scanner.nextLine();
        System.out.println("Nhap ten san pham: ");
        name = scanner.nextLine();
        System.out.println("Nhap nha san xuat: ");
        producer = scanner.nextLine();
        System.out.println("Nhap nam san xuat: ");
        yearMaking = scanner.nextInt();
    }
    public void display(){
        System.out.println("\tMa san pham: "+id);
        System.out.println("\tTen san pham: "+name);
        System.out.println("\tNha san xuat: "+producer);
        System.out.println("\tNam san xuat: "+yearMaking);
    }

    public abstract double caculateSellPrice();

}
