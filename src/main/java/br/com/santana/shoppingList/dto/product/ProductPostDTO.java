package br.com.santana.shoppingList.dto.product;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductPostDTO {
    @NotNull
    @Size(min = 1, max = 200)
    private String name;

    @NotNull
    @Max(500)
    private int maxStock;

    @NotNull
    @Max(500)
    private int quantityStock;
}
