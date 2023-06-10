import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    private String filePath;

    public CSVReader(String filePath) {
        this.filePath = filePath;
    }

    public List<EarthquakeData> readData() {
        List<EarthquakeData> dataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true;  // Skip the header line
            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                String[] values = line.split(",");
                if (values.length == 3) {
                    int year = Integer.parseInt(values[0]);
                    String country = values[1];
                    double magnitude = Double.parseDouble(values[2]);

                    EarthquakeData data = new EarthquakeData(year, country, magnitude);
                    dataList.add(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataList;
    }
}
