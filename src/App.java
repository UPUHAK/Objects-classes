public class App {
    public static void main(String[] args) {

        Author gromyko = new Author("Ольга ", "Громыко");
        System.out.println(gromyko);

        Author shevchenko = new Author("Ирина ", "Шевченко");
        System.out.println(shevchenko);


        Book cybercanicles = new Book("Киберканикулы", gromyko, 2022);
        System.out.println(cybercanicles);

        Book islandOfNotGuilty = new Book("Остров невиновных", shevchenko, 2020);
        System.out.println(islandOfNotGuilty);

        cybercanicles.setYear(2023);

        System.out.println(cybercanicles);

    }


}
