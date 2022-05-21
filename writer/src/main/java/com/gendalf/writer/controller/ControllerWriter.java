package com.gendalf.writer.controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/writer/news")
public class ControllerWriter {

    @PostMapping
    public String createNews() {
        return "New news were created";
    }

    @PutMapping
    public String updateNews() {
        return "News were updated";
    }

    @PatchMapping
    public String dynamicUpdateNews() {
        return "News were updated dynamic";
    }

    @DeleteMapping
    public String deleteNews() {
        return "News were deleted";
    }

    @GetMapping("/news")
    public String getAllNews(){
        return "NEWs for today";
    }


}
