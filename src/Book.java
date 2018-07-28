import java.util.Objects;

public class Book {
    private String title;
    private int numberOfpages;

    public Book(String title, int numberOfpages) {
        this.title = title;
        this.numberOfpages = numberOfpages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfpages() {
        return numberOfpages;
    }

    public void setNumberOfpages(int numberOfpages) {
        this.numberOfpages = numberOfpages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfpages == book.numberOfpages &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, numberOfpages);
    }
}
