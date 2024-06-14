package bai1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Customer implements ICustomer{
    private String id;
	private String name;
	private boolean gender;
	private Date birthday;
	private String address;
	private String email;
	private String phone;

    public Customer() {
    }

    public Customer(String id, String name, boolean gender, Date birthday, String address, String email, String phone) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.email = email;
        this.phone = phone;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void input() throws ParseException{
        Scanner scanner = new Scanner(System.in);
        id = UUID.randomUUID().toString(); //Chuoi sinh ngau nhien
        System.out.println("Nhap ho ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhap ngay sinh: ");
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        birthday = sf.parse(scanner.nextLine());
        System.out.println("Nhap que quan: ");
        address = scanner.nextLine();
        System.out.println("Nhap email: ");
        email = scanner.nextLine();
        System.out.println("Nhap phone: ");
        phone = scanner.nextLine();
    }

    @Override
    public void display() {
        System.out.println("Khach hang: ");
        System.out.println("\tMa khach hang: "+id);
        System.out.println("\tTen khach hang: "+name);
        System.out.println("\tGioi tinh: "+(gender?"Nam":"Nu"));
        System.out.println("\tNgay sinh: "+birthday);
        System.out.println("\tQue quan: "+address);
        System.out.println("\tEmail: "+email);
        System.out.println("\tSo dien thoai: "+phone);
    }
}
