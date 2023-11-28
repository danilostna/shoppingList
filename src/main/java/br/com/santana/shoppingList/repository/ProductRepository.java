package br.com.santana.shoppingList.repository;

import br.com.santana.shoppingList.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findByName(String name);

    @Query(value = "SELECT p FROM Product p WHERE QUANTITY_STOCK = :quantityStock",
            nativeQuery = true)
    List<Product> queryPersonalizada();
}
