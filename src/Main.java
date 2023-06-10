import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader("data.csv");
        List<EarthquakeData> dataList = csvReader.readData();

        // To Run Problem 1 UnComment the below Code

//        Problem1Solver problem1Solver = new Problem1Solver();
//        problem1Solver.findLargestEarthquakes(dataList);
//        problem1Solver.displayLargestEarthquakes();

        // To Run Problem 2 UnComment the below Code

//        Problem2Solver problem2Solver = new Problem2Solver();
//        problem2Solver.findRecentEarthquakes(dataList);
//        problem2Solver.displayRecentEarthquakes();

        // To Run Problem 3 UnComment the below Code

//        Problem2Solver problem2Solver = new Problem2Solver();
//        problem2Solver.findRecentEarthquakes(dataList);
//        HashMap<String, LinkedStack> countryStackMap = problem2Solver.getCountryStackMap();
//
//        List<LinkedStack> countryStacks = new ArrayList<>(countryStackMap.values());
//
//        Problem3Solver problem3Solver = new Problem3Solver();
//        problem3Solver.findMostRecentEarthquakesAboveMagnitude(countryStacks);
//        problem3Solver.displayMostRecentEarthquakesAboveMagnitude();

    }
}