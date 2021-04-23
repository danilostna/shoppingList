package br.com.santana.shoppingList.service;

import br.com.santana.shoppingList.dto.ProductDTO;
import br.com.santana.shoppingList.mapper.ProductMapper;
import br.com.santana.shoppingList.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {
    ProductMapper productMapper = ProductMapper.INSTANCE;

    public ProductDTO save(Product product){
//        ProductDTO productDTO = new ProductDTO();
//        productDTO.setId(product.getId());
//        productDTO.setName(product.getName());
//        productDTO.setMaxStock(product.getMaxStock());
//        productDTO.setQuantityStock(product.getQuantityStock());

        System.out.println("Produto Salvo");
        return productMapper.toDTO(product);
    }
}
