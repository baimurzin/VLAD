package ru.learn.services;

import ru.learn.dto.BasketDto;

public interface BasketService {

    BasketDto addProduct(Long userId, Long productId);
}
