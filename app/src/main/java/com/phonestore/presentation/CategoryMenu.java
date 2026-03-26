package com.phonestore.presentation;

import com.phonestore.model.Category;
import com.phonestore.service.CategoryService;

import java.util.List;
import java.util.Scanner;

public class CategoryMenu {

    private static CategoryService service = new CategoryService();
    private static Scanner sc = new Scanner(System.in);

    public static void menu() {
        while (true) {
            System.out.println("\n=== CATEGORY MENU ===");
            System.out.println("1. Xem danh mục");
            System.out.println("2. Thêm");
            System.out.println("3. Sửa");
            System.out.println("4. Xóa");
            System.out.println("0. Thoát");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    List<Category> list = service.getAll();
                    list.forEach(c -> System.out.println(c.getId() + " - " + c.getName()));
                    break;

                case 2:
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Mô tả: ");
                    String desc = sc.nextLine();
                    service.add(new Category(name, desc));
                    break;

                case 3:
                    System.out.print("ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Tên mới: ");
                    String newName = sc.nextLine();
                    System.out.print("Mô tả mới: ");
                    String newDesc = sc.nextLine();
                    service.edit(new Category(id, newName, newDesc));
                    break;

                case 4:
                    System.out.print("ID: ");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    service.remove(deleteId);
                    break;

                case 0:
                    return;
            }
        }
    }
}