package hw001.task003;

/*
Задание 3
Используя IDEA, создайте проект c пакетом.
Требуется: Создать класс Book(Main). Создать классы Title, Author и Content, каждый из которых должен
содержать одно строковое поле и метод void show (). Реализуйте возможность добавления в книгу
названия книги, имени автора и содержания. Выведите на экран при помощи метода show() название
книги, имя автора и Содержание.
 */

public class Main {
    public static void main(String[] args) {
        Author author = new Author();
        Title title = new Title();
        Content content = new Content();
        Book book = new Book();

        author.authorsName = "Den Brown";
        title.title = "Angels & Demons";
        content.content = "This is an attractive and fantastic detective story";

        book.author = author;
        book.title = title;
        book.content = content;

        book.author.show();
        book.title.show();
        book.content.show();
    }
}