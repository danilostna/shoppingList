package br.com.santana.shoppingList.service;

import br.com.santana.shoppingList.builder.ProductBuilder;
import br.com.santana.shoppingList.dto.product.ProductAllDTO;
import br.com.santana.shoppingList.mappers.ProductMapper;
import br.com.santana.shoppingList.model.Product;
import br.com.santana.shoppingList.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

//@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
    ProductMapper productMapper = ProductMapper.INSTANCE;

//    @Mock
    private ProductRepository productRepository;

//    @InjectMocks
    private ProductService productService;

//    @Test
    public void whenValidProductThenReturnSavedProduct(){
        //given
        Product product = ProductBuilder.toProduct();
        ProductAllDTO productDTOExpected = productMapper.productToProductAll(product);

        //then
        ProductAllDTO savedProduct = productService.save(product);
        Assertions.assertEquals(productDTOExpected.getName(), savedProduct.getName());
        Assertions.assertEquals(productDTOExpected.getMaxStock(), savedProduct.getMaxStock());
        Assertions.assertEquals(productDTOExpected.getQuantityStock(), savedProduct.getQuantityStock());
    }
}
