package pl.javastart.library.io;

import pl.javastart.library.model.Book;
import pl.javastart.library.model.LibraryUser;
import pl.javastart.library.model.Magazine;

import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);
    private ConsolePrinter printer;

    public DataReader(ConsolePrinter printer) {
        this.printer = printer;
    }

    public Book readAndCreateBook() {
        printer.printLine("Tytuł:");
        String title = sc.nextLine();
        printer.printLine("Autor:");
        String author = sc.nextLine();
        printer.printLine("Rok wydania:");
        int releaseDate = getInt();
        printer.printLine("Liczba stron:");
        int pages = getInt();
        printer.printLine("Wydawca:");
        String publisher = sc.nextLine();
        printer.printLine("Numer ISBN:");
        String isbn = sc.nextLine();
        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazine() {
        printer.printLine("Tytuł:");
        String title = sc.nextLine();
        printer.printLine("Wydawca:");
        String publisher = sc.nextLine();
        printer.printLine("Język:");
        String language = sc.nextLine();
        printer.printLine("Rok wydania:");
        int year = getInt();
        printer.printLine("Miesiąc:");
        int month = getInt();
        printer.printLine("Dzień:");
        int day = getInt();
        return new Magazine(title, publisher, language, year, month, day);
    }
    public LibraryUser createLibraryUser(){
        printer.printLine("Imię: ");
        String firstName = sc.nextLine();
        printer.printLine("Nazwisko: ");
        String lastName = sc.nextLine();
        printer.printLine("PESEL: ");
        String pesel = sc.nextLine();
        return new LibraryUser(firstName,lastName,pesel);
    }

    public int getInt() {
        try {
            return sc.nextInt();
        } finally {
            sc.nextLine();
        }
    }

    public String getString() {
        return sc.nextLine();
    }

    public void closeScanner() {
        sc.close();
    }
}
