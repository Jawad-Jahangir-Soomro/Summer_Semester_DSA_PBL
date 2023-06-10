import java.util.List;

public class Problem1Solver {
    private LinkedQueue earthquakeQueue;

    public Problem1Solver() {
        earthquakeQueue = new LinkedQueue();
    }

    public void findLargestEarthquakes(List<EarthquakeData> dataList) {
        int startYear = 2009;
        int endYear = 2013;

        for (int year = startYear; year <= endYear; year++) {
            EarthquakeData largestEarthquake = null;
            double maxMagnitude = Double.MIN_VALUE;

            for (EarthquakeData data : dataList) {
                if (data.getYear() == year && data.getMagnitude() > maxMagnitude) {
                    maxMagnitude = data.getMagnitude();
                    largestEarthquake = data;
                }
            }

            if (largestEarthquake != null) {
                earthquakeQueue.add(largestEarthquake);
            }
        }
    }

    public void displayLargestEarthquakes() {
        System.out.println("Largest earthquakes between 2009 and 2013:");

        while (!earthquakeQueue.isEmpty()) {
            EarthquakeData earthquake = (EarthquakeData) earthquakeQueue.remove();
            System.out.println("Year: " + earthquake.getYear() + ", Magnitude: " + earthquake.getMagnitude() +
                    ", Country: " + earthquake.getCountry());
        }
    }
}
