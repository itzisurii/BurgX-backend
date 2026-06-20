package edu.iCET.service;

import edu.iCET.model.dto.ProductDTO;
import edu.iCET.model.entity.Product;
import edu.iCET.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<ProductDTO> getAllProducts() {

        List<ProductDTO> productDTOS = new ArrayList<>();

        List<Product> products = productRepository.findAll();

        for (Product product : products) {

            productDTOS.add(new ProductDTO(
                    product.getId(),
                    product.getName(),
                    product.getDescription(),
                    product.getPrice(),
                    product.getImageUrl(),
                    product.isActive(),
                    product.getCategoryName()
            ));
        }

        return productDTOS;

    }

    public ProductDTO getProduct(String name) {
        return null;
    }
}
