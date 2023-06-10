# Earthquake Data Analysis

This project focuses on analyzing earthquake data from a CSV file. It solves three problems related to earthquake information using custom queue and stack implementations.

## Project Structure

The project consists of the following components:

1. `CSVReader`: A class responsible for reading earthquake data from a CSV file and creating a list of `EarthquakeData` objects.
2. `EarthquakeData`: A class representing the data of a single earthquake, including the year, country, and magnitude.
3. `LinkedQueue`: A custom implementation of a queue data structure used in Problem 1.
4. `Problem1Solver`: A class that solves Problem 1 by finding the biggest earthquake for each year between 2009 and 2013 and storing them in a queue.
5. `LinkedStack`: A custom implementation of a stack data structure used in Problem 2.
6. `Problem2Solver`: A class that solves Problem 2 by storing the most recent 5 earthquakes from each country in separate stacks.
7. `Problem3Solver`: A class that solves Problem 3 by creating a linked list of the most recent earthquakes with a magnitude above 6 from each country.

## Usage

1. Ensure you have Java and a suitable development environment set up.
2. Place your earthquake data CSV file in the project directory.
3. Update the file path in the `Main` class to point to your CSV file.
4. Compile and run the `Main` class to execute the program.

## Problem Solutions

### Problem 1: Biggest Earthquakes between 2009 and 2013

The solution involves iterating over yearly earthquake collections from 2009 to 2013, finding the earthquake with the highest magnitude for each year, and enqueuing the earthquake data (magnitude and country) into a queue.

### Problem 2: Recent 5 Earthquakes from Each Country

The solution creates a stack for each country to store earthquake data. It traverses the yearly earthquake collections and pushes earthquake data onto the corresponding country's stack. The process is repeated for each country.

### Problem 3: Most Recent Earthquakes above 6 Magnitude

The solution creates a linked list to store the most recent earthquake from each country. It traverses the country stacks and creates a node in the linked list for each earthquake with a magnitude above 6. The new node is set as the head of the linked list.

## Conclusion

This project demonstrates how to read earthquake data from a CSV file, implement custom queue and stack data structures, and solve various problems related to earthquake analysis. By following the instructions in the usage section, you can run the program and observe the solutions to the three given problems.
