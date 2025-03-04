package com.stanley.xie.behavioral.iterator;

public class App {

    public static void main(String[] args) {

        var india = new Country("India");
        var poland = new Country("Poland");
        var nigeria = new Country("Nigeria");
        var canada = new Country("Canada");
        var argentina = new Country("Argentina");

        var countries = new CountryCollection(india, poland, nigeria, canada, argentina);
        var countryIterator = new CountryIterator(countries);

        while (countryIterator.hasNext()) {
            var country = countryIterator.next();
            System.out.println(country.getName());
        }
    }

}
