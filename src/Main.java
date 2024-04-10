public class Main {
    public static void main(String[] args) {
    Author author1 = new Author("Джордж", "Оруэлл");
    Book book1 = new Book("1984", 1949,author1);
    Author author2 = new Author("Джек", "Лондон");
    Book book2 = new Book("Мартин Иден", 2024,author2);

        System.out.println("Год публикации: " + book2.getPublicationYear());

        book2.setPublicationYear(1909);
        System.out.println("Год публикации: " + book2.getPublicationYear());
        System.out.println("Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());
    }
}