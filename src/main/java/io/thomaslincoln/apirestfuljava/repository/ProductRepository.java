package io.thomaslincoln.apirestfuljava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.thomaslincoln.apirestfuljava.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}