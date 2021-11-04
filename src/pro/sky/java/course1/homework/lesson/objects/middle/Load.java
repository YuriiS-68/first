package pro.sky.java.course1.homework.lesson.objects.middle;

import pro.sky.java.course1.homework.lesson.objects.minimal.Author;
import pro.sky.java.course1.homework.lesson.objects.minimal.Book;

public class Load {
    public static void main(String[] args) {
        Author author1 = new Author("Arthur", "Conan Doyle");
        Author author2 = new Author("Jo", "Nesbo");

        Book book1 = new Book("The Adventurse of Sherlock Holmes", author1, 1892);
        Book book2 = new Book("The kingdom", author2, 2020);

        Book[] bookCase = new Book[5];

        BooksUtility.addBook(book1, bookCase);
        BooksUtility.addBook(book1, bookCase);
        BooksUtility.addBook(book1, bookCase);
        BooksUtility.addBook(book1, bookCase);
        BooksUtility.addBook(book2, bookCase);
        BooksUtility.addBook(book1, bookCase);
        BooksUtility.addBook(book2, bookCase);

        System.out.println(BooksUtility.printBooks(bookCase));
    }
}
