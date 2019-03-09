package ru.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.learn.model.Basket;

public interface BasketRepository extends JpaRepository<Basket, Long> {
    Basket findOneByUser_Id(Long id);
}
