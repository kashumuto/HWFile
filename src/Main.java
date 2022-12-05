import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("D:\\pro\\java\\month3\\FileHW\\oldFile.txt");
            Scanner scanner = new Scanner(fileReader);
            int i = 1;
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
                i++;
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fileReader = new FileReader("D:\\pro\\java\\month3\\FileHW\\newFile.txt");
            Scanner scanner = new Scanner(fileReader);

            int i = 1;
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                if (text.contains(" ")) {
                    String replace = text.replace(" ","");
                    text = replace;
                }
//                System.out.println(scanner.nextLine());
                System.out.println(text);
                i++;
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // ТУТ МЫ ОЧИШАЕМ ФАЙЛ!!
//        String fileName = "D:\\pro\\java\\month3\\FileHW\\oldFile.txt";

//        try {
//            FileOutputStream  fos = new FileOutputStream(fileName, false);
//            System.out.println("файл был очишен!");
//        }catch (IOException e) {
//            e.getMessage();
//        }

    }
}
