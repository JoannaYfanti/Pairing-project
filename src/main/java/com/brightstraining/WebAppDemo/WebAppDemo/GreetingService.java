package com.brightstraining.WebAppDemo.WebAppDemo;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getWelcome(String lang, String name) {

        if (lang.equals("es")) {
            return "Hola, Me llamo " + name + ". Τiempos requeridos por " + name + ":";
        } else if (lang.equals("gr")) {
            return "Γεια, με λένε " + name + ". Φορές που κλήθηκε για τον / την " + name + ":";
        } else if (lang.equals("en")) {
            return "Hi, my name is " +name + ". Times called for " + name + ":";
        }
        return "Language not found.";

    }
}
