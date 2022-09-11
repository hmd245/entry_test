package controller;

import model.Furniture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FurnitureController {
    Scanner scanner = new Scanner(System.in);

    public List<Furniture> furnitureList = new ArrayList<>();
    //furnitureList.add(furniture1);????????????

    // Nhập thông tin Furniture
    public void enterFurniture() {
        int numberFurniture;

        do {
            System.out.print("Nhap so luong do noi that: ");
            numberFurniture = scanner.nextInt();
            if (numberFurniture <= 0) {
                System.out.println("So luong do > 0");
            }

            for (int i = 1; i <= numberFurniture; i++) {
                Furniture furniture = new Furniture();

                System.out.println("Furniture " + i + ": ");
                System.out.print("So serial: ");
                int serial = scanner.nextInt();

                scanner.nextLine();
                System.out.print("Nhap ten: ");
                String name = scanner.nextLine();

                System.out.print("Nhap nha san xuat: ");
                String producer = scanner.nextLine();

                System.out.print("Nhap loai do noi that: ");
                String type = scanner.nextLine();

                furniture.setSerial(serial);
                furniture.setName(name);
                furniture.setProducer(producer);
                furniture.setType(type);

                furnitureList.add(furniture);
            }

        } while (numberFurniture <= 0);
    }

    // Hàm hiển thị thông tin đồ nội thất
    public void getFurnitureInfo() {
        for (Furniture furniture : furnitureList) {
            System.out.println(furniture.getDescription());
        }
    }

    // hàm hiển thị thông tin Furniture theo serialFurniture nhập vào
    public void getFurnitureBySerial() {
        Furniture furniture1 = new Furniture(1412, "Table", "Viet Nam", "Office");
        furnitureList.add(furniture1);

        System.out.print("Nhap vao serial can lay: ");
        int serialFurniture = scanner.nextInt();
        for (int i = 0; i < furnitureList.size(); i++) {
            if (furnitureList.get(i).getSerial() == (serialFurniture)) {
                System.out.println(furnitureList.get(i).getDescription());
                break;
            }
        }
    }

}
