package com.codemerchant.springbootcrudapp.service;

import com.codemerchant.springbootcrudapp.entity.Product;
import com.codemerchant.springbootcrudapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    //saving one product
    public Product saveProduct(Product product) {
        return productRepository.save(product);


    }

    //saving a list of products
    public List<Product> saveProducts(List<Product> products) {
        return productRepository.saveAll(products);

    }

    //getting list of all the products
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    //getting product by id
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElse(null);
    }

    //getting product by name
    public Product getProductByName(String name) {
        return productRepository.findByName(name);
    }

    public String deleteProduct(Long id) {
        productRepository.deleteById(id);

        return "product removed" + id;
    }

    public Product updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);

        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());

        return productRepository.save(existingProduct);
    }
}



