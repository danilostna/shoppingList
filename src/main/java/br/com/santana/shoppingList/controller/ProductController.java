package br.com.santana.shoppingList.controller;

import br.com.santana.shoppingList.dto.product.ProductAllDTO;
import br.com.santana.shoppingList.dto.product.ProductPostDTO;
import br.com.santana.shoppingList.mappers.ProductMapper;
import br.com.santana.shoppingList.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor()
public class ProductController {


    private ProductService productService;

    private ProductMapper productMapper;

    @GetMapping("/hello")
    public String hello(){
        return "Hello Products! Evebory all fine?";
    }

    @GetMapping("/list")
    public List<ProductAllDTO> list() {
        return productService.list();
    }

    @GetMapping("/by_name")
    public ProductAllDTO byName(String name) {
        return productService.byName(name);
    }

    @GetMapping("/personalized")
    public List<ProductAllDTO> personalized() {
        return productService.personalized();
    }

    @PostMapping("/create")
    public ProductAllDTO create(@RequestBody ProductPostDTO productPostDTO) {
        return productService.save(productMapper.productPostToProduct(productPostDTO));
    }

}
