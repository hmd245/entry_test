package controller;

import model.Furniture;
import model.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VideoController {
    public static Scanner scanner = new Scanner(System.in);

    // Tạo list lưu danh sách Video
    public List<Video> videoList = new ArrayList<Video>();

    // Nhập thông tin Video
    public void enterVideo() {
        int numberVideo;

        do {
            System.out.print("Nhap so luong video: ");
            numberVideo = scanner.nextInt();
            if (numberVideo <= 0) {
                System.out.print("So luong video > 0");
                continue;
            }

            int count = 0;
            while (count < numberVideo) {
                Video video = new Video();
                System.out.print("Video " + (count + 1) + ":");
                System.out.print("\nSo serial: ");
                int serial = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Ten video: ");
                String name = scanner.nextLine();

                System.out.print("Do dai video: ");
                Double length = scanner.nextDouble();

                scanner.nextLine();
                System.out.print("Chat luong video: ");
                String quality = scanner.nextLine();

                video.setSerial(serial);
                video.setName(name);
                video.setLength(length);
                video.setQuality(quality);

                videoList.add(video);
                count++;
            }
        } while (numberVideo <= 0);
    }

    // Hàm hiển thị thông tin Video
    public void getVideoInfo() {
        for (Video video : videoList) {
            System.out.println(video.getDescription());
        }
    }

    // Hàm hiển thị thông tin Video theo serialVideo nhập vào
    public void getVideoBySerial() {
        Video video1 = new Video(1412, "Java Oop 1", 2.4, "Full-Hd");
        videoList.add(video1);

        System.out.print("Nhap vao serial can lay: ");
        int serialVideo = scanner.nextInt();
        for (int i = 0; i < videoList.size(); i++) {
            if (videoList.get(i).getSerial() == (serialVideo)) {
                System.out.println(videoList.get(i).getDescription());
                break;
            }
        }
    }
}
