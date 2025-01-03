package src;

public class LabSeven{
    public static void main(String[] args){

        Libray lib = new Libray();
        lib.addBook(new Book("Властелин колец", "Джон Рональд Руэл Толкин", 1954));
        lib.addBook(new Book("Две башни", "Джон Рональд Руэл Толкин", 1954));
        lib.addBook(new Book("Возвращение короля", "Джон Рональд Руэл Толкин", 1955));
        lib.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков", 1967));
        lib.addBook(new Book("Собачье сердце", "Михаил Булгаков", 1925));
        lib.addBook(new Book("Братья Карамазовы", "Федор Достоевский", 1880));
        lib.addBook(new Book("Идиот", "Федор Достоевский", 1869));
        lib.addBook(new Book("Преступление и наказание", "Федор Достоевский", 1866));
        lib.addBook(new Book("Анна Каренина", "Лев Толстой", 1878));
        lib.addBook(new Book("Война и мир", "Лев Толстой", 1869));

        lib.removeBook("Две башни");
        lib.findBookByAuthor("Джон Рональд Руэл Толкин").printAllBooks();
        System.out.println("                     ");
        lib.printAllBooks();
    }
}