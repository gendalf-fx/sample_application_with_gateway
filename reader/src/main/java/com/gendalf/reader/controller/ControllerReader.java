package com.gendalf.reader.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reader")
public class ControllerReader {

    @GetMapping("/news")
    public String getAllNews(){
        return "NEWs for today";
    }
}
