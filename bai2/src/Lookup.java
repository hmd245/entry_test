import controller.BookController;
import controller.FurnitureController;
import controller.VideoController;
import model.Furniture;
import view.ViewMenu;

import java.util.Scanner;

public class Lookup {

    public static Scanner scanner = new Scanner(System.in);

    private static ViewMenu view = new ViewMenu();

    public static void main(String[] args) {
        int choose;
        boolean exit = false;
        VideoController videoController = new VideoController();
        BookController bookController = new BookController();
        FurnitureController furnitureController = new FurnitureController();

        view.showMenu();
        while (true) {
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    videoController.enterVideo();
                    break;
                case 2:
                    bookController.enterBook();
                    break;
                case 3:
                    furnitureController.enterFurniture();
                    break;
                case 4:
                    furnitureController.getFurnitureInfo();
                    videoController.getVideoInfo();
                    bookController.getBookInfo();
                    break;
                case 5:
                    videoController.getVideoBySerial();
                    break;
                case 6:
                    bookController.getBookBySerial();
                    break;
                case 7:
                    furnitureController.getFurnitureBySerial();
                    break;
                case 0:
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
            // show menu
            view.showMenu();
        }
    }
}
