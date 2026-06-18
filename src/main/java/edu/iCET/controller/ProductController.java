package edu.iCET.controller;

import edu.iCET.model.dto.ProductDTO;
import edu.iCET.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public String loadProduct(){

        return "Load Product Controller...";
    }

    @GetMapping("/getAll")
    public List<ProductDTO>getAllProducts(){

        return productService.getAllProducts();
    }

    public ProductDTO getProduct(String name){

        return productService.getProduct(name);
    }

}
