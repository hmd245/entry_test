/*
input: Java is interesting
output: interesting

input: I like Java
output: like

b1: tách chuỗi theo dấu cách " "
b2: gán các từ tách được vào một mảng arrWord
b3: duyệt mảng tìm vị trí arrWord[i] có length max
b4: trả về arrWord[i] đó
 */

import java.util.Scanner;

public class LongestWordInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (count <= 2) {
            String strInput;
            strInput = scanner.nextLine();
            System.out.println(findLongestWord(strInput));
            count++;
        }
    }

    public static String findLongestWord(String strInput) {
        String[] arrWord = strInput.split(" ");

        int index = 0;
        int max = arrWord[0].length();

        for (int i = 0; i < arrWord.length; i++) {
            if (arrWord[i].length() > max) {
                max = arrWord[i].length();
                index = i;
            }
        }
        return arrWord[index];
    }
}

