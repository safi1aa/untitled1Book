import com.sun.tools.attach.VirtualMachine;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.name = "Villains Are Destined to Die";
        book.author = "Gwon Gyeoeul";
        book.year = 2020;
        Book.Book(book.name, book.author, book.year);
    }
}