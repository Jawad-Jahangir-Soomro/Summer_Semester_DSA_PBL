import java.util.HashMap;
import java.util.List;

public class Problem2Solver {
    private HashMap<String, LinkedStack> countryStackMap;

    public Problem2Solver() {
        countryStackMap = new HashMap<>();
    }

    public void findRecentEarthquakes(List<EarthquakeData> dataList) {
        for (EarthquakeData data : dataList) {
            String country = data.getCountry();
            LinkedStack countryStack = countryStackMap.getOrDefault(country, new LinkedStack());

            if (countryStack.size() < 5) {
                countryStack.push(data);
            } else {
                countryStack.pop();
                countryStack.push(data);
            }

            countryStackMap.put(country, countryStack);
        }
    }

    public void displayRecentEarthquakes() {
        System.out.println("Recent 5 earthquakes from each country:");

        for (String country : countryStackMap.keySet()) {
            LinkedStack countryStack = countryStackMap.get(country);

            System.out.println("Country: " + country);
            while (!countryStack.isEmpty()) {
                EarthquakeData earthquake = (EarthquakeData) countryStack.pop();
                System.out.println("Year: " + earthquake.getYear() + ", Magnitude: " + earthquake.getMagnitude());
            }
            System.out.println();
        }
    }

    public HashMap<String, LinkedStack> getCountryStackMap() {
        return countryStackMap;
    }
}
