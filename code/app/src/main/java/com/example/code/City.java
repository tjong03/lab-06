package com.example.code;


/**  * This is a class that defines a City. */
public class City implements Comparable<City> {
    /** The name of the city. */
    private String city;
    /** The province that the city belongs to. */
    private String province;

    /**
     * Constructs a new City object with a specified name and province.
     *
     * @param name      the name of the city
     * @param province  the name of the province
     */
    public City(String name, String province) {
        this.city = name;
        this.province = province;
    }

    /**
     * Returns the name of the city.
     *
     * @return the city name
     */
    public String getName() {

        return city;
    }

    /**
     * Sets the name of the city.
     *
     * @param name the new name of the city
     */
    public void setName(String name) {
        this.city = name;
    }

    /**
     * Returns the name of the province the city belongs to.
     *
     * @return the province name
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the province of the city.
     *
     * @param province the new province name
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Compares this city to another city by their names.
     *
     * @param o the other City object to compare to
     * @return a negative integer, zero, or a positive integer
     *         if this city name is lexicographically less than,
     *         equal to, or greater than the specified city's name
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getName()); // this.city refers to the city name
    }

    /**
     * Checks if two City objects are equal.
     * <p>
     * Two cities are considered equal if both their names and provinces
     * are the same.
     * </p>
     *
     * @param obj the object to compare with this City
     * @return true if both cities have the same name and province, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof City)) return false;

        City other = (City) obj;
        return this.city.equals(other.city) && this.province.equals(other.province);
    }

    /**
     * Returns the hash code of this City.
     * <p>
     * The hash code is computed based on both the city name and province name.
     * </p>
     *
     * @return the hash code value for this City
     */
    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (province != null ? province.hashCode() : 0);
        return result;
    }

    /**
     * Returns a string representation of this City.
     * <p>
     * The format is "CityName, ProvinceName".
     * </p>
     *
     * @return the string representation of the city
     */
    @Override
    public String toString() {
        return city + ", " + province;
    }
}
