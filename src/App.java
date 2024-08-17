public class App {
    public static void main(String[] args) {

        Author gromyko = new Author("Ольга ", "Громыко");
        System.out.println(gromyko.getName() + gromyko.getSurname());

        Author shevchenko = new Author("Ирина ", "Шевченко");
        System.out.println(shevchenko.getName() + shevchenko.getSurname());


        Book cybercanicles = new Book("Киберканикулы", gromyko, 2022);
        bookInformPrint(cybercanicles);

        Book islandOfNotGuilty = new Book("Остров невиновных", shevchenko, 2020);
        bookInformPrint(islandOfNotGuilty);

        cybercanicles.setYear(2023);

        bookInformPrint(cybercanicles);

    }

    public static void bookInformPrint(Book book) {
        System.out.println("Книга '" + book.getTitle() + "'. Автор " + book.getAuthor().getName() + book.getAuthor().getSurname()
                + ". Год выпуска " + book.getYear() + ".");

    }
}
