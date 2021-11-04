package pro.sky.java.course1.homework.lesson.objects.minimal;

public class Load {
    public static void main(String[] args) {
        Author author1 = new Author("Arthur", "Conan Doyle");
        Author author2 = new Author("Jo", "Nesbo");

        Book book1 = new Book("The Adventurse of Sherlock Holmes.", author1, 1892);
        Book book2 = new Book("The kingdom.", author2, 2020);

        System.out.println("Name = " + book1.getNameBook() + " Author = " + book1.getAuthor().getFirstName() + " " +
                book1.getAuthor().getLastName() + " Year = " + book1.getYearPublication());
        System.out.println("Name = " + book2.getNameBook() + " Author = " + book2.getAuthor().getFirstName() + " " +
                book2.getAuthor().getLastName() + " Year = " + book2.getYearPublication());

        book1.setYearPublication(2018);

        System.out.println("Name = " + book1.getNameBook() + " Author = " + book1.getAuthor().getFirstName() + " " +
                book1.getAuthor().getLastName() + " Year = " + book1.getYearPublication());
    }
}
