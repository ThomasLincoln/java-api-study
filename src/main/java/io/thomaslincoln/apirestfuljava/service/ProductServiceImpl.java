package io.thomaslincoln.apirestfuljava.service;

import java.util.List;
import java.util.Optional;

import io.thomaslincoln.apirestfuljava.model.Product;
import io.thomaslincoln.apirestfuljava.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;

  @Autowired
  public ProductServiceImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public Product getProductById(Long id) {
    Optional<Product> optionalProduct = productRepository.findById(id);
    return optionalProduct.orElse(null);
  }

  @Override
  public void saveProduct(Product product) {
    productRepository.save(product);
  }

  @Override
  public void updateProduct(Product product) {
    productRepository.save(product);

  }

  @Override
  public void deleteProduct(Long id) {
    productRepository.deleteById(id);
  }

  @Override
  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }
}
