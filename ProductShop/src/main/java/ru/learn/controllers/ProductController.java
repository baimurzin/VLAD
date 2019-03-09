package ru.learn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.learn.dto.ProductDto;
import ru.learn.services.ProductService;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public String getAllProducts(Model model) {
        List<ProductDto> products = service.getAllProducts();
        model.addAttribute("products", products);
        return "products_view";
    }
}
