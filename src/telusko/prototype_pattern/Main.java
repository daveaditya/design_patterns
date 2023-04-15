package telusko.prototype_pattern;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        // Shallow copying
        BookShop bookShop = new BookShop();
        bookShop.setShopName("AtoZ Books");
        bookShop.loadBooksData();
        bookShop.getBooks().remove(3);

        System.out.println(bookShop);

        System.out.println("\n\n");

        BookShop newBookShop = (BookShop) bookShop.clone();
        newBookShop.setShopName("SS Books");
        System.out.println(newBookShop);

        System.out.println("\n\n");

        System.out.println("Old BookShop: " + System.identityHashCode(bookShop));
        System.out.println("New BookShop: " + System.identityHashCode(newBookShop));

        // Deep Cloning
        BookShop bookShop1 = new BookShop();
        bookShop1.setShopName("AtoZ Books");
        bookShop1.loadBooksData();
        BookShop newBookShop1 = bookShop1.makeClone();
        newBookShop.setShopName("SS Books");

        System.out.println("\n\n");

        bookShop1.getBooks().remove(3);
        System.out.println(bookShop1);
        System.out.println(newBookShop1);

    }

}
