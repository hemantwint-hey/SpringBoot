package org.example.firstspring;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello/{name}")
    public HelloResponse hello(@PathVariable String name){
        return new HelloResponse("hey man "+name+"get lost");
    }
    @PostMapping("/hello")
    public HelloResponse helloPost(@RequestBody String name){
        return new HelloResponse("hello"+name+"bro");
    }
}
