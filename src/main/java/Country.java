import java.util.Objects;

public class Country {
    private final String name;
    private final String code;
    private final Integer population;

    public Country(String name, String code, Integer population) {
        this.name = name;
        this.code = code;
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Country country = (Country) o;
        return Objects.equals(name, country.name) && Objects.equals(code, country.code) && Objects.equals(population, country.population);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, population);
    }

    @Override
    public String toString() {
        return name + " (" + code + ") ma " + population + " ludności.";
    }
}