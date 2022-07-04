package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping
    public  String testController(){
        return "hello world";
    }
    @GetMapping("trace")
    public  String testControllerWithTrace(){
        return "trace log:";
    }
    @GetMapping("/{id}")
    public String testControllerWithId(@PathVariable(required = false)int id){
        return "hi" + id;
    }
    @GetMapping("Param")
    public  String testControllerWithTraceParam(@RequestParam(required = false)int id){
        return "trace log: "+id;
    }

}
