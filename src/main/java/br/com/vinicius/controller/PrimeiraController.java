package br.com.vinicius.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {
    @GetMapping("/primeiroMetodo/{id}")
    // Route params
    public String primeroMetodo(@PathVariable String id) {
        return "o parâmetro é " + id;
    }

    @GetMapping("/metodoComQueryParams")
     // Query params
	public String metodoComQueryParams(@RequestParam String id) {
        return "o parâmetro com metodoQueryParams é " + id;
	} 

    @GetMapping("/metodoComQueryParams2")
     // Query params com mais parâmetros
	public String metodoComQueryParams2(@RequestParam Map<String, String> allParams) {
        return "o parâmetro com metodoQueryParams é " + allParams.entrySet();
	} 
}
