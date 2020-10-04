package com.company.colections;
import java.util.*;

public class Collection {

    public static void main(String[] args) {
        //HashMap sorteaza dupa value
        //LinkedHashMap nu va fi nici o sortare implicita
        //TreeMap elementele se sorteaza dupa key
        Map<String,Boolean> hashMap = new HashMap<>();
        hashMap.put("first", true);
        hashMap.put("hasCar", true);
        hashMap.put("hasWife", false);
/*

        boolean hasCar = hashMap.get("hasCar");
        System.out.println(hasCar);
*/
        for(Map.Entry<String,Boolean> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            boolean value = entry.getValue();

            System.out.println(key + "-" + value);

        }


        Set<String> hashSet = new LinkedHashSet<>();
        hashSet.add("banana");
        hashSet.add("milk");
        hashSet.add("potato");
        //nu se mai repeta acelasi element in lista
        hashSet.add("potato");

        for(String str : hashSet) {
            System.out.println(str);
        }



    }
}
