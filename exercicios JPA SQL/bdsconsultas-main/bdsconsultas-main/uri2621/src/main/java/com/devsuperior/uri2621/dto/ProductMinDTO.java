package com.devsuperior.uri2621.dto;

import com.devsuperior.uri2621.projections.ProductsMinProjection;


public class ProductMinDTO {


    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductMinDTO() {
    }

     public ProductMinDTO( ProductsMinProjection projection) {
    name = projection.getName();
    }


    public ProductMinDTO(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "ProductMinDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
