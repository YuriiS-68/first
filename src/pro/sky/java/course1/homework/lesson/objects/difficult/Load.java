package pro.sky.java.course1.homework.lesson.objects.difficult;

import pro.sky.java.course1.homework.lesson.objects.minimal.Author;
import pro.sky.java.course1.homework.lesson.objects.minimal.Book;

import java.util.Arrays;

public class Load {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        Library library = new Library(books);

        Author author1 = new Author("Arthur", "Conan Doyle");
        Author author2 = new Author("Jo", "Nesbo");

        Book book1 = new Book("The Adventurse of Sherlock Holmes", author1, 1892);
        Book book2 = new Book("The kingdom", author2, 2020);

        System.out.println(Arrays.toString(library.addBooks(book1)));
        library.printBooks(library);
        System.out.println(library.printInfoBook(book1.getNameBook()));
        library.changeYearPublishing(book1.getNameBook(), 2020);
        System.out.println(library.printInfoBook(book1.getNameBook()));
    }
}
