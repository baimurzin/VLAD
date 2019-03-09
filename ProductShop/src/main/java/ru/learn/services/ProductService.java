package ru.learn.services;

import ru.learn.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProducts();
}
