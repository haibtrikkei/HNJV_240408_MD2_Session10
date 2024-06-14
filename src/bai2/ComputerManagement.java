package bai2;

import java.util.Arrays;
import java.util.Scanner;

public class ComputerManagement {
    public static void main(String[] args) {
        Computer[] list;
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong may tinh: ");
        n = Integer.parseInt(scanner.nextLine());

        list = new Computer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin may tinh thu "+(i+1));
            list[i] = new Computer();
            list[i].input();
        }

        System.out.println("\nThong tin cac may tinh: ");
        for(Computer c: list){
            c.display();
        }

        Arrays.sort(list, new ProductPriceComparator());
        System.out.println("\nDanh sach giam dan theo gia ban: ");
        for(Computer c: list){
            c.display();
        }

        Arrays.sort(list, new ProductNameComparator());
        System.out.println("\nDanh sach tang dan theo ten san pham: ");
        for(Computer c: list){
            c.display();
        }
    }
}
