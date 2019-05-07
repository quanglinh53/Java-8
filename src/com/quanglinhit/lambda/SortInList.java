package com.quanglinhit.lambda;

import com.quanglinhit.entity.Developer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SortInList {

    public static void main(String[] args) {
        sortInList();
    }

//    sort in List
    private static void sortInList(){
        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer.getSalary());
        }

        System.out.println("After Sort");

//        lambda here!
//        listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());
//        listDevs.sort((o1, o2) -> o1.getAge()-o2.getAge());
//        listDevs.sort((o1, o2)->o1.getName().compareTo(o2.getName()));
        listDevs.sort((o1, o2)->o1.getSalary().compareTo(o2.getSalary()));

        //java 8 only, lambda also, to print the List
        listDevs.forEach((developer)->System.out.println(developer.getSalary()));
    }

    private static List<Developer> getDevelopers() {
        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("mkyong", new BigDecimal("170000"), 33));
        result.add(new Developer("alvin", new BigDecimal("100000"), 20));
        result.add(new Developer("jason", new BigDecimal("80000"), 10));
        result.add(new Developer("iris", new BigDecimal("130000"), 55));

        return result;

    }

}
