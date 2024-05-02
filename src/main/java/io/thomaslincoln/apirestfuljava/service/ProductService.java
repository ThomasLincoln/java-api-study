package io.thomaslincoln.apirestfuljava.service;

import java.util.List;

import io.thomaslincoln.apirestfuljava.model.Product;

public interface ProductService {
  Product getProductById(Long id);
  void saveProduct(Product product);
  void updateProduct(Product product);
  void deleteProduct(Long id);
  List<Product> getAllProducts();
}
