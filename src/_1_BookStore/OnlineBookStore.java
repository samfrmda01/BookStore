package _1_BookStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OnlineBookStore {
    private final ArrayList<Book> kitapListesi = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void addBook() {

        System.out.print("\nENTER THE NAME OF YOUR BOOK====>");
        String name = scanner.nextLine();
        System.out.print("ENTER AUTHOR====================>");
        String author = scanner.nextLine();
        double price = 0;
        boolean exit = true;
        while (exit) {
            try {
                System.out.print("ENTER PRICE======================>");
                price = scanner.nextDouble();
                exit = false;
            } catch (Exception e) {
                System.out.println("!!====>ENTER A VALID NUMBER<====!!");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        int year = 0;
        boolean exit2 = true;
        while (exit2) {
            try {
                System.out.print("ENTER PUBLISHING DATE==============>");
                year = scanner.nextInt();
                exit2 = false;
            } catch (Exception e) {
                System.out.println("!!!ENTER A VALID NUMBER!!!");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        Book a = new Book(name, author, price, year);
        kitapListesi.add(a);
        System.out.println();
        System.out.println(a.getNameOfBook().toUpperCase() + " IS NOW AVAILABLE IN THE LIST\nUNIQUE ID===>" + a.getBookNo());
    }

    public void removeBook() {
        boolean exit3 = true;
        int uId = 0;
        if (!kitapListesi.isEmpty()) {
            while (exit3) {
                try {
                    System.out.print("ENTER UNIQUE ID====>");
                    uId = scanner.nextInt();
                    scanner.nextLine();
                    exit3 = false;
                } catch (Exception e) {
                    System.out.println("!!!ENTER A VALID NUMBER!!!");
                }
            }
            Iterator<Book> iterator = kitapListesi.iterator();
            boolean found = false;

            while (iterator.hasNext()) {
                Book a = iterator.next();
                if (a.getBookNo() == uId) {
                    System.out.println(a.getNameOfBook().toUpperCase() + " HAS BEEN REMOVED OFF THE LIST.");
                    iterator.remove();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("!!!THE BOOK YOU ARE LOOKING FOR IS NOT FOUND IN THE LIST!!!");
            }
        } else {
            System.out.println("!!!THERE IS NO BOOK IN THE LIST!!!");
        }
    }

    public void listBook() throws InterruptedException {
        if (!kitapListesi.isEmpty()) {
            for (Book x : kitapListesi) {
                System.out.println("\nBOOK=>" + x.getNameOfBook().toUpperCase() + "\nAUTHOR=>" + x.getAuthor().toUpperCase() + "\nPUBLISHING YEAR=>" + x.getPublishingDate() + "\nPRICE=>" + x.getPrice() + "$");
            }
            Thread.sleep(3000);
        } else System.out.println("!!!THERE IS NO BOOK FOUND IN THE LIST!!!");

    }
}

