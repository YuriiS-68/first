package pro.sky.java.course1.homework.lesson.objects.difficult;

import pro.sky.java.course1.homework.lesson.objects.minimal.Author;
import pro.sky.java.course1.homework.lesson.objects.minimal.Book;

import java.util.Arrays;

public class Load {
    public static void main(String[] args) {
        Book[] books = new Book[2];

        System.out.println("Authors:");
        Author conanDoyle = new Author("Arthur", "Conan Doyle");
        Author conanDoyle2 = new Author("Arthur", "Conan Doyle");
        Author joNesbo = new Author("Jo", "Nesbo");
        System.out.println("Author copies equal: " + conanDoyle.equals(conanDoyle2));
        System.out.println("Author copies equal by hashCode: " + (conanDoyle.hashCode() == conanDoyle2.hashCode()));
        System.out.println("Author equal: " + conanDoyle.equals(joNesbo));
        System.out.println("Author equal by hashCode: " + (conanDoyle.hashCode() == joNesbo.hashCode()));
        System.out.println(conanDoyle);
        System.out.println(joNesbo);

        System.out.println("==============================");

        System.out.println("Books:");
        Book theAdventuresOfSherlockHolmes = new Book("The Adventures of Sherlock Holmes", conanDoyle, 1892);
        Book theKingdom = new Book("The kingdom", joNesbo, 2020);
        Book theKingdom2 = new Book("The kingdom", joNesbo, 2020);
        System.out.println("Book copies equal: " + theKingdom.equals(theKingdom2));
        System.out.println("Book copies equal by hashCode: " + (theKingdom.hashCode() == theKingdom2.hashCode()));
        System.out.println("Book equal: " + theKingdom.equals(theAdventuresOfSherlockHolmes));
        System.out.println("Book equal by hashCode: " + (theKingdom.hashCode() == theAdventuresOfSherlockHolmes.hashCode()));
        System.out.println(theKingdom);
        System.out.println(theAdventuresOfSherlockHolmes);

        System.out.println("==============================");

        Library library = new Library(books);
        library.addBooks(theKingdom);
        library.addBooks(theAdventuresOfSherlockHolmes);
        System.out.println(library);
    }
}
