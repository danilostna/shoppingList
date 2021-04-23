package br.com.santana.shoppingList.mapper;

import br.com.santana.shoppingList.dto.ProductDTO;
import br.com.santana.shoppingList.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    Product toModel(ProductDTO productDTO);

    ProductDTO toDTO(Product product);
}
