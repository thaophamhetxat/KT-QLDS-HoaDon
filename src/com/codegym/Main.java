package com.codegym;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ManagerKhachHang managerKhachHang = new ManagerKhachHang();
    private static Object VietNam;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("1. Thêm khách hàng");
            System.out.println("2. sửa khách hàng");
            System.out.println("3. xóa khách hàng");
            System.out.println("4. tìm theo tên");
            System.out.println("5. tìm theo mã");
            System.out.println("6. Xắp xếp theo mã");
            System.out.println("7. Show");
            System.out.println("8. Edit");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1: {
                    System.out.println("      1. Thêm khách hàng viet nam");
                    System.out.println("      2. Thêm khách hàng ngoai quoc");
                    int select = Integer.parseInt(scanner.nextLine());
                    switch (select) {
                        case 1:
                            managerKhachHang.addKhachHang("VietNam");
                            break;
                        case 2:
                            managerKhachHang.addKhachHang("NuocNgoai");
                            break;
                    }
                }
                break;
                case 3: {
                    System.out.println("Nhập tên cần xóa: ");
                    managerKhachHang.delete();
                }
                break;
                case 7:
                    managerKhachHang.show();
                    break;
                case 8: System.exit(0);
                case 4:
                    managerKhachHang.searchName();
                    break;
                case 6:managerKhachHang.sortMaKhachHang();break;


            }
        }
    }
}

