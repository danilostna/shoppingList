package br.com.santana.shoppingList.mappers;

import br.com.santana.shoppingList.dto.product.ProductAllDTO;
import br.com.santana.shoppingList.dto.product.ProductPostDTO;
import br.com.santana.shoppingList.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    Product productAllToProduct (ProductAllDTO productDTO);

    ProductAllDTO productToProductAll (Product product);

    Product productPostToProduct (ProductPostDTO productDTO);

    ProductPostDTO productToProductPost (Product product);
}
