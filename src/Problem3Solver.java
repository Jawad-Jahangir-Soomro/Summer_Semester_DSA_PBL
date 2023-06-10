import java.util.LinkedList;
import java.util.List;

public class Problem3Solver {
    private LinkedList<EarthquakeData> recentEarthquakesList;

    public Problem3Solver() {
        recentEarthquakesList = new LinkedList<>();
    }

    public void findMostRecentEarthquakesAboveMagnitude(List<LinkedStack> countryStacks) {
        for (LinkedStack countryStack : countryStacks) {
            while (!countryStack.isEmpty()) {
                EarthquakeData earthquake = (EarthquakeData) countryStack.pop();
                if (earthquake.getMagnitude() > 6) {
                    recentEarthquakesList.addFirst(earthquake);
                    break;
                }
            }
        }
    }

    public void displayMostRecentEarthquakesAboveMagnitude() {
        System.out.println("Most recent earthquakes above 6 magnitude:");

        for (EarthquakeData earthquake : recentEarthquakesList) {
            System.out.println("Year: " + earthquake.getYear() + ", Country: " + earthquake.getCountry() +
                    ", Magnitude: " + earthquake.getMagnitude());
        }
    }
}
