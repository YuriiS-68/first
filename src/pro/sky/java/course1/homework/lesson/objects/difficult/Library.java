package pro.sky.java.course1.homework.lesson.objects.difficult;

import pro.sky.java.course1.homework.lesson.objects.minimal.Book;

public class Library {
    private final Book[] bookCase;

    public Library(Book[] bookCase){
        this.bookCase = bookCase;
    }

    public String printInfoBook(String name){
        StringBuilder stringBuilder = new StringBuilder();

        for (Book book : bookCase) {
            if (book != null && name.equals(book.getNameBook())) {
                stringBuilder.append(book.getNameBook()).append(" was published in ").append(book.getYearPublication());
            }
        }
        return stringBuilder.toString();
    }

    public void changeYearPublishing(String name, int newDate){
        for (Book book : bookCase) {
            if (book != null && name.equals(book.getNameBook())) {
                book.setYearPublication(newDate);
            }
        }
    }

    public Book[] addBooks(Book book){
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

    public String printBooks(Library library) {
        StringBuilder stringBuilder = new StringBuilder();

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
        }
        return stringBuilder.toString();
    }
}
