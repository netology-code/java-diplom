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

        // Или то же, но с сохранением в файл:
        String url = "https://i.ibb.co/bXPpzFL/Screenshot-from-2021-11-04-20-05-30.png";
        String imgTxt = converter.convert(url);
        System.out.println(imgTxt);
    }
}
