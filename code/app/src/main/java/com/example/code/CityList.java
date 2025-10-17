package com.example.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a list of City objects.
 * <p>
 * The CityList class provides methods to add, remove, check, and count
 * cities within an internal list. It ensures no duplicate cities can be added.
 * </p>
 */
public class CityList {

    /** Internal list that stores City objects. */
    private List<City> cities = new ArrayList<>();

    /**
     * Adds a new City to the list if it does not already exist.
     *
     * @param city the City object to add
     * @throws IllegalArgumentException if the city already exists in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Returns a sorted list of cities.
     * <p>
     * The returned list is sorted alphabetically by city name.
     * </p>
     *
     * @return a sorted copy of the list of cities
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks if a given City is present in the list.
     *
     * @param city the City object to check for
     * @return true if the city exists in the list, false otherwise
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * Removes a specified City from the list if it exists.
     *
     * @param city the City object to remove
     * @throws IllegalArgumentException if the city does not exist in the list
     */
    public void delete(City city) {
        if (!cities.remove(city)) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Returns the number of cities currently in the list.
     *
     * @return the number of cities in the list
     */
    public int countCities() {
        return cities.size();
    }
}
