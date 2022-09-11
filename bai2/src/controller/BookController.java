package controller;

import model.BookOnTape;
import model.Furniture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookController {
    Scanner scanner = new Scanner(System.in);

    public List<BookOnTape> bookList = new ArrayList<BookOnTape>();

    // Nhập thông tin Book
    public void enterBook() {
        int numberBook;

        do {
            System.out.print("Nhap so luong sach: ");
            numberBook = scanner.nextInt();
            if (numberBook <= 0) {
                System.out.print("So luong sach > 0");
                continue;
            }

            int count = 0;
            while (count < numberBook) {
                BookOnTape book = new BookOnTape();
                System.out.println("Book " + (count + 1) + ":");
                System.out.print("So serial: ");
                int serial = scanner.nextInt();

                scanner.nextLine();
                System.out.print("Ten sach: ");
                String name = scanner.nextLine();

                System.out.print("Nha san xuat: ");
                String producer = scanner.nextLine();

                System.out.print("Loai sach:  ");
                String type = scanner.nextLine();

                book.setSerial(serial);
                book.setName(name);
                book.setProducer(producer);
                book.setType(type);

                bookList.add(book);
                count++;
            }
        } while (numberBook <= 0);
    }

    // Hàm hiển thị thông tin Book
    public void getBookInfo() {
        for (BookOnTape books : bookList) {
            System.out.println(books.getDescription());
        }
    }

    // Tìm kiếm sách theo Id
    public void getBookBySerial() {
        System.out.print("Nhap vao serial can lay: ");
        int serialBook = scanner.nextInt();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getSerial() == (serialBook)) {
                System.out.println(bookList.get(i).getDescription());
                break;
            }
        }
    }

}
