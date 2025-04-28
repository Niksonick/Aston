package Module2.Task3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReadWriteExample {
    public static void writeToFile(String filename, String content) throws FileOperationException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filename))) {
            writer.write(content);
            System.out.println("Данные успешно записаны в файл: " + filename);
        } catch (IOException e) {
            throw new FileOperationException("Ошибка записи в файл: " + filename, e);
        }
    }

    public static String readFromFile(String filename) throws FileOperationException {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filename)));
            System.out.println("Данные успешно прочитаны из файла: " + filename);
            return content;
        } catch (IOException e) {
            throw new FileOperationException("Ошибка чтения из файла: " + filename, e);
        }
    }
}

