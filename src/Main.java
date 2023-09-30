import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Исходный двухмерный массив по книгам и авторам
        String[][] listOfBooksAndAuthors = {
                {"Книга 1"}, {"Имя1 Отчество1 Фамилия1"},
                {"Книга 2"}, {"Имя2 Отчество2 Фамилия2"},
                {"Книга 3"}, {"Имя3 Отчество3 Фамилия3"}
        };

        // Использование класса StringBuilder построения строки (добавление автора к концу названия книги)
        StringBuilder stringBuilder = new StringBuilder();

        // Объявление цикла с шагом i += 2 (на каждой итерации будут обработаны 2 последовательных элемента массива - информация о книге и об авторе)
        for (int i = 0; i < listOfBooksAndAuthors.length; i += 2) {
            // Получение названия книги
            String book = listOfBooksAndAuthors[i][0];

            // Получение автора
            String author = listOfBooksAndAuthors[i + 1][0];

            // Добавление к названию книги имени автора и перевод на новую строку
            stringBuilder.append("\"").append(book).append("\" ").append(author).append(System.lineSeparator());
        }

        // Объявление переменной с результатом и ее приведение к строке
        String result = stringBuilder.toString();

        // Вывод результата
        System.out.println(result);
    }
}