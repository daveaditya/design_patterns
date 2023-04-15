package telusko.prototype_pattern;


import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

    private String shopName;
    private List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadBooksData() {
        for (int i = 0; i < 10; i++) {
            Book book = new Book();
            book.setbId(i);
            book.setbName("Book " + i);
            this.books.add(book);
        }
    }

    public BookShop makeClone() {
        BookShop newBookShop = new BookShop();
        newBookShop.getBooks().addAll(this.getBooks());
        return newBookShop;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
