package nus.iss.team1.grabfreshfood.controller;

import nus.iss.team1.grabfreshfood.model.Product;
import nus.iss.team1.grabfreshfood.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class SearchController {
    @Autowired
    private ProductService productService;

    @GetMapping("/search/result")
    public String queryProducts(@RequestParam("query") String query, Model model) {
        //List<Product>products=productService.findProductByQuery(query);
       // model.addAttribute("products",products);
        return "search-page";
    }
}

