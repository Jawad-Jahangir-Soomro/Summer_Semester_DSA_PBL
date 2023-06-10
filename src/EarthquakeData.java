public class EarthquakeData {
    private int year;
    private String country;
    private double magnitude;

    public EarthquakeData(int year, String country, double magnitude) {
        this.year = year;
        this.country = country;
        this.magnitude = magnitude;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public double getMagnitude() {
        return magnitude;
    }
}
