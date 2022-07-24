public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.author = "J. Rowling";
        book1.language = "Eng";
        book1.pages = 101;
        book1.title = "Harry Potter";
        System.out.println(book1.author + "\n" + book1.title + "\n" + book1.language + "\n" + book1.pages);
    }
}
