package pro.sky.java.course1.homework.lesson.objects.middle;

import pro.sky.java.course1.homework.lesson.objects.minimal.Book;

public class BooksUtility {
    public static Book[] addBook(Book book, Book[] bookCase){
        for (int i = 0; i < bookCase.length; i++) {
            if (bookCase[i] == null){
                bookCase[i] = book;
                break;
            }

            if (bookCase[i] != null && i == bookCase.length - 1){
                System.err.println("Bookcase is full");
            }
        }
        return bookCase;
    }

    public static String printBooks(Book[] bookCase){
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;

        for (Book book : bookCase) {
            if (book != null) {
                stringBuilder.append(book.getAuthor().getFirstName());
                stringBuilder.append(" ");
                stringBuilder.append(book.getAuthor().getLastName());
                stringBuilder.append(": ");
                stringBuilder.append(book.getNameBook());
                stringBuilder.append(": ");
                stringBuilder.append(book.getYearPublication()).append("\n");
            }
            if (book == null){
                System.out.println("Cell under number " + count + " is empty.");
            }
            count++;
        }
        return stringBuilder.toString();
    }
}
