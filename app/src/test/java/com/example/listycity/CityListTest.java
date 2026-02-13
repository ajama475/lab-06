package com.example.listycity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CityListTest {
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testCountCities() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());

        City city = new City("Toronto", "Ontario");
        cityList.add(city);

        assertEquals(2, cityList.countCities());
    }

    @Test
    void testDelete() {
        CityList cityList = mockCityList();
        City city = mockCity();

        assertEquals(1, cityList.getCities().size());

        cityList.delete(city);

        assertEquals(0, cityList.getCities().size());
        assertFalse(cityList.getCities().contains(city));
    }


}
