package com.brightstraining.WebAppDemo.WebAppDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebAppController {

    @GetMapping("/hey")
    public ResponseEntity<String> hey() {
        return ResponseEntity.ok("Yeah you did it");

    }

    @GetMapping("/hi")
    @ResponseBody
    public ResponseEntity<String> pair(@RequestParam String name, String food) {
        return ResponseEntity.ok("hello\n" + name + "I like " + food);

    }
    @GetMapping("/escaping")
    public ResponseEntity<String> escaping() {
        return ResponseEntity.ok("<h1>Hi!My name is Ioanna</h1>");
    }

    @PostMapping("/hello")
    public ResponseEntity<String> greating(@RequestParam String name,@RequestParam String city, @RequestParam String food) {
        return ResponseEntity.ok("This is " + name + ", I am from " +city +" and I like to eat " + food);
    }

    @GetMapping("/")
    public ResponseEntity<String> form() {
        return ResponseEntity.ok("<form action=\"/hello\" method=\"POST\">\n" +
                "<input name=\"name\" placeholder=\"Your name\">\n" +
                "<input name=\"city\" placeholder=\"city \">\n" +
                "<input name=\"food\" placeholder=\"A meal\">\n"+
                "<button>Go</button>\n" +
                "</form>");
    }
    private GreetingService greetingService;
    private Incrementer incrementer;
    @Autowired
    public WebAppController(GreetingService greetingService,Incrementer incrementer) {
        this.greetingService = greetingService;
        this.incrementer = incrementer;
    }


    @GetMapping("/greeting")
    public ResponseEntity <String> greeting(String name, String lang){
        String welcome = greetingService.getWelcome(lang, name);
        int counter = incrementer.getTimes(name);
        return ResponseEntity.ok(welcome + counter);
    }
}
