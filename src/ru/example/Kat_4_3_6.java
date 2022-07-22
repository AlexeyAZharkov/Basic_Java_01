package ru.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Kat_4_3_6 {
    public static void main(String... args) {

    }

    public static void logging() {
        final Logger LOGGER = Logger.getLogger("com.javamentor.logging.Test");
        LOGGER.log(Level.INFO, "Все хорошо");
        LOGGER.warning("Произошла ошибка");
    }
}
/**
 * Создайте в статичном публичном методе logging логгер
 * с именем com.javamentor.logging.Test, залогируйте им два сообщения: первое "Все хорошо"
 * с уровнем INFO и второе "Произошла ошибка" с уровнем WARNING.
 */