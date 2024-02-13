package _1_BookStore;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        LocalTime time = LocalTime.of(0, 0, 0);
        LocalTime countDown = LocalTime.of(0, 0, 5);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("s");
        OnlineBookStore a = new OnlineBookStore();
        System.out.println("======= '' WELCOME TO NOMADS' BOOK STORE ''=======");
        while (true) {
            boolean exit1 = true;
            int choice = 0;
            while (exit1) {

                try {
                    System.out.println("\n=================MENU==================");
                    System.out.println("||  ENTER 1 TO LIST A NEW BOOK       ||\n||  ENTER 2 TO REMOVE A BOOK         ||\n||  ENTER 3 TO LIST UP ALL THE BOOKS ||\n||  ENTER 4 TO EXIT                  ||");
                    System.out.print("|| =======>   ");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    if (choice < 1 || choice > 4) {
                        System.out.println("ENTER 1,2 3 OR 4....");
                    } else {
                        exit1 = false;
                    }
                } catch (Exception e) {
                    System.out.println("ENTER A VALID NUMBER");
                    scanner.nextLine();
                }
            }
            switch (choice) {
                case 1:
                    a.addBook();
                    break;
                case 2:
                    a.removeBook();
                    break;
                case 3:
                    a.listBook();
                    break;
                case 4:
                    while (time.isBefore(countDown)) {
                        countDown = countDown.minusSeconds(1);
                        Thread.sleep(1000);
                        System.out.print("\rPROGRAM TERMINATED IN " + countDown.format(formatter) + "..");

                    }
                    return;
            }
        }
    }
}
