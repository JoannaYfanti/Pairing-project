package com.brightstraining.WebAppDemo.WebAppDemo;

import org.springframework.stereotype.Service;

@Service
public class Incrementer {
    int counter = 0 ;
//    String name ;
    public int getTimes(String name){
//        if(!(this.name.equals(name))){
//            counter = 0 ;
//        }
        counter++;
        return counter;
    }

}
