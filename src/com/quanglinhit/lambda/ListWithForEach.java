package com.quanglinhit.lambda;

import java.util.ArrayList;
import java.util.List;

public class ListWithForEach {
    public static void main(String[] args) {
        listWithForEach();
    }

    //    List with forEach
    private static void listWithForEach(){
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        //lambda
        //Output : A,B,C,D,E
        items.forEach(item->System.out.println(item));
        System.out.println("===");

        //Output : C
        items.forEach(item->{
            if("C".equals(item)){
                System.out.println(item);
            }
        });
        System.out.println("===");

        //method reference
        //Output : A,B,C,D,E
        items.forEach(System.out::println);
        System.out.println("===");

        //Stream and filter
        //Output : B
        items.stream()
                .filter(s->s.contains("B"))
                .forEach(System.out::println);
    }
}
