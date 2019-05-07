package com.quanglinhit.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndCollect {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "nodejs", "johnbaron");

        List<String> result = lines.stream()                    // convert list to stream
                .filter(line -> !"johnbaron".equals(line))      // we dont like johnbaron
                .collect(Collectors.toList());                  // collect the output and convert stream to a List

        result.forEach(System.out::println);                    // output : spring, node

    }

}
