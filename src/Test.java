import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Book[] books = new Book[3];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < books.length; i++) {
            System.out.println("Podaj tytuł książki: ");
            String input1 = scan.nextLine();
            System.out.println("Podaj liczbę stron: ");
            int input2 = scan.nextInt();
            scan.nextLine();

            Book testBook = new Book(input1, input2);

            if (!Book.contains(testBook, books)) {
                books[i] = testBook;
            } else {
                System.out.println("Duplikat. Ponów próbę dodania");
                i--;
            }
        }

        String description = Arrays.toString(books);
        System.out.println(description);

    }
}
