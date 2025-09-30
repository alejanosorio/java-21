package estructuraDatos;

import java.util.HashMap;

public class maps {

    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Argentina", "Bs As");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities.values());
    }
}
