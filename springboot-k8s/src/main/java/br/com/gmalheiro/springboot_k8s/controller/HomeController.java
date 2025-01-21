package br.com.gmalheiro.springboot_k8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/message")
    public String displayMessage () {
        return "Congratulation you successfully deployed your application to kubernetes !!";
    }
}
