package ru.learn.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.learn.model.Basket;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BasketDto {
    private List<ProductDto> products;

    public static BasketDto from(Basket basket) {
        return BasketDto.builder()
                .products(ProductDto.from(basket.getProducts()))
                .build();
    }
}