package ru.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.learn.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
