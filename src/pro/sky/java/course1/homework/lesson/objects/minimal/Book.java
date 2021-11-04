package pro.sky.java.course1.homework.lesson.objects.minimal;

import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int yearPublication;

    public Book(String nameBook, Author author, int yearPublication){
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yearPublication);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author=" + author +
                ", yearPublication=" + yearPublication +
                '}';
    }
}
