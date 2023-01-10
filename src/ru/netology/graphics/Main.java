package ru.netology.graphics;

import ru.netology.graphics.image.ColorSchema;
import ru.netology.graphics.image.GraphicsConverter;
import ru.netology.graphics.image.TextColorSchema;
import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.server.GServer;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new GraphicsConverter(); // Создайте тут объект вашего класса конвертера
        TextColorSchema schema = new ColorSchema();

//        converter.setMaxWidth(200);
//        converter.setMaxHeight(1000);
//        converter.setMaxRatio(2);

        converter.setTextColorSchema(schema);

        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

        // Или то же, но с выводом на экран:
        //String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
        //String imgTxt = converter.convert(url);
        //System.out.println(imgTxt);
    }
}
