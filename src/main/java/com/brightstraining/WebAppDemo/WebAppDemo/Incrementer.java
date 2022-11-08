package com.brightstraining.WebAppDemo.WebAppDemo;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Incrementer {
    int counter = 1;

    Map<String, Integer> countName = new HashMap<>();

    public int getTimes(String name) {

        for (String countName : countName.keySet()) {

            if (name.equals(countName)) {

                this.countName.merge(name, counter, Integer::sum);
                return this.countName.get(name);

            }
        }
        countName.put(name, counter);
        return countName.get(name);

    }
}
