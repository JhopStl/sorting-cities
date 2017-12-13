package org.launchcode;

import org.launchcode.comparators.NameComparator;
import org.launchcode.comparators.PopComparator;
import org.launchcode.comparators.StateComparator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        //call the comparator class of the objects you want to compare (i.e StateComparator
        StateComparator stateComparator = new StateComparator();
        NameComparator comparator = new NameComparator();
        PopComparator popComparator = new PopComparator();
        cities.sort(comparator);
        cities.sort(stateComparator);
        cities.sort(popComparator);

        printCities(cities);

    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
