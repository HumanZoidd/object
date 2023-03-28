package lesson_1;

import java.util.Objects;

public class Book {
    private final String nameBook;
    private int yearOfPublication;
    private final Author author;
    public Book(String nameBook, int yearOfPublication, Author author) {
        this.nameBook = nameBook;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }
    public String getNameBook() {
        return nameBook;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public Author getAuthor() {
        return author;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author);
    }
}
