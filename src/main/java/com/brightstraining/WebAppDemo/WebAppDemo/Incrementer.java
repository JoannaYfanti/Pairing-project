package com.brightstraining.WebAppDemo.WebAppDemo;

import org.springframework.stereotype.Service;

@Service
public class Incrementer {
    int counter = 0 ;
    public int getTimes(){
        counter++;
        return counter;
    }
}
