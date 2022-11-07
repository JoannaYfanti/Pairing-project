package com.brightstraining.WebAppDemo.WebAppDemo;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping("/pair")
    @ResponseBody
    public ResponseEntity<String> pair(@RequestParam String name, String food){
        return ResponseEntity.ok("Yeah you did it again\n" + name + "I like " + food);

    }
}
