package ru.netology.graphics;

import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.server.GServer;

import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = null; // Создайте тут объект вашего класса конвертера

        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

        // Чтобы протестировать работу без сервера,
        // раскоментируйте секцию ниже и закомментируйте команду строки
        // работы с сервером выше
        /*
        PrintWriter fileWriter = new PrintWriter(new File("converted-image.txt"));
        converter.setMaxWidth(200);
        converter.setMaxHeight(300);
        fileWriter.write(converter.convert("https://raw.githubusercontent.com/netology-code/java-homeworks/blob/master/pics/simple-test.png"));
        fileWriter.close();
        */
    }
}
