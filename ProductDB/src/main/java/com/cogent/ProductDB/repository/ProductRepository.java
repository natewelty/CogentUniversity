package com.cogent.ProductDB.repository;
import com.cogent.ProductDB.entity.Product;
import org.springframework.data.repository.CrudRepository;
public interface ProductRepository extends CrudRepository<Product,Long> {

}
