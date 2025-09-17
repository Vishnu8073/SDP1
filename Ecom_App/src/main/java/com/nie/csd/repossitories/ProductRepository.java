package com.nie.csd.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.nie.csd.models.Products;
public interface ProductRepository extends MongoRepository<Products, String> {
}