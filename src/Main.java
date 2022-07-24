public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter", "J. Rowling", 100, "ENG");
        System.out.println(book1.author + "\n" + book1.title + "\n" + book1.language + "\n" + book1.pages);
    }
}
