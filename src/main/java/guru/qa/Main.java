package guru.qa;

public class Main {
    public static void main(String[] args){
        Book book = new Book();
        book.name = "Изучаем Java";
        book.totalPages = 720;
        book.coverColor = "Белый";
        book.yearOfPublishing = 2012;
        book.author = "Кэти Сьерра и Берт Бэйтс";

        book.findName();
        book.findTotalPages();
        book.findColor();
        book.findYear();
        book.findAuthor();
        book.openBook();

    }
}
