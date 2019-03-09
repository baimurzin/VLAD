package ru.learn.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.learn.dto.BasketDto;
import ru.learn.model.Basket;
import ru.learn.model.Product;
import ru.learn.repositories.BasketRepository;
import ru.learn.repositories.ProductRepository;
import ru.learn.repositories.UserRepository;
import ru.learn.services.BasketService;

import java.util.*;

@Service
public class BasketServiceImpl implements BasketService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BasketRepository basketRepository;

    public BasketDto addProduct(Long userId, Long productId) {

        Product product = productRepository.getOne(productId);
        Basket basket = basketRepository.findOneByUser_Id(userId);

        if (basket == null) {
            basket = Basket.builder()
                    .user(userRepository.getOne(userId))
                    .products(new ArrayList<>())
                    .build();
        }

        List<Product> productsOfBasket = basket.getProducts();
        productsOfBasket.add(product);

        basketRepository.save(basket);
        return BasketDto.from(basket);
    }
}