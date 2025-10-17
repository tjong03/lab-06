package com.example.code;


/**  * This is a class that defines a City. */
public class City implements Comparable<City> {
    private String city;
    private String province;

    public City(String name, String province) {
        this.city = name;
        this.province = province;
    }


    public String getName() {
        return city;
    }

    public void setName(String name) {
        this.city = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getName()); // this.city refers to the city name
    }

}

