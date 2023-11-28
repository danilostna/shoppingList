package br.com.santana.shoppingList.service;

import br.com.santana.shoppingList.dto.product.ProductAllDTO;
import br.com.santana.shoppingList.mappers.ProductMapper;
import br.com.santana.shoppingList.model.Product;
import br.com.santana.shoppingList.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor()
public class ProductService {
    private ProductRepository productRepository;

    private ProductMapper productMapper;

    public ProductAllDTO save(Product product){

        Product saved = productRepository.save(product);
        System.out.println("Produto Salvo");
        return productMapper.productToProductAll(saved);
    }

    public ProductAllDTO byName(String name) {
        Optional<Product> byName = productRepository.findByName(name);

        return byName.map(p -> productMapper.productToProductAll(p))
                .orElse(null);
    }

    public List<ProductAllDTO> personalized() {
        List<Product> products = productRepository.queryPersonalizada();

        return products.stream()
                .map(p -> productMapper.productToProductAll(p))
                .collect(Collectors.toList());
    }

    public List<ProductAllDTO> list() {
        List<Product> allProducts = productRepository.findAll();
        return allProducts.stream()
                .map(p -> productMapper.productToProductAll(p))
                .collect(Collectors.toList());
    }
}
