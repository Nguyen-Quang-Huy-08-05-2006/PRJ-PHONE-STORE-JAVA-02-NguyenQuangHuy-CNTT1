package com.phonestore.presentation;

import java.util.Scanner;

public class MainMenu {

    private static Scanner sc = new Scanner(System.in);

    public static void menu() {
        while (true) {
            System.out.println("\n========== PHONE STORE - MAIN MENU ==========");
            System.out.println("1. Quản lý Danh mục (Admin)");
            System.out.println("2. Quản lý Sản phẩm (Admin)");
            System.out.println("3. Quản lý Người dùng (Admin)");
            System.out.println("4. Quản lý Đơn hàng (Admin)");
            System.out.println("5. Trang khách hàng");
            System.out.println("0. Thoát");
            System.out.println("==========================================");

            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    CategoryMenu.menu();
                    break;

                case 2:
                    System.out.println(">>> Chức năng Quản lý Sản phẩm sẽ được phát triển...");
                    break;

                case 3:
                    System.out.println(">>> Chức năng Quản lý Người dùng sẽ được phát triển...");
                    break;

                case 4:
                    System.out.println(">>> Chức năng Quản lý Đơn hàng sẽ được phát triển...");
                    break;

                case 5:
                    System.out.println(">>> Trang khách hàng sẽ được phát triển...");
                    break;

                case 0:
                    System.out.println("Cảm ơn đã sử dụng Phone Store!");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
