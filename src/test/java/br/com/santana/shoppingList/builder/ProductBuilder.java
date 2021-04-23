package br.com.santana.shoppingList.builder;

import br.com.santana.shoppingList.model.Product;
import lombok.Builder;

@Builder
public class ProductBuilder {

    @Builder.Default
    private static Long id = 1L;

    @Builder.Default
    private static String name = "Produto";

    @Builder.Default
    private static int maxStock = 500;

    @Builder.Default
    private static int quantityStock = 100;

    public static Product toProduct(){
        return new Product(id, name, maxStock, quantityStock);
    }
}
