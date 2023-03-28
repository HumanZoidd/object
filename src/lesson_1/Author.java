package lesson_1;

import java.util.Objects;

public class Author {
    private final String firstNameAuthor;
    private final String secondNameAuthor;
    public Author(String firstNameAutor, String secondNameAuthor) {
        this.firstNameAuthor = firstNameAutor;
        this.secondNameAuthor = secondNameAuthor;
    }
    public String getFirstName() {
        return firstNameAuthor;
    }
    public String getSecondName() {
        return secondNameAuthor;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "firstNameAuthor='" + firstNameAuthor + '\'' +
                ", secondNameAuthor='" + secondNameAuthor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author autor = (Author) o;
        return Objects.equals(firstNameAuthor, autor.firstNameAuthor) && Objects.equals(secondNameAuthor, autor.secondNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameAuthor, secondNameAuthor);
    }
}
