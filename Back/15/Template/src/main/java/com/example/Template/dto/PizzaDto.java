package com.example.Template.dto;

import com.example.Template.entity.Pizza;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class PizzaDto {
    private Long id;
    private String name;
    private String price;

    public static PizzaDto createPizzaDto(Pizza pizza) {
        return new PizzaDto(
                pizza.getId(),
                pizza.getName(),
                pizza.getPrice()
        );

    }
}
