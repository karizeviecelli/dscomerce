package com.devsuperior.uri2602.dto;

import com.devsuperior.uri2602.projections.CustomerMinProjetction;

public class CustomerMinDTO {
    String name;

    public CustomerMinDTO(String name) {
        this.name = name;
    }
    public CustomerMinDTO(CustomerMinProjetction projection) {
        name = projection.getName();
    }

    public CustomerMinDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    }

    @Override
    public String toString() {
        return "CustomerMinDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
