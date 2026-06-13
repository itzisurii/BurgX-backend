package edu.iCET.model.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Product {

    private String id;
    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private boolean active;
    private String categoryName;

}
