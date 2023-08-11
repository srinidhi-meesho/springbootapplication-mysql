package com.example.springapplicationmysql.Controller;

import com.example.springapplicationmysql.Entity.Product;
import com.example.springapplicationmysql.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/addProduct")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> saveProducts(@RequestBody List<Product> products) {
        return productService.saveProducts(products);
    }
    @GetMapping("/products")
    public List<Product> GetAllProducts() {
        return productService.getAllProducts();
    }
    @GetMapping("/productById/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }
    @GetMapping("/product/{name}")
    public Product getProductByName(@PathVariable String name) {
        return productService.getProductByName(name);
    }
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }
}
