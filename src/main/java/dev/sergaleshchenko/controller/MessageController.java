package dev.sergaleshchenko.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sergei Aleshchenko
 */

@RestController
@RequestMapping("/api/messages")
public class MessageController {


    @GetMapping("/hello")
    public String hello() {
        return "Full stack java development with Spring Boot & VueJS";
    }
}
