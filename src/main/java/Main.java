import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        main.run(scanner);
    }

    void run(Scanner scanner) {
        CountryReader countryReader = new CountryReader();
        try {
            HashMap<String, Country> countryHashMap = countryReader.readCountries("countries.csv");
            System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje:");
            String countryName = scanner.nextLine().toUpperCase();
            if (countryHashMap.containsKey(countryName)) {
                Country country = countryHashMap.get(countryName);
                System.out.println(country);
            } else {
                System.out.println("Kod kraju " + countryName + " nie został znaleziony.");
            }
        } catch (IOException e) {
            System.out.println("Brak pliku countries.csv.");
        }
        scanner.close();
    }

}
