package lesson_1;
public class Main {

    public static void main(String[] args) {
        Book book = new Book("Post Stamp", 2018, new Author("Charles", "Bukowski"));
        Book book2 = new Book("Post Stamp", 2016, new Author("Charles", "Bukowski"));
        System.out.println(book.equals(book2));
        System.out.println(book);
        System.out.println(book2);
    }
}
