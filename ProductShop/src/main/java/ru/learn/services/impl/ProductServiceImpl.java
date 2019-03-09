package ru.learn.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.learn.dto.ProductDto;
import ru.learn.repositories.ProductRepository;
import ru.learn.services.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    public List<ProductDto> getAllProducts() {
        return ProductDto.from(repository.findAll());
    }
}
