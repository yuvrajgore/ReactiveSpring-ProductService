package com.syg.productservice.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDto {
    private String id;
    private String description;
    private Integer price;

    public ProductDto(String description, int price) {
        this.description = description;
        this.price = price;
    }
}
