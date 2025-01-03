package src;

import java.util.ArrayList;

public class Libray {
    private ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book){
        this.books.add(book);
    }

    public void removeBook(String title){
        for (Book book : books){
            if (book.getTitle().equals(title)){
                this.books.remove(book);
                break;
            }
        }
    }

    public Libray findBookByAuthor(String author){
        Libray output = new Libray();
        for (Book book:books){
            if (book.getAuthor().equals(author)){
                output.addBook(book);
            }
        }
        return output;
    }

    public void printAllBooks(){
        for (Book book:books){
            System.out.println(book.toString());}
    }
}