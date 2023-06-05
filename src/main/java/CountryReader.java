import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountryReader {
    public Map<String, Country> readCountries(String fileName) throws IOException {
        Map<String, Country> countryHashMap = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(";");
                String code = strings[0];
                String name = strings[1];
                Integer population = Integer.valueOf(strings[2]);
                Country country = new Country(name, code, population);
                countryHashMap.put(code, country);
            }
        }
        return countryHashMap;
    }
}
