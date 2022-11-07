package com.brightstraining.WebAppDemo.WebAppDemo;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebAppController {

    @GetMapping("/hey")
    public ResponseEntity<String> hey(){
        return ResponseEntity.ok("Yeah you did it");

    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Yeah you did it again");

    }

}
