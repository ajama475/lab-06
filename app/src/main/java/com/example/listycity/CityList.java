package com.example.listycity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that defines a CityList.
 */
public class CityList {
    private List<City> cities = new ArrayList();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     *
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */

    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Deletes a city from the list if it exists
     * @param city
     * @throws IllegalArgumentException
     * if the city is not in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Counts the number of cities in the list
     * @return
     * the number of cities
     */
    public int countCities() {
        return cities.size();
    }


}
