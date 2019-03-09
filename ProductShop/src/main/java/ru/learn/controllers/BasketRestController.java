package ru.learn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.learn.dto.BasketDto;
import ru.learn.services.BasketService;

@RestController
public class BasketRestController {

    @Autowired
    private BasketService basketService;

    @PostMapping("/{user-id}/basket")
    public ResponseEntity<BasketDto> addToBasket(@PathVariable("user-id") Long userId, @RequestParam("productId") Long productId) {
        return ResponseEntity.ok(basketService.addProduct(userId, productId));
    }
}
