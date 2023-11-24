package homeTask11;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) {
        // Создание папки
        File directory = new File("myDirectory");
        if (directory.exists()) {return;}
        directory.mkdir();
        System.out.println("Папка создана");

        // Создание двух файлов внутри папки
        File file1 = new File(directory, "file1.txt");
        File file2 = new File(directory, "file2.txt");

        try {
            if (file1.createNewFile()) {
                System.out.println("file1");
            }
            if (file2.createNewFile()) {
                System.out.println("file2");
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
        // Запись фразы в файл 1
        try (FileWriter writer = new FileWriter(file1)) {
            writer.write("Java world");
            System.out.println("Фраза записана в файл 1");
        } catch (IOException e) {
            throw new RuntimeException();
        }
        // Чтение из файла 1 и запись в файл 2
        try (FileReader fileReader = new FileReader(file1);
             FileWriter fileWriter = new FileWriter(file2)) {
            char[] storage = new char[1024];
            int bytesRead;

            while ((bytesRead = fileReader.read(storage)) != -1) {
                fileWriter.write(storage, 0, bytesRead);
            }
            System.out.println("Из файла 1 скопировано в файл 2");
        } catch (IOException e) {
            throw new RuntimeException();
        }

        // Удаление файлов и папки
        if (file1.delete()) {
            System.out.println("Файл 1 удален");
        }
        if (file2.delete()) {
            System.out.println("Файл 2 удален");
        }
        if (directory.delete()) {
            System.out.println("Папка удалена");
        }
    }
}
