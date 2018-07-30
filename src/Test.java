import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Book[] books = new Book[3];

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj tytuł książki: ");
        String input1 = scan.nextLine();
        System.out.println("Podaj liczbę stron: ");
        int input2 = scan.nextInt();
        scan.nextLine();
        books[0] = new Book(input1, input2);
        System.out.println("Książka " + books[0].getTitle() + " została dodana.");

        int i = 1;
        while (i < books.length){
            System.out.println("Podaj tytuł książki: ");
            String input3 = scan.nextLine();
            System.out.println("Podaj liczbę stron: ");
            int input4 = scan.nextInt();
            scan.nextLine();

            Book testBook = new Book(input3, input4);

            boolean isDuplicate = false;
            for (int j = 0; j < books.length ; j++) {
                if(testBook.equals(books[j])){
                    System.out.println("Duplikat. Ponów próbę dodania");
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate){
                books[i] = testBook;
                System.out.println("Książka " + books[i].getTitle() + " została dodana.");
                i++;
            }
        }

    }
}
