package br.com.dio.productcatalog.controller;

import br.com.dio.productcatalog.model.Product;
import br.com.dio.productcatalog.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private ProductRepository productRepository;

    @PostMapping
    public Product create(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id){
        return productRepository.findById(id).orElseThrow();
    }

}
