package bai1;

import java.text.ParseException;
import java.util.Scanner;

public class CustomerManagement {
    public static void main(String[] args) throws ParseException {
        Customer[] list;
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so khach hang: ");
        n = Integer.parseInt(scanner.nextLine());

        list = new Customer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin khach hang thu "+(i+1));
//            Customer c = new Customer();
            list[i] = new Customer();
            list[i].input();
        }

        System.out.println("\nThong tin cac khach hang: ");
        for(Customer c: list){
            c.display();
        }
    }
}
