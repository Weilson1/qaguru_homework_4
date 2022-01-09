package guru.qa;

public class Book {
    String name;
    int totalPages;
    String coverColor;
    int yearOfPublishing;
    String author;
    int openPage;

    public void findName() {
        System.out.println(name);
    }
    public void findTotalPages() {
        System.out.println(totalPages);
    }
    public void findColor() {
        System.out.println(coverColor);
    }
    public void findAuthor() {
        System.out.println(author);
    }
    public void openBook(){
        openPage = (int) (1 + Math.random()*(totalPages + 1));
        System.out.println(openPage);
    }
    public void findYear(){
        System.out.println(yearOfPublishing);
    }
}
