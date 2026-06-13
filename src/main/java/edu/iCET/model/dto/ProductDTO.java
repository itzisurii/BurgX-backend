package edu.iCET.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductDTO {

    private String id;
    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private boolean active;
    private String categoryName;

}
